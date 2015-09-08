package be.zatenzu.oca.js8.initialization;

/**
 * Created by tda on 15/08/2015.
 */
public class Main{
  /**
   * Order of initialization
   * 1) Super static vars and static blocs in order they appear in the file
   * 2) Static vars and static blocs in order they appear in the file
   * 3) Super instance vars and instance blocs in order they appear in the file
   * 4) Instance vars and instance blocs in order they appear in the file
   * 5) Constructors, super -> current
   */
  //if a static bloc, call constructor, keep rule 4 before 5! @see at page 204
  public static void main(String[] args){
    new Child();
  }
}
