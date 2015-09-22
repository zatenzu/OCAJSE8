// $Id$
package be.zatenzu.oca.js8.constructor;

public class Constructor
{
  /**
   * Constructor rules:
   * - The first statement of every constructor is a call to another constructor within the class
   * using this(), or a call to a constructor in the direct parent class using super().
   *
   * - The super() or this() call may not be used after the first statement of the constructor.
   *
   * - If no super() call is declared in a constructor, or this(), Java will insert a no-argument super()
   * as the first statement of the constructor.
   *
   * - If the parent doesn't have a no-argument constructor and the child doesn't define any constructors,
   * the compiler will throw an error and try to insert a default no-argument constructor into the child class
   *
   * - If the parent doesn't have a no-argument constructor, the compiler requires an explicit call to a parent
   * constructor in each child constructor.
   *
   *
   * Default constructor is the constructor provided by the compilator.
   * If you write MyClass(){}, it's not a default constructor.
   *
   */
//  final blank var must initialize in each constructors
  final int j;
  
  static{
    System.out.println("This block runs, one time before constructor call");
  }
  
  {
    System.out.println("This block runs before each constructor call");
  }
  //All access modifiers are allowed
  //Constructor must have the same name as the Class
  public Constructor(){
    System.out.println("This block runs during constructor call");
    j=0;
  }
  //if no constructor is defined in the class, this default constructor is implicit!

  //the auto-created(implicit default constructor) constructor will:
  // -have the same access modifier than the class
  // -no-args
  // -have as first line super();ex Constructor(){super();}
  
  //can be protected
  protected Constructor(int i){
    j=0;
    System.out.println("This block runs during constructor call");
  }
  
  //can be default package
  Constructor(float i){j=0;}
  
  //can be private
  private Constructor(int i, int a){j=0;}
  
  //can have var-arg parameter
  public Constructor(String... args){j=0;}
  
//Constructor can't ever have a return type.
//Here, there is a return type but it's not a constructor, it's a badly named method.
  public void Constructor(){}//it's a method !!
  
  //A constructor can't be static!
//  public static Constructor(){};
  
  //A constructor can't be abstract!
//public abstract Constructor(){};
  
  //A constructor can't be final!
//public final Constructor(){};
  
  public static void main(String[] args)
  {
    new Constructor();
    new Constructor(1);
  }
}
