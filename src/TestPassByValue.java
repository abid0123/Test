// TestPassByValue.java: Demonstrate passing values of simple data type to methods
public class TestPassByValue {
  /** Main method */
  public static void main(String[] args) {
     // Declare 2 variables to hold two numbers and initialize the variables
    int n1 = 1;
    int n2 = 2;

    System.out.println("Before invoking the swap method, number 1 is " +
      n1 + " and number 2 is " + n2);

    // Invoke the swap method to attempt to swap two variables
    swap(n1, n2);
    //a copy of n1 and n2's value in main method will be passed to swap method parameter n1 and n2. 
    
    //void method, the call to it is a statement.
    //System.out.println(swap(n1,n2));//this statement is wrong as swap() returns nothing, so a call to it can't be printed.
    
    System.out.println("After  invoking the swap method, number 1 is " +
      n1 + " and number 2 is " + n2);//r main method n1, n2's values changed?
  }

  /** Swap two variables. swap method takes two int type of data, returns nothing */
  public static void swap(int n1, int n2) {
	//parameter n1 and n2 belongs to swap method and have their own memory location, different from n1, n2 in main method 
    System.out.println("    Inside the swap method");
    System.out.println("    Before swapping n1 is " + n1
      + " n2 is " + n2);

    // Swapping n1 with n2
    int temp = n1;//temp is a variable to hold data temporarily
    n1 = n2;
    n2 = temp;

    System.out.println("    After  swapping n1 is " + n1
      + " n2 is " + n2);
    return;
  }
}