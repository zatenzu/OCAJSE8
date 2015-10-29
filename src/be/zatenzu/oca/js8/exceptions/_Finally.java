// $Id$
package be.zatenzu.oca.js8.exceptions;

public class _Finally
{
  public static void main(String[] args)
  {
    // finally can be used without catch block
    // {} are required with finally
    try{
      System.out.println("");
    }finally{}
    
    // If catch block exists, finally must be after the last catch block.
    try{
      System.out.println("");
    }
    catch(Exception ex){
      
    }
    catch(Throwable t){}
    finally{}
    
    
    try{
      System.out.println("");
      System.exit(-1);//1
    }
    catch(Exception ex){
      System.exit(-1);//2
    }
    finally{
      System.out.println("This code never runs");
    }
    //with only exit 1 or 2
    
    //See try and catch keywords
  }
}
