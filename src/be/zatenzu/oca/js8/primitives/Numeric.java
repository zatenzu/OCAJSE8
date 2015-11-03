package be.zatenzu.oca.js8.primitives;

/**
 * Created by tda on 27/07/2015.
 */
public class Numeric{

  public static void main(String[] args){
    /** base **/
    System.out.println(56);//decimal 56 base 10
    System.out.println(0b11);//binary 3 base 2 (0b)
    System.out.println(017);//octal 15 base 8 (0)
    System.out.println(0x1F);//hexadecimal 31 base 16 (0x)

    /** _ **/
    //legal
    int intVar = 1_000_000;
    double annoyingButLegal = 1_00_0.0_0;  // this one compiles

    //illegal
    //double notAtStart = _1000.00;        // DOES NOT COMPILE
    //double notAtEnd = 1000.00_;          // DOES NOT COMPILE
    //double notByDecimal = 1000_.00;      // DOES NOT COMPILE

    /** == **/
    //Object reference
    String s = new String();
    int i = 0;
//    boolean b = (s == 0);
//  Primitive cannot be compare to object reference

    //base
    System.out.println(0b11 == 3);
//    you can compare different bases together
  }

}
