package be.zatenzu.oca.js8.statements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by tda on 2/08/2015.
 */
public class For{

  /**
   * For statement is one of the three loop statements
   */
  public static void main(String[] args)
  {
    /**
     * First for loop type
     */
    /*
    for(initialization; Boolean_expression; update)
    {
       //for loop body
    }

    1) initialization step, only once. Any loop control variable can be initialized here.
    2) Boolean expression is evaluated at each iteration. If is true, the body is executed, false
    the flow control go after the for statement.
    3) After the body of the loop executes, the flow control jump to the update statement.
    Any loop control variable can be updated here, and more (new instance of external loop variable etc ..)
    4) Boolean expression is evaluated again etc ...
 */
    // examples
    System.out.println("First type for loop exemple 1");
    for(int x = 1; x < 10; x++) {
      System.out.print("x : " + x );
    }

    System.out.println("\nFirst type for loop exemple 2");
    String f;
    for(int x = 1, y = 2; (x+y) < 20; x=x+3, y++, y++, f = new String()) {
      System.out.print("x : " + x );
      System.out.print("\t");
      System.out.print("y : " + y );
      System.out.print("\n");
    }

    /** You can have only one boolean expression! **/
//    for(int i = 0; i < 2, i > 10; i++){}//forbidden

    /** Only one type in the initialization block */
//    for(int i = 0, int y = 0; true; i++)
    //but
    for(int i = 0, y = 0; i < 3; i++, y++){}

    /**
     * Special for loop
     */
    /*
    for(;;){
      //infinit for loop
    }

    for(int i = 0;;i++){
      //infinit for loop
    }

    for(int i = 1; i < 0;i++){
      //infinit for loop
    }
    ==> because there is no boolean expression or the boolean expression will be never true
    */
      //legal
    int gg = 3;
    for(;gg < 10;){
      gg++;
    }

    gg = 0;
    int ggg=0;
    for(;gg < 10;)
      do{
        gg++;
        System.out.println("For loop without curly brace");
      }while(gg < 10);
    //With for loop without braces, only on statement is in the loop body
    // Warning to multi lines statements!

    /**
     * Second for loop type: for each or enhanced for statement
     * for(declaration : expression)
     */
    //For each loop is used to iterate a Iterable or an array.
    List<String> strings = new ArrayList<String>();
    for(String s : strings){
      System.out.println(s);
    }

    //is the same than
    for(Iterator<String> i = strings.iterator(); i.hasNext();){
      System.out.println(i.next());
    }

    //with arrray
    int[] intTab = {1,2,3,};
    for(int i : intTab){
      System.out.println(i);
    }

    //is the same than
    for(int i = 0; i < intTab.length ; i++){
      System.out.println(intTab[i]);
    }


    /**
     * /!\ hasNext() doesn't take the next element! -> next();
     */

    /**
     * /!\
     */
    List<String> suits = new ArrayList();
    suits.add("A");
    suits.add("B");
    List<String> ranks = new ArrayList();
    ranks.add("X");
    ranks.add("Y");
    ranks.add("Z");
    List<String> sortedDeck = new ArrayList();

    //next() with hasNext == false -> NoSuchElementException (RT)
//    for (Iterator<String> i = suits.iterator(); i.hasNext(); )
//        for (Iterator<String> j = ranks.iterator(); j.hasNext(); )
//            sortedDeck.add(new String((i.next() + j.next())));

    for (Iterator<String> i = suits.iterator(); i.hasNext(); ){
      String s = i.next();
      for (Iterator<String> j = ranks.iterator(); j.hasNext(); )
        sortedDeck.add(new String((s + j.next())));
    }
  }

}
