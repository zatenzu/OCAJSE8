package be.zatenzu.oca.js8.primitives;

/**
 * Created by tda on 26/07/2015.
 */
public class Main{

  public static void main(String[] args){
    /** boolean **/
    //size 1 bit
    //default value is false
    //only true or false

    /** byte **/
    //size 8 bit
    //default value is 0
    //-128 to 127

    //numbers are always implicitly int
    byte bb = 8;

    //but
    //from int
    int b = 2;
    byte b2 = (byte)b;//need casting

    //from char
    char c = 2;
    b2 = (byte)c;//need casting

    //from long
    long l = 3;
    b2 = (byte)l;//need casting

    byte bbb = 127;
    //    byte bbbb = 128;//too big, compilation error
    //but
    byte bbbb = (byte)130;//-126 (change the sign bit and put all others to 0)

    /** short **/
    //It use to declare a 16-bit signed integer.
    //Minimal value is -32 768
    //Maximal value is 32 767
    //default value is 0
    short s1 = '\u0000';//from unicode char
    s1 = 'A';//from char
    bb = 0x000F;//hexa

    /** char **/
    //char is a 16 bits variable
    //Minimal value is 0 ('\u0000') -> null character
    //Maximal value is (2^16)-1 ('\uFFFF') -> noncharacter
    // /!\literal integers are implicitly a int
    char a = 65;
    char fromInt = 65535;
    char fromIntt = (char)65536; //> 65535  -> casting
    //possible loss of precision

    /** integer **/
    //It use to declared a 32-bit signed integer.
    //Minimal value is -2^31 (-2147483648)
    //Maximal value is 2^31-1 (2147483647)
    //default value is 0

    /** float **/
    float f = -1.0f;
    //It use to declared a 32-bit signed floating point value.
    //default value 0.0
    //It use to declared a numeric variable from 1.4E-45 to 3.4028235E38
    f = 1.00f;

    /** long **/
    //It use to declared a 64-bit signed integer.
    //Minimal value is -2^63 (-9223372036854775808)
    //Maximal value is 2^63-1 (9223372036854775807)
    //default value 0L
    long myLong = 0;//assign int value into long var.
//    myLong = 99999999999;//Integer number is too large
    myLong = 99999999999L;

    /** double **/
    //It use to declared a 64-bit signed floating point value.
    //Minimal value is 4.9E-324
    //Maximal value is 1.7e+038
    //default value 0.0d

    double d = -23.23;//by default floating point numbers are double!
    double dd = 23.23D;//D is implicit
    double ddd = 23.23d;//d is implicit
//    double ddddd = 23,23d;//not dot but comma dont compile
  }

}