package be.zatenzu.oca.js8.strings;

/**
 * Created by tda on 2/08/2015.
 */
public class StringBuilders{

  public static void main(String[] args){

    /** Not immutable! */

    /** StringBuilder and StringBuffer are the same excepted StringBuilder isn't thread safe!!! **/
    //So the API is the same

    /***************************************/
    /**         Constructors              **/
    /***************************************/
    /** public StringBuilder() */
    new StringBuilder();
    /** public StringBuilder(int capacity) */
    new StringBuilder(16);
    /** public StringBuilder(String s) */
    new StringBuilder("string");
    /** public StringBuilder(CharSequence seq) */

    /***************************************/
    /** Main StringBuilder/Buffer methods **/
    /***************************************/
    StringBuilder mainString = new StringBuilder("azerty");
    /** charAt(), indexOf(), length(), substring() see Strings class */

    /** public StringBuilder append(String s) **/
    mainString.append("ui");
    System.out.println(mainString);//azertyui

    /** public StringBuilder insert(int offset, String s) **/
    System.out.println(mainString.insert(3, "poiu"));//azepoiurtyui

    /** public StringBuilder delete(int start, int end)**/
    System.out.println(mainString.delete(2, 5));//azyui
    //beging index is included
    //end index is excluded
    //if endindex is out of range, delete all to the end of the string -> No IORE !!
    //if beginIndex == endIndex do nothing

    /** public StringBuilder deleteCharAt(int index)**/
    System.out.println(mainString.deleteCharAt(2));//azui

    /** public StringBuffer reverse() **/
    System.out.println(mainString.reverse());//iuza

    /** public String toString() **/
    System.out.println(mainString);//you can print directly a StringBuilder (.toString() not required)

    /** equals */
    //StringBuilder doesn't override equals !!!
    StringBuilder s1 = new StringBuilder("meow");
    StringBuilder s2 = new StringBuilder("meow");
    System.out.println(s1.equals(s2));//false!
  }

}
