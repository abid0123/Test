
/* 
This program computes and displays the factorial of an integer input by the user
   fact(n) = 1 * 2 * 3 * ... * n
   e.g. fact(5) = 1 * 2 * 3 * 4 * 5
   fact(0) = 1
This program also demonstrates the use of while loop
You can try to implement this using "for" or "do-while" loop
*/
package ReferencePrograms;
import java.util.Scanner;

public class FractorialLp 
{
   public static void main(String args[]){

   // get user input
   System.out.println("Please enter a positive integer below:");
   Scanner sc=  new Scanner(System.in);   int num =  sc.nextInt();

   // factorial will store the incremental as well as final result
   int factorial = 1; 
   int count = 1; // count will be used as loop control variable
   while (count <= num)
   {
     factorial = factorial * count;
     count++; // remember to update the loop control variable, 
              // otherwise, loop will never end
   }

   // display the result
   System.out.println(num + "'s factorial is " + factorial);

   }
}