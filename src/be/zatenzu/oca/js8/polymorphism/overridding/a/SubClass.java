// $Id$
package be.zatenzu.oca.js8.polymorphism.overridding.a;

import java.io.IOException;

public class SubClass extends Mother
{

  //not overriding, argument type is different
  public void a(SubClass s){System.out.println("a-SubClass");}
  
  //You cannot reduce the visibility with overridding (public -> private)
//  private void a(String s){}; --> forbidden

  //The return type can be a subclass of the return type of the overridded method .
  public String b(String s){System.out.println("b-SubClass");return new String();} //->yes it's overridding
  //  /!\ only for return type, not for parameters

  /** ok I'm the same package and it's a non final method **/
  void c(){System.out.println("c-SubClass");}

  /** ok I'm a subclass and it's a non final method**/
  protected void d(){System.out.println("d-SubClass");}
  
  /** I can't overridde e method because it's private **/
  private void e(){System.out.println("e-SubClass");}//-> It's a new method
  
  /** cannot be overridde because it's final **/
//  public void f(){};//It's final
  
  /** cannot overridde a static method **/
  public static void g(){System.out.println("g-SubClass");}// -> It's a new method!
//  public void g(){System.out.println("g-SubClass");}// -> compilation error (static super vs non static)

  //TODO exception
  public void h(){System.out.println("h-SubClass");}
  public void i() throws NumberFormatException{System.out.println("i-SubClass");}
  public void j() throws RuntimeException{System.out.println("j-SubClass");}
//  public void k() throws Exception{};//super type of IllegalArgumentException
  
  /** the same exception ok**/
  public void l() throws Exception{System.out.println("l-SubClass");}//override ok
  /** A subclass of Exception, ok**/
  public void m() throws IOException{System.out.println("m-SubClass");}//override ok
  /** cannot be a Super class of Exception**/
//  public void n() throws Exception{System.out.println("n-SubClass");}
  public void o() throws Exception, RuntimeException{System.out.println("o-SubClass");}//override ok
  public void p(){System.out.println("p-SubClass");}//??
  //===
  
  public void myMethodToOverridde(){
    System.out.println("SubClass");
  }
  
  public static void main(String[] args)
  {
    Mother m = new Mother();
    Mother m2 = new SubClass();
    SubClass m3 = new SubClass();
    
    //which method is called?
    m.myMethodToOverridde();
    m2.myMethodToOverridde();
    m3.myMethodToOverridde();
    //==> It's defined by the object instance type at runtime!!!!
    System.out.println("============");
    m2.a(new Mother());
    m2.b("");
    m2.c();
    m2.d();
    m2.f();
    m2.g();
    m2.h();
    m2.i();
    m2.j();
    try
    {
      m2.l();
    }
    catch (Exception e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    try
    {
      m2.m();
    }
    catch (Exception e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    try
    {
      m2.n();
    }
    catch (Exception e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    try
    {
      m2.o();
    }
    catch (Exception e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    try
    {
      m2.p();
    }
    catch (Exception e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }


  @Override
  public void testTab(int... iii){
    super.testTab(iii);
  }
}
