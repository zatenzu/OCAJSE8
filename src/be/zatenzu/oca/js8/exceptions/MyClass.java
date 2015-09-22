// $Id$
package be.zatenzu.oca.js8.exceptions;


public class MyClass
{
  /** See also try, catch, finally, throw and throws keywords **/
  //all error, exception, runtimeexception and throwable can be catch or throw
  //If it is impossible for one of the catch blocks to be executed, a compiler error about unreachable code occurs.
  
  public static void main(String[] args)
  {
    /** All Exceptions must be handle or declared by throws clause excepted RunTimeException! **/
    try{
      throwException();
      throwRuntimeException();
      throwError();
    }
    catch(MyRuntimeException mex){}//legal but unneeded
    catch(MyError err){}//legal but unneeded
    catch(MyException ex){//catch MyException is required
    }
    
    
//    catchMethod();// Compilator error!
    //catchMethod catch MyException but declare throws MyException, so you need to catch it
    
  }
  
  public static void throwRuntimeException() throws MyRuntimeException{//no catch and no throws!
    throw new MyRuntimeException();//RuntimeException can be throw
  }
  public static void throwException() throws MyException{ //throws MyException is needed because it isn't handled
    throw new MyException();
  }
  public static void throwError() throws MyError{ //throws MyError is useless because it is an Error
    throw new MyError();//error can be throw
  }
  public static void catchMethod() throws MyException
  {
    try{
      throwException(); 
    }catch(MyException mex){
      
    }
  }
  
  //try
  //catch(MotherException ex)
  //catch(ChildException ex) --> Unreachable code
  
  /**
  try {
    throw new RuntimeException();
  } catch (RuntimeException e) {
    throw new RuntimeException();
  } finally {
    throw new Exception();
  }
  */
  // The exception from the catch block gets forgotten
  // if the finally block doesn't throw something, the exception from
  //the catch block is keeped.

  public static void unNeededToThrowSomeThing() throws Error, Exception, RuntimeException{
    //throws nothing but compile fine.
  }
}
