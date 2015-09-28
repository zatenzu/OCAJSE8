package be.zatenzu.oca.js8.var;

/**
 * Created by tda on 27/07/2015.
 */
public class Main{

  public static void main(String[] args){

    /** variables declarations **/
    //legal
    String s1, s2;
    String s3 = "yes", s4 = "no";
    int i1, i2, i3 = 2;//i1=0, i2 = 0 and i3 = 2
    short sh1; short sh2;

    //illegal
    //int i, String s; multiple types on the same line
    //double d1, double d2;
    //short sh3; sh4;

    // /!\ Exception
    int[] mytab1, mytab2;// declare two arrays
    int mytab3[], myint;// declare one array and one int

    /** Identifiers **/
    //identifiers could be composed by all Unicode and currency characters, plus underscore.
    /** legal **/
    String a;
    String _a;
    String _a_;
    String _;
    String a€;
    String €a;
    String €;
    String €a$;
    String €a2$_;
    String €a$2$_;
    String publiC;//legal because java is case sensitive, so keyword with a different case, it's ok.

    /** illegal **/
  /*
    String #a;//#
    String :a;//:
    String -a;//-
    String .f;//.
    String 2a;//cannot start with a cipher
    String a+;//cannot use operators
    String public;// /!\ keywords!
  */
  }

  /** Initialization **/
  //local variable must initialized before use it.
  public int myMethodeA(){
    int x;
    int y = 2;
//    int z = x + y; //x isn't initialized

//    return x;//x isn't initialized
    return 0;
  }

  //class variables has default value, you don't need to initialize it before use it.
  public int classVarInt;
  public String classVarString;

  public void showClassVar(){
    System.out.println(classVarInt);//0
    System.out.println(classVarString);//null
  }

  /** Variable Scope **/
  //local variables -> to the end of the code block
  //instance variables -> Until the GC destroy it
  //class variables -> Until the end of the program
}
