package oop8TestEdible;
public class Chicken extends Animal implements Eatable {
  public void howToCook(){//implement interface Eatable's method
	System.out.println("Steam it with hurb");
  }

public String toString() {//override parent class Animal's methods
    return "Chicken";
}

public static void main(String[] a){

	Chicken sakuraChicken=new Chicken();
        //System.out.println("About "+sakuraChicken);
	System.out.println(sakuraChicken/*.toString()*/ +" cooking instruction:");
    sakuraChicken.howToCook();//howToCook() is a void method

  }
}