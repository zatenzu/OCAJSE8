package be.zatenzu.oca.js8.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by tda on 2/08/2015.
 */
public class ArrayLists{

  public static void main(String[] args){

    /** public boolean add(E element) */
    //add the element to the collection
    //return true if the collection is modified by the call
    //elements with index >= position are pushed forward

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
    //return an array with all element in the collection
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
     IS-A test fails
     **/
    for (int i=0; i<myArrayFromCollection.length; i++) {
      System.out.println(myArrayFromCollection[i]);
    }

    /** T[] toArray(T[] t) **/
    //return a newly allocated array of T with all value in the collection.
    String[] myArray = new String[3];
    l.toArray(myArray);
  }

}
