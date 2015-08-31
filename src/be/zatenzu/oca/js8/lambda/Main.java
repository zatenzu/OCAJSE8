package be.zatenzu.oca.js8.lambda;

/**
 * Created by tda on 19/08/2015.
 */
public class Main{

  /**
   * - Doesn't work with abstract class
   * - Works only with functional interface (only one method)
   *
   */

  //(Personne p) -> {return p.getAge() > 30;}
  //or
  //p -> p.getAge() > 30
  //if {} then return and ; required

  //if no parameter
//  () -> true

  //If the test method has 2 parameters (Personne and String)
  //(Personne p, String s) -> {return p.getAge() > 30 && s.equals("");}
  //or
  //(p,s) -> p.getAge() > 30 && s.equals("")

  //If multi line abstract method
//  (p,s) -> {System.out.println("Hello lambda"); return p.getAge() > 30 && s.equals("");}

  //if local var
//  (p,s) -> {int i = 0; return p.getAge() > 30 && s.equals("");}
}