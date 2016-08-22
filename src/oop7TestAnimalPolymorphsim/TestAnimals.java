//Poly morphism
package oop7TestAnimalPolymorphsim;
public class TestAnimals {
  
  public static void main(String[] args) {
        Pig babe = new Pig();//Pig subclass object
		Cow cutie =new Cow();//Cow subclass object
        Snake glass =new Snake();
		Animal wild=new Animal();//superclass object reference
		wild=cutie;//superclass object behaving like Cow subclass object
		wild.talk();// so uses Cow subclass talk() method
		wild=babe;//superclass object behaving like Pig subclass object
		wild.talk();// so uses Pig subclass talk() method
        wild = glass;
        wild.talk();//Snake does not override talk(), Animal's talk() called
        
  }
  
 
}

