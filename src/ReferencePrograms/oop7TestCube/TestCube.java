//This program creates object of Cube class which is a subclass of Rectangle class.
package ReferencePrograms.oop7TestCube;
public class TestCube{//main class to create object
  public static void main(String[] args){//main 
    Cube myCube = new Cube();//object myCube created
    System.out.println("The base area of myCube is " + myCube.calcArea());//calcArea method of superclass used
    myCube.setRectangle(10.0, 5.0);//l=10.0 and b= 5.0 set for the base of myCube
    System.out.println("The base area of myCube is " + myCube.calcArea());   
    System.out.println("The volume of myRectangle is " + myCube.calcVolume());       
  }
}


