package be.zatenzu.oca.js8.access.privateaccess;

/**
 * Created by tda on 14/08/2015.
 */
public class Main{
  //must be in the same class
  //inner class can access to private members

  private int i = 0;

  public static void main(String[] args){
    Main m = new Main();
    System.out.println(m.i);//ok I'm in the same class
  }
}
