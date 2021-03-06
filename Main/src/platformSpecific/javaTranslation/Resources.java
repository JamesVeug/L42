package platformSpecific.javaTranslation;

import facade.Configuration;
import facade.ErrorFormatter;
import facade.L42;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;

import coreVisitors.CloneVisitorWithProgram;
import coreVisitors.CollectClassBs0;
import coreVisitors.CollectPaths0;
import coreVisitors.FromInClass;
import coreVisitors.IsCompiled;
import platformSpecific.fakeInternet.PluginType;
import platformSpecific.javaTranslation.Resources.Error;
import sugarVisitors.ToFormattedText;
import tools.Assertions;
import ast.Ast;
import ast.ErrorMessage;
import ast.ErrorMessage.PathNonExistant;
import ast.ErrorMessage.TypeError;
import ast.ErrorMessage.UserLevelError;
import ast.ExpCore;
import ast.Ast.Doc;
import ast.Ast.NormType;
import ast.Ast.Path;
import ast.Ast.Position;
import ast.Ast.SignalKind;
import ast.Ast.Stage;
import ast.ExpCore.ClassB;
import ast.Util.CachedStage;
import auxiliaryGrammar.EncodingHelper;
import auxiliaryGrammar.Functions;
import auxiliaryGrammar.Program;

public class Resources {
  public static final ErrorMessage.PluginActionUndefined notAct=new ErrorMessage.PluginActionUndefined(-2);
  public static final ErrorMessage.PluginActionUndefined actInEnd=new ErrorMessage.PluginActionUndefined(-1);
  private static final HashMap<String,Object> usedRes=new HashMap<>();
  /*public static class TypeMap{
    HashMap<String,Object> types=new HashMap<>();
    public void put(String k,Object val){types.put(k,val);}
    public<T> T get(Class<T> clazz,String k){
      Object val=types.get(k);
      if(val!=null){return (T)val;}
      return (T)new Revertable(){
        public ast.ExpCore revert() {
          return ast.Ast.Path.parse(k);
          }
        };
      }
    }
  public static final TypeMap types=new TypeMap();
  */
  public static String submitRes(Object cb){
    HashSet<String> hs=new HashSet<>(usedRes.keySet());
    String newK=Functions.freshName("key", hs);
    assert !usedRes.containsKey(newK);
    usedRes.put(newK,cb);
    return newK;
    }
  private static Program p;
  public static Program getP(){
    assert p!=null;
    return p;
    }
  public static <T> T withPDo(Program _p,Supplier<T> action){
    if(p!=null){throw new IllegalAccessError();}
    try{
      p=_p;
      return action.get();
      }
    finally{p=null;}
    }

  public static String pKeysString(){
    String result="";
    int[] data=pKeys();
    for(int d:data){result+=","+d;}
    return result;
    }
  public static int[] pKeys(){
    List<ClassB> cs = getP().getInnerData();
    Collections.reverse(cs);
    int[] result=new int[cs.size()];
    for(int i=0;i<cs.size();i++){
       result[i]=System.identityHashCode(cs.get(i).getP());
      }
    return result;
    }
  public static Object getRes(String key,int... ks){
    Object o=usedRes.get(key);
    if(o==null){throw new Error("Invalid resource "+key+" Valid resources are: "+usedRes.keySet());}
    if(!(o instanceof ClassB)){return o;}
    int[] newK = pKeys();
    int common=0;
    while(common<newK.length && common<ks.length){
      if(newK[common]==ks[common]){common++;}
      else{break;}
      }
    int shift=newK.length-common;
    int padding=ks.length-common;
    if(shift==0 && padding==0){return o;}
    List<String>csPadding=new ArrayList<>();
    for(int i=0;i<padding;i++){csPadding.add("Padding"+i);}
    ClassB cb= (ClassB)FromInClass.of((ClassB)o,Path.outer(shift,csPadding));
    //Configuration.typeSystem.computeStage(p, cb);
    return cb;
    }
  public static void clearRes() {
    usedRes.clear();
  }

