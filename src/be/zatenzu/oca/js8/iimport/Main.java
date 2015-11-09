package be.zatenzu.oca.js8.iimport;

import java.util.*;//import all classes in the java.util package but not child packages
import java.util.Calendar;//import Calendar class
import java.lang.*;// -> useless, this package is auto imported in each classes
//can import a class or package content but
//cannot import a package or class content

//see in staticc package for static import

/*Illegal import*/
//import java.util;//cannot import package
//import java.util.*.*;//cannot have to wildcards
//import java.util.Random.*;//can only import class, not class content.

//You cannot import two times a class with the same name
//import be.zatenzu.oca.js8.iimport.packageA.A;
//import be.zatenzu.oca.js8.iimport.packageB.A;

//Only packageB.A class is imported because explicit import win against wildcard!
import be.zatenzu.oca.js8.iimport.packageA.*;
import be.zatenzu.oca.js8.iimport.packageB.A;

//if two wild cards, A must be imported explicitly
//import be.zatenzu.oca.js8.iimport.packageA.*;
//import be.zatenzu.oca.js8.iimport.packageB.*;

public class Main{
  A a;
}