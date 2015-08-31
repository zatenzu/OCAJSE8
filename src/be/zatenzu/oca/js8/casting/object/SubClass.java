// $Id$
package be.zatenzu.oca.js8.casting.object;

import java.util.ArrayList;
import java.util.List;

public class SubClass extends Mother
{
  public static void main(String[] args)
  {
    //
    //     [MOTHER] Level 1
    //        ^
    //        |
    //        | (extends)
    //        |
    //    [SUBCLASS] Level 2
    //
    
    
    /** (Down)casting ( mother (level 1) -> subclass (level 2)) **/
    Mother mother = new SubClass();
    SubClass subClass = (SubClass)mother;
    
    //runtime error ClassCastException
    Mother mother2 = new Mother();
    SubClass subClass2 = (SubClass)mother2;
    
    //Compilator error, SubClass never be a String
//    String s = (String)subClass2;
    
    
    /** (Up)casting (subclass (level 2) -> mother (level 1) **/
    SubClass subClass3 = new SubClass();
    Mother mother3 = (Mother)subClass2;
    Mother mother4 = subClass2;//explicit casting isn't necessary for upcasting !!
  }
  
  public void test(List<String> s){};
  public void test(ArrayList<Object> s){};
}
