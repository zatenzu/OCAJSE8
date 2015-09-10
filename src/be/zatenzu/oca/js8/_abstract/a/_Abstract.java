// $Id$
package be.zatenzu.oca.js8._abstract.a;

//public abstract final class -> stupid and forbidden
// final cannot be extend and abstract is made to be extend
public abstract class _Abstract
{
  /**
   *
   * Rules:
   * - Abstract class cannot be instantiated directly(new is forbidden expected for anonymous class)
   * - Abstract class may be defined with any number, including zero, of abstract and non abstract method
   * - Abstract class may not be marked as private, protected or final
   * - An abstract class that extends another abstract class inherits all of its abstract
   * methods as its own abstract methods
   * - The first concrete class that extends an abstract class must provide an implementation for all of the inherited
   * abstract methods
   *
   * - Abstract methods may only be defined in abstract class
   * - Abstract methods may not be declared private, final or static
   * - Abstract methods must not provide a method body/implementation in the abstract class for which is declared.
   * - Implementing an abstract method in a subclass follows the same rules for overriding a method.
   * */
  //only with one abstract method, and your class must be abstract too
  public abstract void myMethod();
  
  // private and abstract, forbidden
//  private abstract void myMethod1();
  
  //abstract and final, forbidden
//  public abstract final void myMethod1();
  
  //abstract + static -> forbidden
//  public abstract static void myMethod2();
  
  //default package and protected is allowed
  abstract void myMethod2();
  protected abstract void myMethod3();

  //can have static method
  private static void myStaticMethod(){}
  
  public static void main(String[] args)
  {
    /** abstract class cannot be instantiated **/
//    new _Abstract(); --> forbbiden, -> compiler error
    
    /** Anonimous class based on abstract class -> ok **/
    new _Abstract()
    {
      
      @Override
      public void myMethod()
      {
        // TODO Auto-generated method stub
        
      }
      @Override
      public void myMethod2()
      {
        // TODO Auto-generated method stub
        
      }

      @Override
      protected void myMethod3(){

      }
    };
  }
}