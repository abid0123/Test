/*ComputeChange.java: Break down an amount into smaller units
 * This example also shows you how to fetch the integer and fractional part of a floating value
 */
import java.util.Scanner;

public class ComputeChange {
  /** Main method */
  public static void main(String[] arg) {
    double amount; // declare variable amount as double type

    System.out.println("Please move cursor/mouse to console window and \n enter an amount of money:");
    //get a double type of input from keyboard and assign it to variable amount
    Scanner sc = new Scanner(System.in);//key in a double type value in console, Click Window|Show View|Console to show console window
    amount = sc.nextDouble();//nextInt(), nextLong(),nextInt(),nextLine(),next(),nextBoolean()
    // amount=sc.nextInt();//If user enter an int type value(integer)

    // Find the number of one dollars
    //cast double type amount to int to remove cents(decimal part) and keep dollars(integer part) only
    int numOfOneDollars=(int)amount; 

    // Find the number of cents in the remaining amount
    int numOfCents = (int)((amount - numOfOneDollars)*100);
    
    // prepare message for display
    String output = "Your amount " + amount + " consists of \n" + 
      numOfOneDollars + " dollars\n" + 
      numOfCents + " cents\n";
    
    //display results
   System.out.println(output);
   
   //display numeric value in certain format, like how many number after decimal point
   System.out.printf("You entered total amount %.2f", amount);//print amount value with 2 position after decimal point, e.g. 100.10

  }
}