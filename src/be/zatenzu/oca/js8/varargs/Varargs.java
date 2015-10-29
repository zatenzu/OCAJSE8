package be.zatenzu.oca.js8.varargs;

/**
 * Created by tda on 11/08/2015.
 */
public class Varargs{

  /*  Legal */
//  public void myMethod(){};
  public void myMethod(String... args)
  {
    System.out.println(args.length);
  };
  public void myMethod(int a ,String... args){};
  public void myMethod1(int a ,String ... args){}; //with space between String and ellipsis(...)

  /* Illegal
  public void myMethod(String[] args){};//Array is not varargs (but main(String[] or String...) It's the same) ...
  public void myMethod(String args...){};//Ellipsis must be after parameters type
  public void myMethod(String... args, int a){};//var-args must be the last parameter
  public void myMethod(String... args, int... as){};//Only one var-args parameter
  */


  /*public void myMethod(String[] args)
  {
    System.out.println(args.length);
  };*==> Already defined!*/

  public static void main(String[] args){
    Varargs varargs = new Varargs();
    varargs.myMethod("1", "2");//it's varargs
    varargs.myMethod(new String[1]);
    varargs.myMethod();//print 0 because java create an empty array to call myMethod! Big trap!
//    varargs.myMethod(null);//varargs '=' array '=' Object
  }
}
