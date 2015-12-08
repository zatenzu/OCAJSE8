package be.zatenzu.oca.js8.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by tda on 2/08/2015.
 */
public class Strings{

  public static void main(String[] args){

    /*************************************/
    /** Constructor                     **/
    /*************************************/
    /** public String() */
    new String();

    /** public String(String original) */
    new String("");

    /** public String(StringBuilder builder) */
    new String(new StringBuilder());

    /** public String(StringBuffer buffer) */
    new String(new StringBuffer());

    /*************************************/
    /** Concatenation                   **/
    /*************************************/
    int r = 4;
    int ff = 4;
    System.out.println("String" + r + ff);
    System.out.println("String" + ( r + ff ));
    System.out.println(r + "X");//4X
    //If the left or the right operator is a String, + will be a String concatenation
    //If both operands are numeric, + will be an addition operator

    /*************************************/
    /** Immutability:                   **/
    /** - Immutable object cannot be modified
    /** - Immutable object can be garbage collected
    /*************************************/
    String f = new String("AZERTY");
    String g = f;
    System.out.println(g == f);//true
    System.out.println(g);
    f = f + "G";
    System.out.println(g);
    //f and g refer to own object.
    //It's impossible to change a instance of String, a new instance is create each time.

    String stringR = "aze";
    stringR += "rty";//create new String, reference lost!
    System.out.println(stringR);

    /*************************************/
    /** String pool                     **/
    /*************************************/
    String s = "Strings"; //"Strings" is in the pool and s use it
    String ss = new String("Strings");//"Strings" is in the pool and ss don't use it
    System.out.println("Pool 1:" + (s == ss));//false because s and ss refer to different objects
    System.out.println("Pool 2:" + ("Strings" == s));//true because s refers to the string in the pool

    /*************************************/
    /** Methods                        **/
    /*************************************/

    /** public int length() **/
    System.out.println("azerty".length());//6
    // /!\ ==> mainString.length() and myArray.length !!

    /** public char charAt(int index) **/
    System.out.println("azerty".charAt(2));//e
//    System.out.println("azerty".charAt(12));// StringIndexOutOfBoundsException

    /** public String concat(String str)**/
    //add str at end of the current String
    //NPE if str is null
    String concat = "concat";
    String concat2 = concat;
    System.out.println(concat == concat2);//true
    concat2 = concat2.concat("");
    System.out.println(concat == concat2);//true because concat2 wasn't modified by the previous line
    concat2 = concat2.concat("-");
    System.out.println(concat == concat2);//false because concat2 was modified by the previous line
    System.out.println(concat2);

    /** public int indexOf(char c) */
    /** public int indexOf(char c, int indexFrom) */
    /** public int indexOf(String str) */
    /** public int indexOf(String str, int indexFrom) */
    //return -1 if not found

    /** public String substring(int begin) **/
    /** public String substring(int begin, int end) **/
    System.out.println("azerty".substring(2));//erty begin index included at the end
//    System.out.println("azerty".substring(-2));//IndexOuOfBoundsException
    System.out.println("azerty".substring(2,4));//er begin index included at the end index excluded
//    System.out.println("azerty".substring(2,14));//IndexOuOfBoundsException
//    System.out.println("azerty".substring(2,1));//IndexOuOfBoundsException, start must be lower
    System.out.println("azerty".substring(2,2));//when start and end are equal, return ""

    /** public String toLowerCase() **/
    System.out.println("AZERTY".toLowerCase());//azerty

    /** public String toUpperCase() **/
    System.out.println("azerty".toUpperCase());//AZERTY

    /** public boolean equalsIgnorCase(String s1) **/
    String mainString2 = "AZERTY";
    System.out.println("azerty".equalsIgnoreCase(mainString2));//true

    /** public boolean startWith(String prefix) */

    /** public boolean endWith(String suffix) */

    /** public boolean contains(String str) */

    /** public String replace(char old, char new) **/
    /** public String replace(CharSequence old, CharSequence new) **/
    System.out.println("azerty".replace('z', 'Z'));//aZerty
    System.out.println("azerty".replace("z", "Z"));//aZerty
    //replace all old char with new char.

    /** public String trim() **/
    // /!\ Only leading and trailing whitespaces !
    System.out.println("  a z e r t y  \n \r \t".trim());//a z e r t y
    System.out.println("  a z e \n r t y  \n \r \t".trim());//a z e


    /**********************************/
    /** Sorted                      **/
    /*********************************/
    List<String> arrayOfChar = Arrays.asList("-","1", "3A", "33", "40", "a","A", "€", "#", "@");
    Collections.sort(arrayOfChar);
    System.out.println(arrayOfChar);//#,-,1,33,3A,40,A,a,€
    //number before letter
    //Uppercase letter before lowercase letter
  }

}