  @SuppressWarnings("serial")
  private static class L42Throwable extends RuntimeException{
    public final Object unbox; public L42Throwable(Object u){unbox=u;}
    }
  @SuppressWarnings("serial")
  public static class Error extends L42Throwable{
    public String toString() {return "Error["+ unbox +"]";}
    public Error(Object u){super(u);}
    public static Error multiPartStringError(String kind,Object ... map){
      ExpCore.ClassB cb = multiPartStringClassB(kind, map);
      return new Error(cb);
      }
    public static ExpCore.ClassB multiPartStringClassB(String kind, Object... map) throws java.lang.Error {
      List<ExpCore.ClassB.Member> ms=new ArrayList<>();
      assert map.length%2==0;
      ms.add(new ExpCore.ClassB.NestedClass(Doc.empty(),"Kind", EncodingHelper.wrapStringU(kind),null));
      for(int i=0;i<map.length;i+=2){
        String cName=(String)map[i];
        ClassB inner;
        if(map[i+1] instanceof String){inner=EncodingHelper.wrapStringU((String)map[i+1]);}
        else{//for now, just doc.
        Doc docip1=(Doc)map[i+1];
          inner=new ClassB(docip1,Doc.empty(),false,Collections.emptyList(),Collections.emptyList(),Position.noInfo,new CachedStage());
          }
        if(!Path.isValidClassName(cName)){throw Assertions.codeNotReachable("Invalid name in multiPartStringError:"+cName);}
        ms.add(new ExpCore.ClassB.NestedClass(Doc.empty(), cName, inner,null));
      }
      ExpCore.ClassB cb=new ExpCore.ClassB(Doc.empty(), Doc.empty(), false, Collections.emptyList(), ms,Position.noInfo,new CachedStage());
      return cb;
    }
    }
  @SuppressWarnings("serial")
  public static class Exception extends L42Throwable{
    public String toString() {return "Exception["+ unbox +"]";}
    public Exception(Object u){super(u);}
    }
  @SuppressWarnings("serial")
  public static class Return extends L42Throwable{
    public String toString() {return "Return["+ unbox +"]";}
    public Return(Object u){super(u);}
    }
  public static class Void implements Revertable{
    public static final Void instance=new Void();
    public static final Void type=new Void();
    @Override
    public ExpCore revert() {
      return Path.Void();
    }
    }
  public static class Any implements Revertable{
    public static final Any type=new Any();
    @Override
    public ExpCore revert() {return Path.Any();  }}
  public static class Library implements Revertable{
    public static final Library type=new Library();
    @Override
    public ExpCore revert() {return Path.Library();  }}
  public static interface PhI<T>{
    public void commit(T t);
    public void addAction(java.util.function.Consumer<T> r);
    }
  public static interface Revertable{
    public static ast.ExpCore doRevert(Object o){
      if (o instanceof Revertable){return ((Revertable)o).revert();}
      return EncodingHelper.wrapResource(o);
    }
    public ast.ExpCore revert();
  }
  public static boolean isValid(Program p,Object res, Object[] xs) {
    if(L42.trustPluginsAndFinalProgram){
      return true;
      }
    ExpCore ec0=Revertable.doRevert(res);
    List<ExpCore> es=new ArrayList<>();
    for(Object o:xs){
      es.add(Revertable.doRevert(o));
    }
    boolean strict=true;
    for(ExpCore ec:es){
      List<ClassB> cbs = CollectClassBs0.of(ec);
      List<Path> ps = CollectPaths0.of(ec);
      for(ClassB cb:cbs){
        //Configuration.typeSystem.computeStage(p,cb);
        if(cb.getStage().getStage()==Stage.Less ||cb.getStage().getStage()==Stage.None  ){strict=false;}
        }
      for(Path path:ps){
        if(path.isPrimitive()){continue;}
        Stage extracted=p.extractCb(path).getStage().getStage();
        if(extracted==Stage.Less || extracted==Stage.None){strict=false;}
        }
      }
    List<ClassB> cbs = CollectClassBs0.of(ec0);
    for(ClassB cb:cbs){
      Configuration.typeSystem.computeStage(p,cb);
      try{Configuration.typeSystem.checkCt( p, cb);}
      catch(ErrorMessage msg){
        System.err.println("__________PLUGIN error identified_________");
        throw msg;//to breakpoint here
        }
      if(strict && (cb.getStage().getStage()==Stage.Less || cb.getStage().getStage()==Stage.None)){
        return false;
        //throw Assertions.codeNotReachable("try to make this happen, is it possible? it should mean bug in plugin code\n"/*+ToFormattedText.of(ct)*/);
      }
    }
    return true;
  }

  public static ExecutorService pluginThreads=Executors.newCachedThreadPool();
  public static <T> T block(java.util.function.Supplier<T> p){return p.get();}
  public static platformSpecific.javaTranslation.Resources.Void unused=null;

