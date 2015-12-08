package be.zatenzu.oca.js8._class;

/**
 * Created by tda on 3/09/2015.
 */
//class public  Main{//access before class is forbidden
public class Main{
  /**
   *
   * Only one public class per file
   * The file name must match with the public class name
   * A file can content more than 1 non-public class
   * A file with no public class can have a name different from class name
   * Only public, default package, abstract and final!
   *
   */
  public void myMethod(){}//; not require because there is a body. Abstract method required ;
//  void public myMethod(){}//; return type before access is forbidden
  final public void myMethod3(){}//final, abstract or static can be before access modifier
}