package be.zatenzu.oca.js8.gc;

/**
 * Created by tda on 1/08/2015.
 */
public class Main{

  public static void main(String[] args){
    //call the garbage collector
    //no guaranteed to run!
    System.gc();
    //or
    Runtime.getRuntime().gc();

    /** Eligible objects for gc are **/
    // - Objects who are no references
    // - References gone out of scope

    //finalize is called when the object is eligible for gc
    //the program can end before finalize is executed!
    //so finalize could not be called.

  }

}
