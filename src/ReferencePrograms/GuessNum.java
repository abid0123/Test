
/* 
This program gets the user to guess a positive integer 
  Hints will be provided to tell the user if his guess is too big or too small
  The program will report the number of tries the user use to guess the number
  
This program also demonstrates the use of do-while loop and if-else control
*/
package ReferencePrograms;

import java.util.Scanner;

public class GuessNum
{
   public static void main(String[] args){

   int answer = 100, guess = 1, tries = 0;
  
   Scanner sc = new Scanner(System.in);

   do {
      // get user input
      System.out.println( "Guess a positive integer");
      
      guess = sc.nextInt();;   

      if (guess > answer)
      {
        System.out.println( "Your guess is too big, please try again.");
      }
      else
      {
        if (guess < answer)
        {
            System.out.println( "Your guess is too small, please try again.");
        }
      }
      tries++;
      if (tries>10) {
    	  System.out.println("You're exceed 10 tries. Bye!");
    	  System.exit(0);
      }
   } while (guess != answer); // the loop exit when guess is the same as answer
   
   System.out.println("You're tried "+tries+" times to got the right number!");

   } // end main()
} // end class