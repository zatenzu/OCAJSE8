// $Id$
package be.zatenzu.oca.js8.polymorphism.overloading.a;

import be.zatenzu.oca.js8.polymorphism.overloading.b.Mother;
import be.zatenzu.oca.js8.polymorphism.overloading.b.SubClass;

import java.io.FileNotFoundException;

public class MyClass
{
  public void methodToOverload(String s, int i, float a){};
  public void methodToOverload(String s, int i){};
  public String methodToOverload(String s, float a){return new String();};
  public void methodToOverload(float a, int i) throws FileNotFoundException{};

  public void a(Mother m){
    System.out.println("Mother");
  }
  
  //you can change the return type
  public int a(SubClass m){
    System.out.println("SubClass");
    return 0;
  }
  
  public static void main(String[] args)
  {
    Mother a = new Mother();
    Mother b = new SubClass();
    SubClass c = new SubClass();
    
    //which method is called?
    MyClass myClass = new MyClass();
    myClass.a(a);
    myClass.a(b);
    myClass.a(c);
    // ====> The reference type(NOT the object type) decide which overloaded method is invoke !!!!
    //It's decided at compiler time, not runtime
    
    
    /**
    ==> If the JVM doesn't find the method with exactly the same primitive type
    the JVM use the smallest correspondent primitive type.
    The smallest primitive type but bigger than the original argument type.
    --> It's called Widening!
    **/
    
      /*************************************/
     /** Overloading and primitive types **/
    /*************************************/
    
    /** Widening vs Boxing! **/
    //primitive argument -> primitive method parameter
    byte bb = 0;
    short s = 0;
    long l = 0L;
    float f = 0.0f;
    myMethod(bb);
    myMethod(s);
    myMethod(l);
    myMethod(f);
    //widening
    
    //Wrapper argument -> primitive method parameter
    Byte bbb = 0;
    Short ss = 0;
    Long ll = 0L;
    Float ff = 0.0f;
    myMethod(bbb);
    myMethod(ss);
    myMethod(ll);
    myMethod(ff);
    //Unboxing + Widening -> OK
    //Widening with 
    
    //primitive argument -> wrapper method parameter
    short sssss = (short)1;
    myMethodShort(sssss);
    /*
       ==> The JVM choses the non primitive type!!!
    */
    
    //wrapper argument -> wrapper method parameter
//    myMethodWrapper(ss);//Forbidden!
    myMethodWrapper(ll);
//    myMethodWrapper(ff);//Forbidden!
    /*
       /!\ Widening doesn't work with Wrapper arguments -> wrapper method parameter!!!
    */
    /** Conclusion:Widening wins! **/
    
    
    /*************************************/
   /** Overloading with var-args       **/
  /*************************************/
    /** Widening vs var-args**/
    //primtive arguments -> primitives parameters
    byte b1 = (byte)0;
    byte b2 = (byte)0;
    myMethod(b1,b2);//int,int or byte... ?
    //JVM choses widening
    
    //Wrapper arguments -> primitives parameters
    Byte bb1 = (byte)0;
    Byte bb2 = (byte)0;
    myMethod(b1,b2);
    //JVM choses widening
    /** Widening wins! **/
    
    /** Boxing vs var-args**/
    //primitive arguments -> wrapper parameters
    myMethodWrapper((byte)0,(byte)0);
    //=>JVM choses Boxing
    /** Boxing wins! **/
    
    /** 2 params vs vargars **/
    myMethodTest(0, 0);
    /** 2 params **/
    
    /** Cannot do widening + boxing **/
//    myMethodWrapper2(b1);//forbidden
    
    //widening + var-args ->  OK
    myMethodWrapper3(b1,b2);
    /** But boxing + var-args -> OK **/
    myMethodWrapper3(b1,b2);
    /** boxing + IS-A test -> OK **/
    myMethodObject((byte)1);
    //=> byte -boxing-> Byte -ISA-> Object

    /*************************************/
   /** See page 254 for rules          **/
  /*************************************/
    
  }
  public static void myMethod(int i){System.out.println("INT");}
  public static void myMethod(long l){System.out.println("LONG");}
  public static void myMethod(double d){System.out.println("DOUBLE");}
  
  public static void myMethod(Integer i){System.out.println("INT Wrapper");}
  public static void myMethod(Long l){System.out.println("LONG Wrapper");}
  public static void myMethod(Double d){System.out.println("DOUBLE Wrapper");}
  
  public static void myMethodShort(Short s){System.out.println("Short short");}
  public static void myMethodShort(int i){System.out.println("Int short");}
  
  public static void myMethodWrapper(Integer i){System.out.println("Wrapper INT Wrapper");}
  public static void myMethodWrapper(Long l){System.out.println("Wrapper LONG Wrapper");}
  public static void myMethodWrapper(Double d){System.out.println("Wrapper DOUBLE Wrapper");}  
  
  public static void myMethod(int x, int y){System.out.println("int int");}
  public static void myMethod(byte... args){System.out.println("byte...");}
  
  public static void myMethodWrapper(Byte x, Byte y){System.out.println("Wrapper byte byte");}
  public static void myMethodWrapper(Byte... args){System.out.println("Wrapper byte...");}
  
  public static void myMethodWrapper2(Integer i){System.out.println("Wrapper2 int");}
  public static void myMethodWrapper3(int... args){System.out.println("Wrapper3 int...");}
  
  public static void myMethodObject(Object o){System.out.println("Object");}
  
  public static void myMethodTest(int x, int y){System.out.println("2 params");}
  public static void myMethodTest(int... args){System.out.println("varargs");}
}
