// $Id$
package be.zatenzu.oca.js8.arrays;

public class Sort
{
  public static void main(String[] args)
  {
    //Arrays.sort()
    //sort arrays
    //Objects in the array must implement Comparable
    //
    int[] myIntArray = new int[]{2,1,3};
    java.util.Arrays.sort(myIntArray);
    String[] sss = new String[1];
//    java.util.Arrays.sort(myIntArray, new MyComp());//You cannot sort a primitive array with comparator!!!

    /** public static int java.util.Arrays.binarySearch() */
    //unsorted array = not predictable result.
    //binarySearch(array, valueToSearch)
    //if found, return the index of the key
    System.out.println(java.util.Arrays.binarySearch(myIntArray, 3));//2
    //if not found, return the -1 * index where the key will be inserted if you add it
    System.out.println(java.util.Arrays.binarySearch(myIntArray, 4));//-4
  }
}
