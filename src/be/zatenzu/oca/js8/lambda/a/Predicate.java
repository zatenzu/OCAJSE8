package be.zatenzu.oca.js8.lambda.a;

/**
 * Created by tda on 19/08/2015.
 */
public interface Predicate<T>{

  boolean test(T t);
//  default boolean test1(T t); doesn't work with default method

}
