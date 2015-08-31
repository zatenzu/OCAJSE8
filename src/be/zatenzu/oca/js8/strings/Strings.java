package be.zatenzu.oca.js8.strings;

/**
 * Created by tda on 2/08/2015.
 */
public class Strings{

  public static void main(String[] args){

    /*************************************/
    /** Concatenation                   **/
    /*************************************/
    int r = 4;
    int ff = 4;
    System.out.println("String" + r + ff);
    System.out.println("String" + ( r + ff ));
    //If the left or the right operator is a String, + will be a String concatenation
    //If both operands are numeric, + will be an addition operator

    /*************************************/
    /** Immutability                    **/
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

    /*************************************/
    /** Methods                        **/
    /*************************************/

    /** public int length() **/
    System.out.println("azerty".length());//6
    // /!\ ==> mainString.length() and myArray.length !!

    /** public char charAt(int index) **/
    System.out.println("azerty".charAt(2));//e
//    System.out.println("azerty".charAt(12));// StringIndexOutOfBoundsException

    /** public int indexOf(char c) */
    /** public int indexOf(char c, int indexFrom) */
    /** public int indexOf(String str) */
    /** public int indexOf(String str, int indexFrom) */
    //return -1 if not found

    /** public String substring(int begin) and  **/
    /** public String substring(int begin, int end) **/
    System.out.println("azerty".substring(2));//erty begin index included at the end
//    System.out.println("azerty".substring(-2));//IndexOuOfBoundsException
    System.out.println("azerty".substring(2,4));//er begin index included at the end index excluded
//    System.out.println("azerty".substring(2,14));//IndexOuOfBoundsException
//    System.out.println("azerty".substring(2,1));//IndexOuOfBoundsException, start must be lower

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
  }

}
