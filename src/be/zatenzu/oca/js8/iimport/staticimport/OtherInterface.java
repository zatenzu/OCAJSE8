package be.zatenzu.oca.js8.iimport.staticimport;

/**
 * Created by tda on 10/10/2015.
 */
public interface OtherInterface{

  String myVar = "MY_IMPLICIT_PUBLIC_STATIC_FINAL_VAR";

  void myPublicAbstractMethod();
  default void myPublicDefaultMethod(){}
  static void myPublicStaticMethod(){}

}
