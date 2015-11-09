package be.zatenzu.oca.js8._interface._default.multiinheritance.doubledefault;

/**
 * Created by tda on 7/11/2015.
 */
public interface C extends A,B{

  /** double default method must be override **/
  //If A and B have the same default method, C must override it. --> compilation error
  @Override
  public void print();
  //or like this
//  public default void print(){};
}
