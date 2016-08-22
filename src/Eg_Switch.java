/* This program asks user for an integer and
   output a message to report whether the integer is odd or even.
*/   
import java.util.Scanner;

public class Eg_Switch
{
  public static void main(String[] args)
  {
	  System.out.println("Please enter an integer below:"); 
	  Scanner sc =  new Scanner(System.in);//let user enter a value
	  int number = sc.nextInt(); //assign the user entered int type of value to variable number
	
	   switch (number%2){//number%2 will get the remainder after numner/2
	   	case 0: System.out.println(number + " is even.");//if the remainder is 0
	   			break;//jumpt out of switch block
	   	case 1: System.out.println(number + " is odd.");//if the remainder is 1
               	break;//jumpt out of switch block
   		
	   	default: System.out.println("Error.");//default means all the rest cases, e.g.if the remainder is neither 0 nor 1
   }

   //Hands on: PROPMT USER TO ENTER A DAY 1--5, THEN print out that day's module name in your timetable
   sc.close();
  }
}  
