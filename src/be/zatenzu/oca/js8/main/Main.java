package be.zatenzu.oca.js8.main;

class Main{

  /* legal main declarations */
//  public static void main(String[] args){System.out.println("Hello world from non public class");}
//  public static void main(String args[]){System.out.println("Hello world from non public class");}
//  static public void main(String... args){System.out.println("Hello world from non public class");}
//  public static void main(String abbalblalba[]){System.out.println("Hello world from non public class");}
//  public static void main(String abbalblalba[]) throws Exception {System.out.println("Hello world from non public class");}

  /* illegal main declarations */
//  static void main(String[] args){}//must be public
//  public void main(String[] args){}//must be static
//  public static void main(String agrs){}//must take a String array parameter (or varargs)
//  public static void main(String[] agrs, int i){}//must take only a String array parameter (or varargs)
//  public static int main(String... args){return 0;}//must return void
//  public static void Main(String[] args){System.out.println("Hello world from non public class");} -> NoSuchMethodException
}