package be.zatenzu.oca.js8.developement;

/**
 * Created by tda on 26/07/2015.
 */
public class Main{

  /** javac [options] [source files] **/
  /*
    javac be/zatenzu/oca/js8/developement/Main.java
    Compile the class et create be/zatenzu/oca/js8/developement/Main.class file in the current directory
  */

  /** java [options] class [args] **/
  /*
    java be.zatenzu.oca.js8.developement.Main.class
    run the Main class.
    .class isn't required
   */

  //classpath
  //java -cp ".;c:/tmp/myjar.jar;c:/directory" be.zatenzu.oca.js8.developement.Main.class
  //run Main with current the directory, myjar.jar and c:/directory content in the classpath.

  //java -cp "c:/tmp/myjar.*" be.zatenzu.oca.js8.developement.Main.class
  //run Main with all jar in the c:/tmp/myjar directory in the classpath. Sub directories aren't included.
}
