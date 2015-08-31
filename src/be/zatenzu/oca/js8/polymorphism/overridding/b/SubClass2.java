// $Id$
package be.zatenzu.oca.js8.polymorphism.overridding.b;


import be.zatenzu.oca.js8.polymorphism.overridding.a.Mother;

public class SubClass2 extends Mother
{

  /** nothing special **/
  public Object b(String s){return new Object();}

  /** I cannot overridde c method because it's package access and I'm not in the same package **/
  void c(){}//-> It's a new method
  
  /** ok it's protected and I can increase the visibility**/
  public void d(){}
  
  /** I can't overridde e method because it's private **/
  private void e(){}//-> It's a new method
  
}
