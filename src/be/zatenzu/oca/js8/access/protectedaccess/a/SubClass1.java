// $Id$
package be.zatenzu.oca.js8.access.protectedaccess.a;

import be.zatenzu.oca.js8.access.protectedaccess.b.SubClass2;


public class SubClass1 extends MotherClass
{
  public void myMethod(){
    System.out.print(x);//I'm in the same package as x
    MotherClass c = new MotherClass();
    System.out.print(c.x);//I'm in the same package as x
    SubClass1 c1 = new SubClass1();
    System.out.print(c1.x);//I'm in the same package as x
    SubClass2 c2 = new SubClass2();
    System.out.print(c2.x);//I'm in the same package as x or I'm in the class of c1 instance who 
  }
}
