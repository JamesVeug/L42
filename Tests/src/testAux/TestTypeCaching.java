package testAux;

import helpers.TestHelper;

import static helpers.TestHelper.lineNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import facade.Parser;
import sugarVisitors.Desugar;
import sugarVisitors.InjectionOnCore;
import typeSystem.FillCache;
import ast.Ast.Mdf;
import ast.Ast.Stage;
import ast.ExpCore;
import ast.ExpCore.ClassB.MethodWithType;
import ast.Expression;
import ast.Util.CachedStage;
import ast.Ast.Path;
import ast.ExpCore.ClassB;
import auxiliaryGrammar.Functions;
import auxiliaryGrammar.Norm;
import auxiliaryGrammar.Program;

public class TestTypeCaching {
  @RunWith(Parameterized.class)
  public static class Test1 {
	@Parameter(0) public int _lineNumber;
    @Parameter(1) public String e1;
    @Parameter(2) public String _path;
    @Parameter(3) public String expected;
    @Parameter(4) public boolean expectedCoh;
    @Parameters(name = "{index}: line {0}")
    public static List<Object[]> createData() {
      return Arrays.asList(new Object[][] {
          {lineNumber(),"{a( Outer0::A a) A:{}}","Outer0",
         "[]",true
        },{lineNumber(),"{a( Outer0::A a) A:{}}","A",
         "[]" ,true

        },{lineNumber(),"{method Void abstractMeth() }","Outer0",
         "[]"  ,false
     
       },{lineNumber(),"{a( Outer0::A a, var Outer0::B b) A:{}  B:{}}","Outer0",
        "[]",true
             //interface inside
       },{lineNumber(),"{interface method Void m() A:{interface <:Outer1}}","Outer0::A",
         "[Outer1::method Void m()]"
          ,true
       //check normal from
       },{lineNumber(),"{interface method Outer0::A m() A:{interface <:Outer1}}","Outer0::A",
      "[Outer1::method Outer1::A m()]"
             ,true
           //interface outside
       },{lineNumber(),"{interface <: Outer0::A A:{interface method Outer0 m() }}","Outer0",
      "[Outer0::A::method Outer0::A m()]"
         ,true
       //two interfaces implemented
       },{lineNumber(),"{interface <: Outer0::A, Outer0::B A:{interface method Outer0 ma() }##less ^## B:{interface method Outer0 mb() }}","Outer0",
          "[Outer0::A::method Outer0::A ma(), Outer0::B::method Outer0::B mb()]"
           ,true
           //two interfaces implemented nested simple
         },{lineNumber(),"{interface <: Outer0::A, Outer0::A::B A:{interface method Outer0 ma()  B:{interface method Outer0 mb() }}}","Outer0",
             "[Outer0::A::method Outer0::A ma(), Outer0::A::B::method Outer0::A::B mb()]"
             ,true
             //two interfaces implemented nested transitive
           },{lineNumber(),"{interface <: Outer0::A A:{interface<: Outer0::B method Outer0 ma()  B:{interface method Outer0 mb() }}}","Outer0",
               "[Outer0::A::method Outer0::A ma(), Outer0::A::B::method Outer0::A::B mb()]"
               ,true
               //good self diamond//TODO: may become not well formed.
       },{lineNumber(),"{interface <: Outer0::B, Outer0::B B:{interface method Outer0 mb()}}","Outer0",
         "[Outer0::B::method Outer0::B mb()]"
          ,true
          //good standard diamond
       },{lineNumber(),"{interface <: Outer0::A, Outer0::B A:{interface <:Outer1::C } B:{interface <:Outer1::C } C:{interface method Outer0 mc()}}","Outer0",
          "[Outer0::C::method Outer0::C mc()]"
          ,true
          //check transitive plusness
       },{lineNumber(),"{A:{ T:{method Void ()} Cell:{interface  method Void #inner(Outer1::T a, Outer1::Cell b)  } } }","Outer0::A::Cell",
       "[]"
          ,true
          
       }});}
    @Test
    public void testAllSteps() {
      ClassB cb1=(ClassB)(Desugar.of(Parser.parse(null,e1)).accept(new InjectionOnCore()));
      Program p=Program.empty();
      Path path=Path.parse(_path);
      FillCache.computeInheritedDeep(p, cb1);
      FillCache.computeStage(p, cb1);
      CachedStage stg = Program.extractCBar(path.getCBar(), cb1).getStage();
      Assert.assertEquals(expectedCoh, stg.isCoherent());
      Assert.assertEquals(expected,stg.getInherited().toString());
    }
    }
}