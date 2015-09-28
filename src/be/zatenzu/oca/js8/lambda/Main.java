package be.zatenzu.oca.js8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by tda on 19/08/2015.
 */
public class Main{

  /**
   * - Doesn't work with abstract class
   * - Works only with functional interface (only one abstract method).
   * - See Predicate interface for test method
   * - See removeIf method from ArrayList
   */

  //(Personne p) -> {return p.getAge() > 30;}
  //or
  //p -> p.getAge() > 30
//  if {} then return(if functional method return something) and ; are required

  //if parameter type is defined, () are required
//  (Personne p) -> p.getAge() > 30

  //if no parameter
//  () -> true

  //If the test method has 2 parameters (Personne and String)
  //(Personne p, String s) -> {return p.getAge() > 30 && s.equals("");}
  //or
  //(p,s) -> p.getAge() > 30 && s.equals("")

  //If multi lines method
//  (p,s) -> {System.out.println("Hello lambda"); return p.getAge() > 30 && s.equals("");}

  //if local var
//  (p,s) -> {int i = 0; return p.getAge() > 30 && s.equals("");}
  public static void main(String[] args){
    /** List removeIf */
    List<String> myList = new ArrayList<String>();
    myList.removeIf(new Predicate<String>(){
      @Override
      public boolean test(String s){
        return false;
      }
    });
    //OR
    myList.removeIf(s -> s == null);
  }

}