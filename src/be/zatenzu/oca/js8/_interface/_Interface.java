// $Id$
package be.zatenzu.oca.js8._interface;

/**
 *
 * - Interface cannot be instantiated directly
 * - Interface is not required to have any method
 * - Interface can extend one or more interfaces
 * - Interface may not be final
 * - Interface must be public or default access
 * - abstract modifier is implicit
 * - Private, protected or final Interface is forbidden
 * - All non-default methods in an interface are assumed to have modifiers
 * abstract and public in their definition. Therefore, marking a method as
 * private, protected, or final will trigger compiler errors as these are
 * incompatible with the abstract and public keywords
 * - Interface cannot extend class
 * - Interface cannot implement interface
 * - Interface doesn't extend Object.
 */
public /**abstract (implicit) **/ interface _Interface
{
  /*
  static {
    System.out.println("Static blocks are forbidden in interface");
  }
  {
    System.out.println("Blocks are forbidden in interface");
  }
  */


  /**  interface variables are always constants so public static final are implicit!!**/
  /** only public, static final, nothing else **/
  public static final int MY_CONST = 1;
  public static int MY_CONST_A = 1;
  public int MY_CONST_B = 1;
  int MY_CONST_C = 1;
  
  /** Methods **/
  void myMethod1();//-> This is a public abstract method!
  public abstract void myMethod2();
  /**public and abstract are implicit**/
  
//  void myNonAbtractMethod(){}; --> Forbidden, only abstract method in interface! (expected default and static methods)

  //static method is allowed
  static boolean myStaticMethodInInterface(){
    return true;
  };
  /** static methods are implicitly public **/

  /** Methods are (abstract and public) or (public static) **/
}
//can have more than one interface per file but only one public
interface Blabla{}