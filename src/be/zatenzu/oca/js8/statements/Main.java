package be.zatenzu.oca.js8.statements;

/**
 * Created by tda on 2/08/2015.
 */
public class Main{

  public static void main(String[] args){
    /** ternary operator  */
    boolean b = true ? true : false;// boolean expression ? if the expression is true : if the expression is false
    /* double ternary operator  */
    boolean bb = true ? true ? true : false : false;
    //short circuit!

    /** switch */
    //only with:
    // byte, short, char, int and their wrappers
    // String and enum
    // compiled final var! 1*1, (int) 'A', ect ... are compiled final var


    //empty statement is allowed
    if(true){
    }
    else{
    }
    for(int i = 0 ; i < 9 ; i ++){}

    /** do while */
    do{}while(true);//; is required!

  }

}
