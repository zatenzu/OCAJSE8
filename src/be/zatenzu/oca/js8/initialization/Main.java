package be.zatenzu.oca.js8.initialization;

/**
 * Created by tda on 15/08/2015.
 */
public class Main{
  /**
   * Order of initialization
   * 1) Super static vars and static blocs in order they appear in the file
   * 2) Static vars and static blocs in order they appear in the file
   * 3) Super instance vars and instance blocs in order they appear in the file
   * 4) Instance vars and instance blocs in order they appear in the file
   * 5) Constructors, super -> current
   */
  //if a static bloc, call constructor, keep rule 4 before 5! @see at page 204

  {
//    myVar ++;//illegal forward reference!
    myVar = 1;
//    myVar ++;//illegal forward reference!
  }
  int myVar = 2;
  {myVar  =3;}
  //you can init a var declared after the block but you cannot use its value
  //before the initialization of it.

  {myStaticVar++;}
  static int myStaticVar = 0;


  public static void main(String[] args){
    System.out.println(new Main().myVar);//2!
  }
}
