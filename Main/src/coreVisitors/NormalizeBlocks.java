package coreVisitors;

import java.util.Optional;
import java.util.Set;

import tools.Map;
import ast.Ast;
import ast.ExpCore;
import ast.ExpCore.Block;
import ast.ExpCore.Block.Catch;
import ast.ExpCore.Block.Dec;

public class NormalizeBlocks extends CloneVisitor{
  
  private Dec isTxEx(Block s){
    if(s.get_catch().isPresent()){return null;}
    if(s.getDecs().size()!=1){return null;}
    Dec dec=s.getDecs().get(0);
    if(!(s.getInner() instanceof ExpCore.X)){return null;}
    String x=((ExpCore.X)s.getInner()).getInner();
    if(!x.equals(dec.getX())){return null;}
    return dec;       
    }
  public ExpCore visit(Block s) {
    Optional<Catch>c=s.get_catch();
    //I think reduction take care of catch already
    assert !c.isPresent() || c.get().getOns().size()>0;
    if(c.isPresent() && c.get().getOns().size()==0){
      c=Optional.empty();
    }
    if(!c.isPresent()&& s.getDecs().size()==0){ //(e)-->e
      return s.getInner().accept(this);
    }
    Dec decOut=this.isTxEx(s);
    if(decOut!=null && decOut.getE() instanceof Block){//(T x=(T y= e y) x)->(T y= e y)
      Dec decIn=this.isTxEx((Block)decOut.getE());
      if(validDoubleWrap(decOut,decIn)){return decIn.getE().accept(this);}
    }
    return super.visit(s.with_catch(c));
    }

  private boolean validDoubleWrap(Dec decOut, Dec decIn) {
    if(decIn==null){return false;}
    if(decOut.getT().equals(decIn.getT())){
      Set<String> fvIn = coreVisitors.FreeVariables.of(decIn.getE());
      if(fvIn.contains(decOut.getX())){return false;}
      return true;//to put breakpoint
    }
    return false;
  }
  public static ExpCore of(ExpCore e) {
    return e.accept(new NormalizeBlocks());
  }  
}