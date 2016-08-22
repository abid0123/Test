package ReferencePrograms.oop7TestPrism;

//This program creates object of Cube class which is a subclass of Rectangle class.
public class TestPrism{//main class to create object
  public static void main(String[] args){//main 
    Prism myPrism = new Prism();//object myPrism created
    System.out.println("The base area of myPrism is " + myPrism.calcArea());//calcArea method of superclass used
    myPrism.setRectangle(10.0, 5.0);//l=10.0 and b= 5.0 set for the base of myPrism
    System.out.println("The base area of myPrism is " + myPrism.calcArea());
    System.out.println("The volume of myPrism is " + myPrism.calcVolume());
  }
}


