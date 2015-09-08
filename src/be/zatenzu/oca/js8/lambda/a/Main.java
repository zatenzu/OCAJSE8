package be.zatenzu.oca.js8.lambda.a;

import be.zatenzu.oca.js8.lambda.a.Personne;
import be.zatenzu.oca.js8.lambda.a.Predicate;
import be.zatenzu.oca.js8.lambda.a.Predicate2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tda on 19/08/2015.
 */
public class Main{

  public static void main(String[] args){
    //anonymous class
    process(genList(), new Predicate<Personne>(){
      @Override
      public boolean test(Personne personne){
        return personne.getAge() < 30;
      }

//      @Override
//      public boolean test1(Personne personne){
//        return false;
//      }
    });

    //lambda with functional interface
    process(genList(), p -> p.getAge() < 30);
  }

  public static List<Personne> genList(){
    List<Personne> personnes = new ArrayList<>();

    //Thomas
    Personne thomas = new Personne("Thomas", "Dardenne", 29);
    //Benoit
    Personne benoit = new Personne("Benoît", "Dubru", 30);
    //Jonhanna
    Personne johanna = new Personne("Johanna", "Otto", 31);
    //Clarisse
    Personne clarisse = new Personne("Clarisse", "Van Hoye", 32);

    personnes.add(thomas);
    personnes.add(benoit);
    personnes.add(johanna);
    personnes.add(clarisse);

    return personnes;
  }


//  public static void process2(List<Personne> personnes, Predicate2<Personne> predicate){
//    for(Personne p : personnes){
//      if(predicate.test(p)){
//        p.print();
//      }
//    }
//  }

  public static void process(List<Personne> personnes, Predicate<Personne> predicate){
    for(Personne p : personnes){
      if(predicate.test(p)){
        p.print();
      }
    }
  }

}
