package be.zatenzu.oca.js8.gc;

/**
 * Created by tda on 1/08/2015.
 */
public class Main{

  public static void main(String[] args){
    //call the garbage collector
    //no guaranteed to run!
    System.gc();

    /** Eligible objects for gc are **/
    // - Objects who are no references
    // - References gone out of scope

  }

}
