package be.zatenzu.oca.js8.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

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
  //UnsupportedTemporalTypeException, extends DateTimeException
  //DateTimeParseException, extends DateTimeException

  //IllegalArgumentException (only by programmer)

  //NullPointerException

  //NumberFormatException extends IllegalArgumentException (only by programmer)
  //parseXxxxx(String s) and valueOf(String s) (@see wrappers)

  //UnsupportedOperationException
  //When an unauthorized operation is done. example: remove on a backed list

  //NoSuchElementException
  //iterator.next when hasNext() return false;

  /** Exception */
  //FileNotFoundException -> reference to a non-existing file
  //extends IOException

  //IOException -> error during read or write data (only by programmer)

  //ParseException -> DateFormat df; df.parse("22/02/2015") (old api date)

  /** Error */
  //Errors are intended to be thrown by the JVM, not by the programmer
  //ExceptionInInitializerError -> Thrown by the JVM when a static initializer throws an exception and doesn't handle it
  //static initializer = code who runs during init static class block
  //if the static bloc throw exception (ex:IndexOutOfBoundsExc) we get a ExceptionInInitializerError instead

  //StackOverflowError ->

  //NoClassDefFoundError -> Thrown by the JVM when a class that the code uses is available at compile time but not runtime


  /** declaration rules **/

  //checked
  public void method() throws IOException{
//    throw new Exception();//cannot throw a super exception of the exception that is declare with throws keyword
  }
  public void method2() throws IOException{
    //nothing required
  }
  public void method3() throws IOException{
    throw new FileNotFoundException();//can throw sub class
  }

  //unchecked
  public void method4() throws IndexOutOfBoundsException{
    //nothing required
  }
  public void method5() throws RuntimeException{
    throw new IndexOutOfBoundsException();//can throw sub class of runtime
  }
  public void method6() throws IndexOutOfBoundsException{
    throw new RuntimeException();//can throw super class
  }

  //catch rules
  public static void main(String[] args){
    try{
      System.out.println("Hellow world");
    }
    catch(IndexOutOfBoundsException e){}
    catch(RuntimeException e){}
//    catch(ParseException e){} -> ParseException cannot be thrown in the try
    catch(Exception e){}
    catch(Error e){}
  }
}
