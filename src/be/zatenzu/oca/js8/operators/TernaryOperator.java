package be.zatenzu.oca.js8.operators;

/**
 * Created by tda on 5/11/2015.
 */
public class TernaryOperator{

  /***************************************/
  /** first ? second : third            **/
  /***************************************/
  /**
   * ref:http://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.25
   *
   * Rules:
   * - The first expression must be of type boolean or Boolean -> Compile-time error
   * - The second and third expression cannot be a void method call -> Compilation error
   * - Autoboxing is applied on second and third
   * - Autounboxing is applied on second and third
   * - Null value can be autoboxing but it will result to NPE at runtime
   * - Short circuit!
   *
   */

  public static void main(String[] args){
    int i = true ? new Integer(0) : new Integer(0);//auto unboxing
    Integer integer = true ? 0 : 1;//auto boxing
    i = true ? 0 : null;//auto boxing of null value(null -> Integer = OK but when null Integer is unboxed to int  -> NPE)
    System.out.println(true ? "true" : "false");
    //true ? System.out.println(true) : System.out.println(false); compilation error because sout returns void
  }

  String t = "";
  //    String s = 250 > 380 ? "Lion" : t = "Tiger";
  String s = 250 > 380 ? "Lion" : (t = "Tiger");
  //because assignment operator < ternary operator

  boolean b = true ? true : false;// boolean expression ? if the expression is true : if the expression is false
  /* double ternary operator  */
  boolean bb = true ? true ? true : false : false;
  //short circuit!
}