  public static interface PlgClosure<Pt extends PluginType,T>{
    T apply(Pt plg,Object[] xs);
  }
  /**
   * @param plg plugin instance
   * @param cls plugin executor
   * @param xs parameters
   * @return a safe result, or a safe error, or an non-action exception
   */

  public static <Pt extends PluginType,T> T plgExecuteSafe(Program p,Pt plg,PlgClosure<Pt,T> cls,Object ... xs){
    T res=null;
    //for(Object o:xs){assert Functions.verifyMinimalCache(o);}
    for(int i=0;i<xs.length;i++){xs[i]=Functions.setMinimalCache(p, xs[i]);}
    //TODO: sadly the translation process lose this while putting in resources, when fixed, decomment after and check here
    try{
      res=cls.apply(plg, xs);
      res=Functions.setMinimalCache(p, res);
      if(Resources.isValid(p,res,xs)){return res;}
      else{throw Resources.notAct;}
      }
    catch(Resources.Error errF){
      if(Resources.isValid(p,errF.unbox,xs)){throw errF;}
      else{throw Resources.notAct;}
      }
    catch(ErrorMessage.PluginActionUndefined undF){throw undF;}
   //catch(java.lang.Error |RuntimeException msg){//eclipse debugger can not hande it
    catch(AssertionError msg){ throw msg;}
    catch(PathNonExistant msg){throw msg;}//comment this line after testing
    catch(TypeError msg){throw msg;}//comment this line after testing
    catch(ErrorMessage msg){
      System.out.println("###################RES#############");
      System.out.println(res);
      System.out.println("################################");
      UserLevelError err = ErrorFormatter.formatError(p,msg);
      throw Assertions.codeNotReachable("try to make this happen, is it possible? it should mean bug in plugin code\n"+err+"\n---------------\n",msg);
    }
    catch(NullPointerException msg){throw msg;}
    catch(ClassCastException msg){throw msg;}
    catch(RuntimeException msg){
      //throw Resources.notAct;//will be
      throw Assertions.codeNotReachable("try to make this happen, is it possible? it should mean bug in plugin code\n",msg);

      }
    catch(java.lang.Error msg){
      //throw Resources.notAct;//will be
      throw Assertions.codeNotReachable("try to make this happen, is it possible? it should mean bug in plugin code\n",msg);
      }
    catch(Throwable tF){
      //throw Resources.notAct;//will be
      throw new Error(tF);//To debug
      }
    }
  /*public Object bar(Plugin plg,Object e1, Object e2,Callable<Object> conclE){
    return plgExecutor("dbgInfo",null,new Plugin(),
        (plF,xsF)->plF.MsumInt32�xn1�xn2(xsF[0],xsF[1]),
        conclE,e1,e2);
  }*/
  public static <Pt extends PluginType,T> T plgExecutor(String plgCall,Program p,Pt plg,PlgClosure<Pt,T> cls,Callable<T> concl, Object ... es){
    //System.err.println("Executing now."+plgCall);
    Future<T> exe=null;
    try{//for finally
      while(true){//cycle on another plugin supervision
        try{return plgExecuteSafe(p,plg,cls,es);}//call plg
        catch(ErrorMessage.PluginActionUndefined und){
          int wait=und.getWait();
          if(wait<-1){//not call me again: wait until the end and return the result
            return justGetResult(concl, exe);
            }
          //else, we are supervisionating an expression and plg will be called again
          if(exe==null){exe=pluginThreads.submit(concl);}
          justWait(exe, wait);
          }
        }
    }finally{if(exe!=null){exe.cancel(true);}}
  }
  public static <T> void justWait(Future<T> exe, int wait){
    try{
      if(wait!=-1){//timeout
        try{exe.get(wait, TimeUnit.MILLISECONDS);}
        catch(TimeoutException e){}//loop again
        }
      else {exe.get();}
      }
    catch (InterruptedException ie){
      Thread.currentThread().interrupt();
      throw new Error(ie);
      }
    catch (ExecutionException ee){
      if(ee.getCause() instanceof RuntimeException){
        return;
        //DO Nothing, just wait//throw (RuntimeException)ee.getCause();
        }
      throw new Error(ee);
      }
    }
  public static <T> T justGetResult(Callable<T> concl, Future<T> exe){
    try{
      if(exe!=null){return exe.get();}
      return concl.call();
      }
    catch (InterruptedException ie){
      Thread.currentThread().interrupt();
      throw new Error(ie);
      }
    catch (ExecutionException ee){
      if(ee.getCause() instanceof RuntimeException){
        throw (RuntimeException)ee.getCause();
        }
      throw new Error(ee);
      }
    catch (java.lang.Exception exc){
      if(exc instanceof RuntimeException){
        throw (RuntimeException)exc;
        }
      throw new Error(exc);
      }
    }
  public static String nameOf(Ast.Type t) {
    Path p=((NormType)t).getPath();
    return nameOf(p);
    }
  public static String nameOf(Ast.MethodSelector ms) {
    return nameOf(ms.getName(),ms.getNames());
    }
  public static String nameOf(String name, List<String> names) {
    String result="M"+name;
    for(String x:names){result+="�x"+x;}
    return nameOf(result);
    }
  public static String nameOf(Path path) {
    if (path.equals(Path.Any())){return "Object";}
    if (path.equals(Path.Library())){return "Object";}
    if (path.equals(Path.Void())){return "platformSpecific.javaTranslation.Resources.Void";}
    Program p=Resources.getP();
    try{ClassB cb=p.extractCb(path);
    if( cb.getStage().getStage()==Stage.Star && IsCompiled.of(cb)){ return nameOf(path.outerNumber(),path.getCBar()); }
    }catch (ErrorMessage em){}
    return "Object";
    }


