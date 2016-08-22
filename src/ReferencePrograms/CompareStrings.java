// This program compares two strings entered by users and displays the result.
package ReferencePrograms;

import java.util.Scanner;

public class CompareStrings{//main class
  public static void main(String[] args) {//main method
    String result;// string for displaying result
    Scanner sc=  new Scanner(System.in);
    System.out.println("Please type the first string:");
    String firstString = sc.nextLine();
    System.out.println("Please type the second string:");
    String secondString =  sc.nextLine();
    
    if (firstString.equals(secondString))// string comparison using 'equals' method.
      result = "The two strings are equal.";
    else
      result = "The two strings are NOT equal."  ;    
    System.out.println(result);      
  }
}