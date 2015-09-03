// $Id$
package be.zatenzu.oca.js8.access.protectedaccess.c;

import be.zatenzu.oca.js8.access.protectedaccess.a.MotherClass;
import be.zatenzu.oca.js8.access.protectedaccess.a.SubClass1;
import be.zatenzu.oca.js8.access.protectedaccess.b.SubClass2;

public class OtherClass
{
  public void myMethod(){
    MotherClass c = new MotherClass();
    SubClass1 c1 = new SubClass1();
    SubClass2 c2 = new SubClass2();
//    System.out.print(c.x);//I'm not in the same package as x and I'm not in the class of c instance
//    System.out.print(c1.x);//I'm not in the same package as x and I'm not in the class of c1 instance
//    System.out.print(c2.x);//I'm not in the same package as x  and I'm not in the class of c2 instance
  }
}
