package be.zatenzu.oca.js8.nullvalue;

public class Null{

  static Integer myStaticInteger;
  /**
   * - A null can be cast to anything without causing a NullPointerException
   * - Unboxing can cause a NullPointerException
   * - If null is passed to equals, false should be returned
   * - If several methods with identical name but with different parameter type, casting null is required to
   * chose which method will be call, excepted if parameter type have inheritance link. See below for examples
   * - static members can be called on null var.
   */

  public static void main(String[] args){
    System.out.println(null == null);//true
//    testNull(null);//casting null is required
    testNull2(null);//String extends Object, the subtype is chosen. No casting required
    testNull3(null);//Warning! Don't apply same rules as overloading.
    // Integer... is var args but it's extends Object. So var args is chosen.

    Null nullVar = null;
    System.out.println(nullVar.myStaticInteger);//just null, not NPE
  }

  static void testNull(String s){}
  static void testNull(StringBuilder builder){}

  static void testNull2(Object s){}
  static void testNull2(String o){}

  static void testNull3(Object s){}
  static void testNull3(Integer... o){}
}