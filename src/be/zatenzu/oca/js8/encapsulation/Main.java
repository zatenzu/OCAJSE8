package be.zatenzu.oca.js8.encapsulation;

/**
 * Created by tda on 15/08/2015.
 */
public class Main{

  /** JavaBeans standards **/

  //GET
  //getVarName()
  // - no argument
  // - return the type of the var
  // - camel case
  // - must be public

  //IS
  //must be isVarName()
  // - only if the var is a boolean PRIMITIVE
  // - return a boolean PRIMITIVE
  // - camel case
  // - must be public

  //SET
  // - must be setVarName(vartype var)
  // - Only 1 argument with the same type as var
  // - camel case
  // - must be public

  //Listener
  // add/removeAListener(AListener listener)
  // - must start with add or remove
  // - must end with ListenerA
  // - must take 1 argument type of Listener

  /** Cohesion and Coupling **/
  //Coupling is the degree that one class knows about another
  // - Loose coupling -> GOOD
  //Cohesion is used to indicate the degree to which a class has single well focused purpose
  // - Tight coupling (couplage serré) -> BAD
}