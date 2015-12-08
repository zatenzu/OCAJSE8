package be.zatenzu.oca.js8.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by tda on 2/08/2015.
 */
public class Main{

  public static void main(String[] args){
    /** Array rules:
     * - is an object
     * - is ordered
     * - isn't sorted
     * - has a fixed size
     * - is mutable
     * - it's not var args but cannot declare overloaded method with array and var args and you can override a method
     * with varargs parameter with a method with array and vice versa
     */

    /** declaration */
    int[] tab;
    int[] tabA[];//two dimensional array
    int tabB[];
    int[][] tabC;//two dimensional array
    int tabD[][];//two dimensional array
    int[][][] tabE;//tree dimensional array
    int[][] tabZ[];//tree dimensional array
    float[] myTab = new float[5];
//  int[5] tabF = new int[]; Never initialize with size at the variable type

    // /!\ Exception
    int[] mytab1, mytab2;// declare two arrays
    int mytab3[], myint;// declare one array and one int

    //arrays construction need always a size for the first dimension!!
    //like this
    int[] ia = new int[]{1,2,3};
    //or like this
    int[] ib = new int[3];
    //or like this
    int[] ic = {1,2,3};//array initializer can only use at var declaration
//    ic = {1,2,3};//array initializer can only use at var declaration
    //
    int[] id = {1,2,3,};//last , is useless but legal, size is 3 not 4!

    int[][] twoDimensionsTab = new int[2][];//size for the second dimension is not required!!!!
    int[][] twoDimensionsTab2 = new int[][]{{1,2,3},{1,2,3}};

    int i = new int[]{1,2,3}[1];//i=2
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

    int [][] twoDimArray = new int[1][1];
    twoDimArray[0][0] = 0;
    //twoDimArray[0,0] = 0; -> not like that!

//    String[] k = new String[-1];//negative size compiles but throws exception at runtime

    /** method call */
//    test({0,0});array initializer is not allowed at method call
    //but
    test(new int[]{1,1,1});

    //cannot be used like var args argument
    //test(1, 2, 3);

    /** equals, == and Arrays.equals() **/
    int[] equalsArray1 = new int[]{1};
    int[] equalsArray2 = new int[]{1};
    System.out.println("==:" + (equalsArray1 == equalsArray2));//false
    System.out.println("equals:" + equalsArray1.equals(equalsArray2));//false because return this == obj
    System.out.println("Arrays.equals:" + Arrays.equals(equalsArray2, equalsArray2));//true
    //Arrays.equals() takes 2 primitive arrays of the same type or 2 object arrays! int[] never be equals to Integer[]
    Arrays.equals((Object[])null,(Object[])null);//true

    /** Array casting **/
    //follow usual rules of casting
    Mother[] motherArray = new Mother[2];
    SubClass[] subClassArray = new SubClass[2];
    MyInterface[] myInterfaceArray = new MyInterface[2];

    motherArray = subClassArray;//ok, subclass is a sub class of mother
    myInterfaceArray = subClassArray;//ok, subclass implements MyInterface
    subClassArray = (SubClass[])motherArray;//ok upcasting required.
    //if the array contains an object which cannot be cast to -> ClassCastException

    // primitive array casting is allowed
    int[] intTabA = new int[1];
    int[] intTabB = new int[1];
    intTabA = (int[]) intTabB;
    //but short[] instance can never be a int[]!
//    short[] shortTabA = new short[0];
//    intTabA = (int[]) shortTabA;

    /** Widening doesn't work with array type*/
//    double[] doubleArray = new float[2];
    //but work with array content
    double[] doubleArray = new double[1];
    doubleArray[0] = 2f;

    /** Boxing doesn't work with array type */
//    Byte[] byteArray = new byte[2];
//    Double[] doubleArray = new Float[2];
//    int[] byteArray = new Integer[2];
    //but works with array content
    int[] intArray = new int[1];
    intArray[0] = new Integer(2);

    /** Arrays.sort(T[] t) **/
    //T must implement comparable interface
    /** Arrays.sort(T[] t, Comparator c) **/

    /** List<T> java.util.Arrays.asList(T... t) **/
    //the returned list is BACKED to the original array
    String [] alphaArray = {"A", "B", "C", "D"};
    List<String> alphaList = Arrays.asList(alphaArray);

    System.out.println("Without update");
    System.out.println(Arrays.toString(alphaArray));
    System.out.println(alphaList);
    System.out.println("With update on list");
    alphaList.set(0, "Z");
    System.out.println(Arrays.toString(alphaArray));
    System.out.println(alphaList);
    //both are updated
    System.out.println("With update on list");
    alphaArray[0] = "A";
    System.out.println(Arrays.toString(alphaArray));
    System.out.println(alphaList);
    //both are updated

    //backed list has fixed size, cannot modify it!
//    alphaList.remove(0);//java.lang.UnsupportedOperationException

    /** toString */
    System.out.println(new String[]{"1", "2", "3"});//[Ljava.lang.String;@74a14482
    System.out.println(Arrays.toString(new String[]{"1", "2", "3"}));//[1, 2, 3]
  }

  private static void test(int[] tab){}

}
