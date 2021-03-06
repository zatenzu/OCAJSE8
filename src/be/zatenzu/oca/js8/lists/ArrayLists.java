package be.zatenzu.oca.js8.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by tda on 2/08/2015.
 */
public class ArrayLists{

  public static void main(String[] args){
    /** ArrayList:
     *  - Is ordered
     *  - Isn't sorted
     *  - Has a non fixed size
     *  - Is mutable
     *  - in java.util package (/!\ import)
     */

    /*************************************/
    /** Constructors                    **/
    /*************************************/
    /** public ArrayList() */
    new ArrayList<>();
    /** public ArrayList(int initialCapacity) */
    new ArrayList<>(1);
    /** public ArrayList(Collection c) */
    new ArrayList<>(new ArrayList<>());

    /*************************************/
    /** Initialization                  **/
    /*************************************/
    /** legal */
    /*
      List myListIniti = new ArrayList<>();
      List myListIniti = new ArrayList();
      List myListIniti = new ArrayList<Object>();
      List<Object> myListIniti = new ArrayList<>();
      List<Object> myListIniti = new ArrayList();
      List<Object> myListIniti = new ArrayList<Object>();
    */


    /** illegal */
    /*
      List<> myListIniti = new ArrayList<>();
      List<> myListIniti = new ArrayList<Object>();
      List<Object> myListIniti = new ArrayList<String>();
    */

    /*************************************/
    /** Methods                         **/
    /*************************************/
    /** public boolean add(E element) */
    //add the element to the collection
    //return true if the collection is modified by the call

    /** public void add(int index, E element) */
    //add the element at index position
    //elements with index >= position are pushed forward

    /** public boolean remove(Object o) */
    //remove the element
    //return true if the collection is modified by the call
    //Shifts any subsequent elements to the left
    //based on equals
    //if o == null then remove null

    /** public E remove(int index) */
    //remove the element at the index position
    //return the removed element or null
    //Shifts any subsequent elements to the left
    //!\\ List<Integer> -> remove(0) (index) but remove(new Integer(0)) remove(Object)!

    /** public E set(int index, E newElement) */
    // set the object o at the position 'index'
    //if an element is already defined at the position, the element is replaced and returned
    //don't push element forward, just replace!

    /** public boolean isEmpty() */
    //return true if the collection content no element
    //IF THE COLLECTION CONTENT NULL VALUE, return false!!

    /** public int size() */
    //return the number of element present in the collection

    /** public void clear() */
    //remove all value in the collection

    /** public boolean contains(Object o) */
    //return true if the collection contains at least the value
    //based on o==null ? e==null : o.equals(e)

    /** public boolean equals(Object o) */
    //Compare the current list with the object
    //if the object implements the List interface and sizes are equals
    //and elements at i position are equals
    //vector can be equals to a arrayList or a linkedList!

    /** == **/
    //compare object references

    /** public boolean removeIf(java.util.function.Predicate<? super E> filter) **/
    //remove all elements that satisfy the given predicate filer
    //return true if the list was modified by the call
    ArrayList<String> arrayList = new ArrayList();
    arrayList.add("Thomas");
    arrayList.removeIf(p -> p.equals("Thomas"));
    //is the same as
    arrayList.removeIf(new Predicate<String>(){
      @Override
      public boolean test(String s){//String because it's a typed String list
        return s.equals("Thomas");
      }
    });

    /** non typed ArrayList */
    ArrayList nonTypedArrayList = new ArrayList();
    nonTypedArrayList.add("string");
    nonTypedArrayList.add(Boolean.TRUE);
    nonTypedArrayList.add(3);
    //any object can add in to it

    /** typed ArrayList */
    ArrayList<String> typedArrayList = new ArrayList();
    typedArrayList.add("string");
//    typedArrayList.add(Boolean.TRUE);// Doesn't compile
//    typedArrayList.add(3);// Doesn't compile

    /** Object[] toArray() */
    //return an array with all elements in the collection
    //! backed
    List l = new ArrayList<>();
    l.add("H");
    l.add("E");
    l.add("L");
    l.add("L");
    l.add("O");
    System.out.println(l);

    Object[] myArrayFromCollection = l.toArray();

    /**
     String[] myArrayFromCollection2 = (String[])collection.toArray();
     ==> java.lang.ClassCastException Object[] to String[] forbidden!!
     Because an instance of Object[] cannot become a String[] but an instance of String[] stored in a Object[]
     can be cast to String[]
     **/
    for (int i=0; i<myArrayFromCollection.length; i++) {
      System.out.println(myArrayFromCollection[i]);
    }

    /** T[] toArray(T[] t) **/
    //T is the type of the list
    //return a newly allocated array of T with all value in the collection.

    List<String> myStringsList = new ArrayList<>();
    String[] myArray = new String[3];
    String[] myNewArray = myStringsList.toArray(myArray);

    /** List to array */
    ArrayList<String> alphaList = new ArrayList();
    String[] alphaArray = {"A", "B", "C", "D"};
    alphaList.add("A");
    alphaList.add("B");
    alphaList.add("C");
    alphaList.add("D");
    alphaArray = alphaList.toArray(alphaArray);

    System.out.println("Without update");
    System.out.println(Arrays.toString(alphaArray));
    System.out.println(alphaList);
    System.out.println("With update on list");
    alphaList.set(0, "Z");
    System.out.println(Arrays.toString(alphaArray));
    System.out.println(alphaList);
    System.out.println("With update on array");
    alphaArray[0] = "B";
    System.out.println(Arrays.toString(alphaArray));
    System.out.println(alphaList);
    //not backed !!

    //you can directly print an arraylist -> []
    System.out.println(new ArrayList());

    //capacity method exists but on Vector object... so
    //arrayList.capacity();doesn't compile!

    /******************/
    /** Collections  **/
    /******************/
    /** Collection.sort(List<T> list) */
    List<String> stringList = new ArrayList();
    stringList.add("E");
    stringList.add("F");
    stringList.add("H");
    stringList.add("A");
    System.out.println("Unsorted:" + stringList);
    java.util.Collections.sort(stringList);
    System.out.println("Sorted:" + stringList);
    //elements must implements comparable -> IllegalArgumentException
    //if two elements are not comparable together -> ClassCastException

    /** binarySearch **/
    System.out.println(Collections.binarySearch(stringList, "B"));//-2
    //because B will be inserted to 1 position so (index of the position where it will be inserted + 1) * -1
  }

}
