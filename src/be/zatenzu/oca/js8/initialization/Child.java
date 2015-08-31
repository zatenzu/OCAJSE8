package be.zatenzu.oca.js8.initialization;

/**
 * Created by tda on 23/08/2015.
 */
public class Child extends Mother{
  static{System.out.println("ChildStaticBlock");}
  public Child(){
    System.out.println("Child");
  }
}
