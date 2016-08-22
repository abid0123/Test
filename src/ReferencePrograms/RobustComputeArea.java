package ReferencePrograms;

import java.util.InputMismatchException;
import java.util.Scanner;

/* RobustComputeArea.java: read a data from keyboard then compute the area of a circle
	   Scanner class is imported and used.
	   If user enter an invalid number, like a string, the program will detect the error and prompt user what to do.
*/
public class RobustComputeArea {

	  /** Main method */
	  public static void main(String args[]) {
	    double radius;//declare a variable, data type is double, variable name is radius
	    double area;
	    final double PI = 3.14159;//declare a constant with keyword final, whose value cannot be changed later
	   
	    System.out.println("Please move cursor/mouse to console window and \n enter a double type of value below:");
	    //get a double type of input from keyboard and assign it to variable radius
	    Scanner sc = new Scanner(System.in);//key in a double type value in console, Click Window|Show View|Console to show console window
	    
	    try{
	    	radius = sc.nextDouble();//nextInt(), nextLong(),nextInt(),nextLine(),next(),nextBoolean()
	        //radius =100;//the variable value can be changed to override input value.

     	    // Compute area
	       area = radius * radius * PI;//expression
	    
	       // Display results
	      System.out.println("The area for the circle of radius " +
	      radius + " is " + area);
	  }catch(InputMismatchException e){//catch a invalid input exception and handle it
		  System.out.println("You entered a non-number which is a invalid input.\nPlease run the Java application again with valid input.");
	  }
	   
	}

}
