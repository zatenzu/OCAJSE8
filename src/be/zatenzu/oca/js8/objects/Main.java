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
    Number sh = new Short((short)0);
    Short sht = new Short((short)0);
    System.out.println(i == ii);//false compare object reference
    System.out.println(sh == i);//Number is not a wrapper, compares references
//    System.out.println(sht == i);//doesn't compile because you cannot compare reference of Short with Integer
  }

  /** finalize */
  @Override
  protected void finalize() throws Throwable{
    //Called when the gc collect this object
    //Never be called a second time for an instance
    //finalize could not be called if the program ends before
  }

}
