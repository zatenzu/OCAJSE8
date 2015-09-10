package be.zatenzu.oca.js8._interface;

/**
 * Created by tda on 19/08/2015.
 */
public interface DefaultInterface{

  /**
   * - A default method may only be declared within an interface and not within a class or abstract class.
   * - A default method must be marked with the default keyword. If a method is marked as default, it must provide a method body.
   * - A default method is not assumed to be static, final, or abstract, as it may be used or overridden by a class that implements the interface.
   * - Like all methods in an interface, a default method is assumed to be public and will not compile if marked as private or protected.
   * - If a class implements two interfaces that have default methods with the same name and signature, the compiler will throw an error
   */
  public default void test(){};
  default void test2(){};//yes, It's a public method
}

interface DefaultInterface2 extends DefaultInterface{

  //can override default method
  @Override
  default void test2(){};//this is a public method
}