  public static Revertable fromHash(int hash,String path){
      return new platformSpecific.javaTranslation.Resources.Revertable(){
        public ast.ExpCore revert() {
          Program p=getP();
          int dept=0;
          while(System.identityHashCode(p.topCb().getP())!=hash){dept++;p=p.pop();}
          return ast.Ast.Path.parse("This"+dept+path);
           }};
      }

  public static String nameOf(int level, List<String> cs) {
    Program p=Resources.getP();
    Position pos=p.getCb(level).getP();
    int hc = System.identityHashCode(pos);//ok, all relevant positions existed together at the same moment.
    assert !pos.equals(Position.noInfo);
    String res="This"+hc;
    //String res="This"+level;
    for(String s:cs){res+="."+s;}
    return nameOf(res);
  }
  public static String nameOf(String s){
      s=s.replace(".","�_");
      s=s.replace("%","�p");
      s=s.replace("#","�h");
      return s;
  }
  public static String name42Of(String javaName){
      String s=javaName;
      s=s.replace("�_",".");
      s=s.replace("�p","%");
      s=s.replace("�h","#");
      return s;
  }

  public static void cacheMessage(L42Throwable err) {
   String s=extractMessage(err);
   L42.messageOfLastTopLevelError=s;
   L42.reconstructedStackTrace=extractTrace(err);
  }
  private static String extractTrace(L42Throwable err){
    StackTraceElement[] st = err.getStackTrace();
    String result="\n";
    for(StackTraceElement si:st){
      if(!si.getMethodName().startsWith("M")){continue;}
      result+=extractClassName(si.getClassName());
      result+=extractMethName(si.getMethodName());
      result+="\n";
    }
    return result;
  }
  private static String extractMethName(String methodName) {
    assert methodName.startsWith("M");
    String end=")";
    if (!methodName.contains("�x")){end="()";}
    methodName=methodName.replaceFirst("�x", "(");
    methodName=methodName.replaceAll("�x", ", ");
    methodName=name42Of(methodName);
    return "."+methodName.substring(1)+end;
  }
  private static String extractClassName(String className) {
    if(className.startsWith("generated.Program42$This0�_")){
      className=className.substring(27);
      className=className.replace("�_", ".");
      className=name42Of(className);
      return className;
    }
    return className;//may be is plugin code?
  }
  private static String extractMessage(L42Throwable err) {
    try{
      Object obj=err.unbox;
      Method toS = obj.getClass().getMethod("MtoS");
      Object s42=toS.invoke(obj);
      Method binaryRepr = s42.getClass().getMethod("MbinaryRepr");
      Object lib=binaryRepr.invoke(s42);
      if( lib instanceof String){return (String)lib;}
      ExpCore.ClassB cb=(ExpCore.ClassB)Revertable.doRevert(lib);
      return EncodingHelper.ensureExtractStringU(cb);//safer that extracting on lib, if the method return numbers or other stuff
      } catch (NoSuchMethodException | SecurityException
         | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
        return "";
      }
  }


}