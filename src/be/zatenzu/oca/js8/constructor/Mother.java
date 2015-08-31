// $Id$
package be.zatenzu.oca.js8.constructor;

public class Mother
{
  public static int i = 3;
  
  protected Mother(){
    System.out.println("Mother constructor");
  }
  
  protected Mother(int i){
    System.out.println("Mother constructor");
  }
  
  protected Mother(String a,  String b){};
  
  public static int getInt(){
    return 3;
  }
}
