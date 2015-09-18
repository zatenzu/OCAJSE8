package be.zatenzu.oca.js8.objects;

/**
 * Created by tda on 1/08/2015.
 */
public class Main{

  public static void main(String[] args){

    //Objects are stored in the heap
    //Object references are stored on the stack

    /** == **/
    String s = "1";
    StringBuilder sb = new StringBuilder("1");
//  if(s == sb){}// Cannot compare reference of two different object types
    NumberFormatException numberFormatException = new NumberFormatException();
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
    if(numberFormatException == illegalArgumentException){}//allowed because NFE is-a IAE
    //Wrappers
    Integer i = new Integer(0);
    Integer ii = new Integer(0);
    System.out.println(ii == i);//true because wrappers compare its primitive value
  }

  /** finalize */
  @Override
  protected void finalize() throws Throwable{
    //May be called when the gc collect this object
    //Never be called a second time
  }

}
