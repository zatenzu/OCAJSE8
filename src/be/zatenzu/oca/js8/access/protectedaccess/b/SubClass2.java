// $Id$
package be.zatenzu.oca.js8.access.protectedaccess.b;

import be.zatenzu.oca.js8.access.protectedaccess.a.SubClass1;
import be.zatenzu.oca.js8.access.protectedaccess.a.MotherClass;

public class SubClass2 extends MotherClass
{
  public void myMethod(){
    System.out.print(x);//I'm not in the same package as x but I'm in a subclass of MotherClass
    MotherClass c = new MotherClass();
//    System.out.print(c.x);//I'm not in the same package as x and I'm not in the class of c instance
    SubClass1 c1 = new SubClass1();
//    System.out.print(c1.x);//I'm not in the same package as x and I'm not in the class of c1 instance
    SubClass2 c2 = new SubClass2();
    System.out.print(c2.x);//I'm not in the same package as x but I'm in the same class as the class of c2 instance who extends MotherClass
    SubClass3 c3 = new SubClass3();
//    System.out.print(c3.x);//I'm not in the same package as x but I'm not in the class of c3 instance
  }
}
