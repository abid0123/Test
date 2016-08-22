/* This program output msg "Welcome to Java!"
   many times - depending on the user-input integer.
*/
import java.util.Scanner;
public class Eg_ForLoop 
{
  public static void main(String[] args)
  {
   System.out.println( "Please enter an integer here:");
   Scanner input = new Scanner(System.in);
   int number = input.nextInt();
   //int i = 0;//enable it if the first part of for loop is removed
   for (int i = 0; i<number; i++ ) {
	  
	   System.out.println(i+1 + ": Duke welcomes you to Java!");
	   //i++;//enable it if the last part of for loop is removed
       //System.out.println("Pls bring your laptop for the rest of lessons");
      
   }
   input.close();
  }
}  
