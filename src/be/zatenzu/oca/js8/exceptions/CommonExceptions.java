package be.zatenzu.oca.js8.exceptions;

/**
 * Created by tda on 20/08/2015.
 */
public class CommonExceptions{
  /** RuntimeException */
  //ArithmeticException -> divide by zero

  //ArrayIndexOutOfBoundsException

  //ClassCastException
  String type = "moose";
  Object obj = type;
  Integer number = (Integer) obj;

  //DateTimeException -> see time package

  //IllegalArgumentException

  //NullPointerException

  //NumberFormatException extends IllegalArgumentException
  //parseXxxxx(String s) and valueOf(String s) (see wrappers)

  //UnsupportedOperationException
  //When an unauthorized operation is done. example: remove on a backed list

  /** Exception */
  //FileNotFoundException -> reference to a non-existing file
  //extends IOException

  //IOException -> error during read or write data

  //ParseException -> DateFormat df; df.parse("22/02/2015") (old api date)

  /** Error */
  //ExceptionInInitializerError -> Thrown by the JVM when a static initializer throws an exception and doesn't handle it
  //static initializer = code who runs during init static class block
  //if the static bloc throw exception (ex:IndexOutOfBoundsExc) we get a ExceptionInInitializerError instead

  //StackOverflowError ->

  //NoClassDefFoundError -> Thrown by the JVM when a class that the code uses is available at compile time but not runtime

}
