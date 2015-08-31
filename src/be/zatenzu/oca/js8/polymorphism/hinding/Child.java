package be.zatenzu.oca.js8.polymorphism.hinding;

/**
 * Created by tda on 17/08/2015.
 */
public class Child extends Mother{

  //hide s from mother
  String s = "I'm a child";

  public void print(){
    System.out.println(s);
    System.out.println(super.s);
  }

}
