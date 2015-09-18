package be.zatenzu.oca.js8.objects;

/**
 * Created by tda on 1/08/2015.
 */
public class Main{

  //Objects are stored in the heap
  //Object references are stored on the stack

  /** finalize */
  @Override
  protected void finalize() throws Throwable{
    //May be called when the gc collect this object
    //Never be called a second time
  }

}
