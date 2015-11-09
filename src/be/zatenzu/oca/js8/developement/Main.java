package be.zatenzu.oca.js8.developement;

/**
 * Created by tda on 26/07/2015.
 */
public class Main{

  /** javac [options] [source files] **/
  /*
    javac be/zatenzu/oca/js8/development/Main.java
    Compile the class et create be/zatenzu/oca/js8/development/Main.class file in the current directory

    javac Main.java (Main.java is in be.zatenzu package but not in a be/zatenzu/ directory)
    it compiles fine and creates Main.class in the current directory but if you try to run java Main, the
    class will not found. You must put Main.class in a be/zatenzu/ directory and call java be.zatenzu.Main
  */

  /** java [options] class [args] **/
  /*
    java be.zatenzu.oca.js8.developement.Main
    run the Main class.
    if you run java be.zatenzu.oca.js8.developement.Main.class (with .class)
    -> Erreur : impossible de trouver ou charger la classe principale be.zatenzu.oca.js8.developement.Main.class
   */

  //classpath
  //java -cp ".;c:/tmp/myjar.jar;c:/directory" be.zatenzu.oca.js8.developement.Main
  //run Main with current the directory, myjar.jar and c:/directory content in the classpath.

  //java -cp "c:/tmp/myjar/*" be.zatenzu.oca.js8.developement.Main.class
  //run Main with all jar in the c:/tmp/myjar directory in the classpath. Sub directories aren't included.
}
