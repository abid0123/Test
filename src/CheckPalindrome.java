import java.util.Scanner;

// CheckPalindrome.java: Check whether a string is a palindrome


public class CheckPalindrome {
  /** Main method */
  public static void main(String[] args) {
    // Prompt the user to enter a string
    System.out.println("Please enter a string:"); 
    Scanner sc=  new Scanner(System.in);
    String s = sc.nextLine();
    // Declare and initialize output string
    String output = "";

    if (isPalindrome(s)) 
      output += s + " is a palindrome.";
    else 
      output += s + " is not a palindrome.";
    
    // Display the result
    System.out.println(output); 
    sc.close();
  }

  /** Check if a string is a palindrome */
  public static boolean isPalindrome(String s) {
    // The index of the first character in the string
    int low = 0;

    // The index of the last character in the string
    int high = s.length() - 1;

   /*String s1 = String.valueOf(3.4);
    System.out.println(s1);*/	
    while (low < high) {
      if (s.charAt(low) != s.charAt(high))
        return false; // Not a palindrome, return to main method, 
                       //skipping the rest statements in this method
        low++;//previous pair equals, continue to compare next pair 
        high--;
    }
	
    return true; // The string is a palindrome
  }
}