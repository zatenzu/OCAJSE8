package be.zatenzu.oca.js8.wrappers;

/**
 * Created by tda on 9/08/2015.
 */
public class Main{
  public static void main(String[] args){

    /** if you have the primitive name in method name, it's return the primitive value
     *  example:booleanValue and parseBoolean return primitive boolean.
     **/

    /** All parseXxxxx(String s) and valueOf(String s) throw NumberFormatException expected boolean **/

    /** All wrappers have a constructor with s String (Character excepted). This constructor call parseXxxx(String s) static method **/

    /** Boolean */
    //Constructor
    //// public Boolean(boolean b)
    new Boolean(true);
    //// public Boolean(String s)
    new Boolean("true");//call the parseBoolean method
    //public boolean booleanValue()
    Boolean booleanWrapper = new Boolean(true);
    booleanWrapper = new Boolean("true");

    booleanWrapper.booleanValue();
    //public static boolean parseBoolean(String s)
    Boolean.parseBoolean("true");//true if !null and equalsIgnoreCase("true")
    //public static Boolean valueOf(String s)
    Boolean.valueOf("true");//true if !null and equalsIgnoreCase("true")
    //public static Boolean valueOf(boolean b)
    Boolean.valueOf(true);

    /** Byte */
    //Constructor Byte(byte b)
    new Byte((byte)1);
    //public byte byteValue()
    Byte byteWrapper = new Byte((byte)1);
    byteWrapper.byteValue();
    //public static byte parseByte(String s)
    Byte.parseByte("-1");//- or + and all decimal digit
    //public static Byte valueOf(String s)
    Byte.valueOf("1");//- or + and all decimal digit

    /** Short */
    //Constructor Short(short s)
    new Short((short)1);
    //public short shortValue()
    Short shortWrapper = new Short((short)1);
    shortWrapper.shortValue();
    //public static short parseShort(String s)
    Short.parseShort("-1");//- or + and all decimal digit
    //public static Short valueOf(String s)
    Short.valueOf("1");//- or + and all decimal digit

    /** Character */
    //Constructor Character(char c)
    new Character('\u0001');
    //public char charValue()
    Character charWrapper = new Character('\u0001');
    charWrapper.charValue();
    //static methods parseChar(String s) and valueOf(String s) don't exist

    /** Integer */
    //Constructor Integer(int i)
    new Integer(1);
    //public int intValue()
    Integer intWrapper = new Integer(1);
    intWrapper.intValue();
    //public static int parseInt(String s)
    Integer.parseInt("1");//- or + and all decimal digit
    //public static Integer valueOf(String s)
    Integer.valueOf("1");//- or + and all decimal digit

    /** Long */
    //Constructor Long(long l)
    new Long(1L);
    //public long longValue()
    Long longWrapper = new Long(1L);
    longWrapper.longValue();
    //public static long parseLong(String s)
    Long.parseLong("1");//L or l aren't allowed
    //public static Long valueOf(String long)
    Long.valueOf("1");//L or l aren't allowed

    /** Float */
    //Constructor Float(float f)
    new Float(1f);
    //public float floatValue()
    Float floatWrapper = new Float(1f);
    floatWrapper.floatValue();
    //public static float parseFloat(String s)
    System.out.println(Float.parseFloat("1.0f"));
    //public static Float parseFloat(String s)
    System.out.println(Float.valueOf("10.0"));

    /** Double */
    //Constructor Double(double d)
    new Double(1.0);
    //public double doubleValue()
    Double doubleWrapper = new Double(1.0);
    doubleWrapper.doubleValue();
    //public static double parseDouble(String s)
    Double.parseDouble("1");
    //public static Double valueOf(String s)
    System.out.println(Double.valueOf("1.0d"));//d is allowed


    /** == **/
    //This operator with wrapper compare the primitive value of wrapper

    /** WRAPPER OBJECTS ARE IMMUTABLE !!! **/
    System.out.println("=======IMMUTABLE=======");
    Integer myIntWrapper = new Integer(1234);
    Integer myIntWrapperBis = myIntWrapper;
    System.out.println(myIntWrapperBis);
    myIntWrapper += 2;//create new object, incr. it and assigns it to myIntWrapper
    System.out.println(myIntWrapperBis);

    //other examples
    myIntWrapper = new Integer(1234);
    myIntWrapperBis = myIntWrapper;
    System.out.println(myIntWrapper == myIntWrapperBis);//true, it's the same object
    myIntWrapperBis ++;
    System.out.println(myIntWrapper == myIntWrapperBis);//false!!!
    //because myIntWrapperBis ++ --> unwrap it, increment it and rewrap it (new instance).
    System.out.println("=======   =======");
  }
}
