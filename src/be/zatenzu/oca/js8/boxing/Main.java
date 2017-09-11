package be.zatenzu.oca.js8.boxing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tda on 12/08/2015.
 */
public class Main{

  public static void main(String[] args){

    /**
    * Autoboxing
    * The Java compiler applies autoboxing when a primitive value is:
    * - Passed as a parameter to a method that expects an object of the corresponding wrapper class.
    * - Assigned to a variable of the corresponding wrapper class.
    **/
    
    /**
    * Unboxing
    * The Java compiler applies unboxing when an object of a wrapper class is:
    * - Passed as a parameter to a method that expects a value of the corresponding primitive type.
    * - Assigned to a variable of the corresponding primitive type.
    **/
    
    /**
     *
     * - Autoboxing works with collections
     * - Autoboxing works with array
     * - Autoboxing doesn't work with Predicate
     **/
    List<Double> doubleList = new ArrayList();
    doubleList.add(3.0);//autoboxes 3.0(double primitive) to Double object

    double d = doubleList.remove(0);//unboxes Double to double
    doubleList.add(null);
    d = doubleList.get(0);//unboxes null to double --> NPE
  }

}
