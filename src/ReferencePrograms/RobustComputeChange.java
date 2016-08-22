package ReferencePrograms;

import javax.swing.JOptionPane;

/*RobustComputeChange.java: Break down an amount into smaller units This example also shows you how to fetch the integer and fractional part of a floating value. 
  It can detect the wrong entry.
 */

public class RobustComputeChange {
  /** Main method */
  public static void main(String[] args) {
    double amount=0; // declare a double type variable amount and initialize it to 0

    // Receive the amount entered from the keyboard in String format
    String amountString = JOptionPane.showInputDialog(null,
    "Enter an amount in double");
    //if you enter 100.9, amountString will have value "100.9", not 100.90

    try{
      /* Convert String type value in amountString to double type value 
    	and assign the double value to variable amount*/ 
      amount = Double.parseDouble(amountString);
      //amount = Integer.parseInt(amountString);//if user enter an int type value
    }catch(Exception e){
      JOptionPane.showMessageDialog(null, "wrong entry, the amount should be a double value.\nPlease run the program again");
      System.exit(0);
    }
    // Find the number of one dollars
    //cast double type amount to int to remove cents and get dollars only
    int numOfOneDollars = (int)amount; 
   
    // Find the number of cents in the remaining amount
    int numOfCents = (int)((amount - numOfOneDollars)*100);
    
    // Display results
    String output = "Your amount " + amount + " consists of \n" + 
      numOfOneDollars + " dollars\n" + 
      numOfCents + " cents\n";
    
    JOptionPane.showMessageDialog(null, output, 
      "Compute Change Output", JOptionPane.INFORMATION_MESSAGE);

    System.exit(0);
  }
}