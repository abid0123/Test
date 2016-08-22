// TestMethodOverloading.java: Demonstrate method overloading
public class TestMethodOverloading {
  /** Main method */
  public static void main(String[] args) {
    // Invoke the max method with int parameters
    System.out.println("The maximum between 3 and 4 is "
      + max(3, 4));
    
    // Invoke the max method with the double parameters
    System.out.println("The maximum between 3.0 and 5.4 is "
      + max(3.0, 5.4));

    // Invoke the max method with three double parameters
    System.out.println("The maximum between 3.0, 5.4, and 10.14 is "
      + max(3.0, 5.4, 10.14));
    
    //which method is called in the statement below?
    System.out.println("The maximum between 4.1 and 4 is "+max(4.1, 4));
  }

  /** Return the max between two int values */
  public static int max(int n1, int n2) {
	    if (n1 > n2)
	      return n1;
	    else
	      return n2;
  }
 
  /** Find the max between two double values */
  public static double max(double num1, double num2) {
    if (num1 > num2)
      return num1;
    else
      return num2;
  }

  public static double max(int num1, double num2) {
	    if (num1 > num2)
	      return num1;
	    else
	      return num2;
	  }  
  /** Return the max among three double values */
  public static double max(double num1, double num2, double num3) {
    return max(max(num1, num2), num3);
  }
}