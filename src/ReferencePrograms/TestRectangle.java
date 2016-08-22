//This program creates object of Rectangle class. 
package ReferencePrograms;
public class TestRectangle{//main class with main method for creating objects
  public static void main(String[] args){//main method
    Rectangle myRectangle = new Rectangle();//myRectangle object created with l=b=0
    System.out.println("The area of myRectangle is " + myRectangle.calcArea());
    myRectangle.setRectangle(10.0, 5.0);//l=10.0 and b= 5.0 set
    System.out.println("The area of myRectangle is " + myRectangle.calcArea());    
  }
}