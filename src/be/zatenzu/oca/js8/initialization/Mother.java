package be.zatenzu.oca.js8.initialization;

/**
 * Created by tda on 23/08/2015.
 */
public class Mother{
  static{System.out.println("MotherStaticBlock");}

  {System.out.println("this bloc is never called if no instance is created");}

  public Mother(){
    System.out.println("Mother");
  }
}