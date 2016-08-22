package ReferencePrograms;

import java.util.Scanner;

import javax.swing.JOptionPane;

// ComputeMortgage.java: Compute mortgage payments

public class ComputeMortgage {
  /** Main method */
  public static void main(String[] args) {
    double annualInterestRate;
    int numOfYears;
    double loanAmount;
    
    // Enter yearly interest rate
    System.out.println("Please enter yearly interest rate:");
    Scanner input = new Scanner(System.in);
    annualInterestRate = input.nextDouble();
   
    // Obtain monthly interest rate
    double monthlyInterestRate = annualInterestRate/1200;
    
    // Enter number of years
    System.out.println("Please enter number of years:");
 
    numOfYears = input.nextInt();
    
    System.out.println("Please enter loan amount:");
  
    loanAmount =  input.nextDouble();

    // Calculate payment
    double monthlyPayment = loanAmount * monthlyInterestRate /
      (1 - 1 / Math.pow(1 + monthlyInterestRate, numOfYears * 12));
    double totalPayment = monthlyPayment * numOfYears * 12;
    
    // Format to keep two digits after the decimal point
    monthlyPayment = (int)(monthlyPayment * 100) / 100.0;
    totalPayment = (int)(totalPayment * 100) / 100.0;
    
    // Display results
    String output = "The monthly payment is " + monthlyPayment + 
      "\nThe total payment is " + totalPayment;
    JOptionPane.showMessageDialog(null, output); 

  }
}