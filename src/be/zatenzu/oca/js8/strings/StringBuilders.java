package be.zatenzu.oca.js8.strings;

/**
 * Created by tda on 2/08/2015.
 */
public class StringBuilders{

  public static void main(String[] args){

    /** Not immutable! */

    /** StringBuilder and StringBuffer are the same excepted StringBuilder isn't thread safe!!! **/
    //So the API is the same

    /*************************************/
    /**Main StringBuilder/Buffer methods**/
    /*************************************/
    StringBuilder mainString = new StringBuilder("azerty");
    /** charAt(), indexOf(), length(), substring() see Stings class */

    /** public StringBuilder append(String s) **/
    mainString.append("ui");
    System.out.println(mainString);//azertyui

    /** public StringBuilder insert(int offset, String s) **/
    System.out.println(mainString.insert(3, "poiu"));//azepoiurtyui

    /** public StringBuilder delete(int start, int end)**/
    System.out.println(mainString.delete(2, 5));//azyui
    //beging index is included
    //end index is excluded

    /** public StringBuilder deleteCharAt(int index)**/
    System.out.println(mainString.deleteCharAt(2));//azui

    /** public StringBuffer reverse() **/
    System.out.println(mainString.reverse());//iuza


  }

}
