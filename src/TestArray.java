import java.util.Scanner;

// TestArray.java: Display the array element value and find the largest number

public class TestArray {
  /** Main method */
  public static void main(String args[]) {
    
    int  [] numbers = new int[6];//one of the way to declare and create an array
   
    //numbers=new int [8];//not change array size, but associate the numbers array to different actiual array in memory
    //arraySize is 6. All the element is int type data.
    //int number[6]; //wrong in Java
    //double [] d = {1.0, 3, 5,8.9};//declare, create and initialized a double array
    
    //Get element value one by one from keyboard 
    Scanner sc=new Scanner(System.in);
    for (int i = 0; i <numbers.length; i++) {//numbers.length returns the array size;
      System.out.println("Please enter a Integer number:");
 
      numbers[i] = sc.nextInt();//assign user entered value each array element
    }

   
    // Find the largest 
    int maxValue = numbers[numbers.length-1];//store last element value to variable maxValue
    for (int i = 0; i < numbers.length; i++) {
      //if (maxValue < numbers[i]) maxValue = numbers[i];
        maxValue=Math.max(maxValue, numbers[i]);//alternative way, use Math class method
        
    }

    // Prepare the print out
    
    String output = "The array have numbers: ";
    for (int i = 0; i < numbers.length; i++) {
      output += numbers[i] + " ";
    }

    output += "\nThe largest number is " + maxValue;

    // Display the result
    System.out.println( output);
    
    // System.out.println("Extra\n"+ numbers);
    //the above statement prints reference value of array variable, not the array elements' values 
    sc.close();
  }
}