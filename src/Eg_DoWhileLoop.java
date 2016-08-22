/* 
   This program adds up the user-input integers.
*/
import java.util.Scanner;

public class Eg_DoWhileLoop 
{
  public static void main(String[] args)
  {
   int data;
   int count = 0;
   int sum = 0;
   do{
       System.out.println("Please enter an int value, \nthe program exits if the input is 0");
	   Scanner sn = new Scanner(System.in);
	   data= sn.nextInt();
	   /*//Dialogbox way to get user input
	    String dataString = JOptionPane.showInputDialog(null,
      "Enter an int value, \nthe program exits if the input is 0");
      data = Integer.parseInt(dataString);
      */
      count++;
      sum = sum + data;
   } while (data > 0);//run the loop first, then compare the condition
   //the loop will continue to run so long when the value of data is larger than 0
      
 //the loop ends when the value of data is not larger than 0
 //now the rest of code of the program  
      sum=sum-data;
      System.out.println("sum is " + sum);
      System.out.println("The average: "+ sum*1.0/(count-1));
  }
}   
      