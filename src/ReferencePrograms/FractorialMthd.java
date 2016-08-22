package ReferencePrograms;
/* 

This program call a method which computes the factorial of an integer input by the user
   fact(n) = 1 * 2 * 3 * ... * n
   e.g. fact(5) = 1 * 2 * 3 * 4 * 5
   fact(0) = 1
This program also demonstrates the use of while loop
You can try to implement this using "for" or "do-while" loop
*/

import java.util.Scanner;

public class FractorialMthd
{
   public static void main(String args[]){

   // get user input
		Scanner sc = new Scanner(System.in);
		//prompt user to key in 2 floating point values
		System.out.println( "Please enter a positive integer:");
 	
       int num = sc.nextInt(); 

     // display the result
      System.out.println(num + "'s factorial is " + calFractorial(num));
   
      System.exit(0);
   }

   public static double calFractorial(int n){
    int factorial = 1; 
    int count = 1; // count will be used as loop control variable
    while (count <= n)
    {
     factorial = factorial * count;
     count++; // remember to update the loop control variable, 
              // otherwise, loop will never end
    }
    return factorial;
   } 
}