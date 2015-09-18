package be.zatenzu.oca.js8.operators;

/**
 * Created by tda on 1/08/2015.
 */
public class Main{

  public static void main(String[] args){
    /** precedence order */
    // Post unary operators exp++
    // Pre unary operators ++exp
    // Other unary operators +, -, !
    // Multiplication, division, modulus /, * %
    // Addition, subtraction +,-
    // Shift operators >>, <<, >>>
    // Relational operators <, >, <=, >=, instanceof
    // Equals operator ==,!=
    // Logical operators &,|,^
    // Short circuit logical operators &&, ||
    // Ternary operators boolean exp ? value : value
    // Assignment operators =, +=, -=, *=, /=, ...etc
    //U.M.A.S.R.E.L.T.A.

    /** Promotion of numeric values
     - If two variables of two different types, the smallest one will converted to the highest one
     - If one floating point var and a non floating point, non floating point is converted to floating point
     - Data type that are smaller than int, are converted to int when they are using with binary operator
     - The type of the result is the type of the promoted operands
     */

    /** compound assignment **/
    //all compound assignments can be used with implicit casting!
    // +=, -=, *=, /=
    byte b = 3;
    b = (byte) (b + 7);//result is int -> explicit casting (rule 3)
    //but
    byte bbb = 3;
    bbb += 7;//implicit casting!! (no rule 3 because += isn't binary operator)

    /** Casting scope **/
//    byte a = (byte) b + bbb;//invalid because (byte) works only on b so byte + byte = int (rule 3)
    byte a = (byte) (b + bbb);//(byte) works on b + bbb

    /** Unary operators **/
    //Pre incr
    int j = 0;
    j = ++j;
    System.out.println("j=" + j);//1

    //Post incr
    int i = 0;
    i = i++;
    System.out.println(i);//0 !
    //because, this code means:
    //  int oldValue = i;
    //  i = i + 1;
    //  i = oldValue;
    i = 0;
    i = i + 1;
    System.out.println(i);
    //conclusion
    //(i = i++) != (i = i + 1)
  }
}
