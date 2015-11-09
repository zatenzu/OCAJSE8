package be.zatenzu.oca.js8.iimport.staticimport;

/**
 * Created by tda on 10/10/2015.
 */
import java.util.List;
import static be.zatenzu.oca.js8.iimport.packageA.A.myStaticVarFromPackageA;//import only this static members
import static be.zatenzu.oca.js8.iimport.staticimport.OtherClass.*;//import all static members

import static java.util.Arrays.asList;

//static import java.util.Collections.sort;//static import forbidden

public class Main{

/**
 * RULES:
 *
 * - Can only import static members from an other class or interface
 * - Can only import visible static members but no compilation error on the import line
 * - Cannot import more than one static methods with the same signature -> Compilation error
 * - Cannot import more than one static fields that have the same name -> Compilation error
 */
  public static void main(String[] args){
    asList();//Don't need to import java.util.List;
    List<Object> list = asList(1, 1, 1);//Need to import java.util.List
    System.out.println(myStaticVarFromPackageA);
  }
}
