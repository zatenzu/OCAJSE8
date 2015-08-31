package be.zatenzu.oca.js8.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tda on 2/08/2015.
 */
public class Main{

  public static void main(String[] args){
    /** Arrays are objects !!!**/
    int[] tab;
    int[] tabA[];//two dimensional array
    int tabB[];
    int[][] tabC;//two dimensional array
    int tabD[][];//two dimensional array
    int[][][] tabE;//tree dimensional array
    int[][] tabZ[];//tree dimensional array
    float[] myTab = new float[5];
//  int[5] tabF = new int[5]; Never initialize with size at the variable type

    // /!\ Exception
    int[] mytab1, mytab2;// declare two arrays
    int mytab3[], myint;// declare one array and one int

    //arrays construction need always a size for the first dimension!!
    //like this
    int[] ia = new int[]{1,2,3};
    //or like this
    int[] ib = new int[3];
    //or like this
    int[] ic = {1,2,3,};
    //
    int[] id = {1,2,3,};//last , is useless but legal, size is 3 not 4!

    int[][] twoDimensionsTab = new int[2][];//size for the second dimension is not required!!!!

    int i = new int[]{1,2,3}[1];
//  int[] ii = new int[1]{1,2,3};cannot specify the size two times

    int[] a = new int[5];
    System.out.println(a.length);
    //Array elements are always given the default value
    //myTab->[0,0,0,0,0]
    for(int ii = 0; i < myTab.length; i++){
      System.out.println(myTab[ii]);
    }

    // /!\ ArrayOutOfBondsException
//    myTab size = 5
//    System.out.println(myTab[5]);//Runtime exception!

    /** IS-A test ok **/
    Mother[] motherArray = new Mother[2];
    MyInterface[] myInterfaceArray = new MyInterface[2];
    SubClass[] subClassArray = new SubClass[2];

    motherArray = subClassArray;//ok, subclass is a sub class of mother
    myInterfaceArray = subClassArray;//ok, subclass implements MyInterface
    //but
//    motherArray = new Mother[2];
    subClassArray = (SubClass[])motherArray;// ClassCastException!!


    //Doesn't work with primitives
//    double[] intArray = new float[2];

    //Doesn't work with wrapper
//    Byte[] byteArray = new byte[2];
//    Double[] doubleArray = new Float[2];
//    int[] byteArray = new Integer[2];

    /** Arrays.sort(T[] t) **/
    //T must implement comparable interface
    /** Arrays.sort(T[] t, Comparator c) **/

    /** List<T> java.util.Arrays.asList(T[] t) **/
    List<Mother> motherList = java.util.Arrays.asList(motherArray);
    //the returned list is backed to the original array!!
    //backed list has a fixed size!
//    motherList.remove(0);//UnsupportedOperationException

    /** Collection.sort(List<T> list) */
    List<String> stringList = new ArrayList();
    stringList.add("E");
    stringList.add("F");
    stringList.add("H");
    stringList.add("A");
    System.out.println("Unsorted:" + stringList);
    java.util.Collections.sort(stringList);
    System.out.println("Sorted:" + stringList);
  }

}