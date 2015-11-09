// $Id$
package be.zatenzu.oca.js8.constructor;

public class SubClass extends Mother
{
  static int i;
  int j;
  /** Constructors are never inherited! **/
  
  //the auto-created(implicit default constructor) constructor will:
  // -have the same access modifier than the class
  // -no-args
  // -have as first line super();
  
  //if you define a constructor, the implicit
  //default constructor disappears!
  
  //compilation error because the compilator want to insert super()
  //at the first line of this constructor but the default no-args Mother
  //constructor doesn't exist and he cannot add it because there is already
  //a constructor in the Mother class.
  protected SubClass(int i){
    System.out.println("SubClass constructor");
  }
  
  public SubClass(){
    this(i);//or super(1); must be the first line of the constructor body
//    this(j);//j isn't static, compilation error
    System.out.println("SubClass constructor");
  }
}
