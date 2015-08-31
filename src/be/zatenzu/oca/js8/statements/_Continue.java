// $Id$
package be.zatenzu.oca.js8.statements;

public class _Continue
{
  /**
   * continue statement is used with for, while and do while loop to skip the rest of the current loop iteration.
   */
  
  public static void main(String[] args)
  {
    /**
     * Exemple with unlabeled loop
     */
    System.out.println("Exemple with unlabeled loop");
    for(int i = 0; i < 10; i++){
      if(i == 5)
        continue;
      System.out.println("The current value is " + i);
    }
    
    /**
     * Exemple with labeled loop
     */
    System.out.println("Exemple with labeled loop");
    firstLoop:
      for(int cpt = 0; cpt < 2; cpt++){
        secondLoop:
        for(int cptt = 0; cptt < 3; cptt++){
          thridLoop:
          for(int cpttt = 0; cpttt < 10; cpttt++){
            if(cpttt == 4 && cptt == 2)
              continue secondLoop;
            System.out.println("cpt=" + cpt + " cptt=" + cptt + " cpttt=" + cpttt);
          }
        }   
      }
    
    /**
     * continue can't be used outside a loop
     */
/*
    if(true){
      continue;
    }
*/
  }
}
