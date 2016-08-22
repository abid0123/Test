import java.util.Scanner;

/* This program asks user for an integer and
   output a message to report whether the integer is odd or even.
*/   

public class Eg_IfElse 
{
  public static void main(String[] ags)
  {
   System.out.println( "Please enter an integer here:");
   Scanner sc = new Scanner(System.in);
   int number = sc.nextInt();
 
   if (number%2==0){ //if the remainder of number/2 is 0
	    System.out.println(number + " is even.");
   }
   else{//if the remainder of number/2 is not 0
		   System.out.println(number + " is odd.");
   }
  
   //(condition)?valueIfTrue:valueIfFalse----shorthand for if--else
   System.out.println(number + " is "+((number>0)?"positive.":"non-positive."));
   sc.close();
  }
}  