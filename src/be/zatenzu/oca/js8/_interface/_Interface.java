// $Id$
package be.zatenzu.oca.js8._interface;

/**
 * 
 * - Interface is a 100% abstract class!
 * - Interface cannot be instantiated directly
 * - Interface is not required to have any method
 * - Interface can extend one or more interfaces
 * - Interface may not be final
 * - Interface must be public or default access
 * - abstract modifier is implicit
 * - Private, protected or final Interface is forbidden
 * - All non-default methods in an interface are assumed to have the modifiers
 * abstract and public in their definition. Therefore, marking a method as
 * private, protected, or final will trigger compiler errors as these are
 * incompatible with the abstract and public keywords
 * - Interface cannot extend class
 * - Interface cannot implement interface
 */
public /** abstract (implicit) **/ interface _Interface
{
  /**  interface variables are always constants so public static final are implicit!!**/
  /** only public, static final, nothing else **/
  public static final int MY_CONST = 1;
  public static int MY_CONST_A = 1;
  public int MY_CONST_B = 1;
  int MY_CONST_C = 1;
  
  /** Methods **/
  void myMethod1();
  public abstract void myMethod2();
  /**public and abstract are implicit**/
  
//  void myNonAbtractMethod(){}; --> Forbidden, only abstract or default method in interface!

  //interface static method must have a body
  public static boolean myStaticMethodInInterface(){
    return true;
  };

  /** Methods can only be (abstract, default or static) and public **/
}
//can have more than one interface per file but only one public
interface Blabla{}