package be.zatenzu.oca.js8.lambda.a;

/**
 * Created by tda on 19/08/2015.
 */
public class Personne{

  int age;
  String firstName;
  String lastName;

  public Personne(String firstName, String lastName, int age){
    this.age=age;
    this.lastName = lastName;
    this.firstName = firstName;
  }

  public int getAge(){
    return age;
  }

  public void setAge(int age){
    this.age = age;
  }

  public String getFirstName(){
    return firstName;
  }

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public String getLastName(){
    return lastName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public void print(){
    System.out.println(this.firstName + " " + this.lastName + " " + this.age + " ans");
  }
}
