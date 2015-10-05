package be.zatenzu.oca.js8.boxing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tda on 12/08/2015.
 */
public class Main{

  public static void main(String[] args){

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
