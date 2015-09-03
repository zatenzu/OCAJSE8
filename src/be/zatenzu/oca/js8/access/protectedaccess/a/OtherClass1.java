// $Id$
package be.zatenzu.oca.js8.access.protectedaccess.a;

import be.zatenzu.oca.js8.access.protectedaccess.b.SubClass2;

public class OtherClass1
{
  public void myMethod(){
    MotherClass c = new MotherClass();
    SubClass1 c1 = new SubClass1();
    SubClass2 c2 = new SubClass2();
    System.out.print(c.x);//ok I'm in the same package as x
    System.out.print(c1.x);//ok I'm in the same package as x
    System.out.print(c2.x);//ok I'm in the same package as x
//    System.out.print(x);
  }
}
