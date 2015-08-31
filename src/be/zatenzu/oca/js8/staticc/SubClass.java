// $Id$
package be.zatenzu.oca.js8.staticc;

public class SubClass extends MotherClass
{
  /** inheritance works with static members!! **/
  public void myMethode(){
    System.out.println(myStaticClassVar);
    myStaticMethodA();
  }
  
  public static void main(String[] args)
  {
    SubClass.myStaticMethodA();
  }

  public static void myStaticMethodA(){}
}
