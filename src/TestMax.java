
// TestMax.java: demonstrate using the user designed max method
public class TestMax {
  
  /** Return the bigger value between the two input double numbers */

//max method below takes two int type of input, return(produce) an int type value
  public static int max(int num1, int num2) {//num1 and num2 are input para
	    int result;//declare a int type variable to hold a bigger value of the two inputs

	    if (num1 > num2)
	      result = num1;
	    else
	      result = num2;
	    return result;//return the int type value in variable result
	  }


  /** Main method */
 public static void main(String[] args) {
    int i = 5;
    int j = 2;

    int k = max(i,j);//i and j are actual para of method max
    /*i and j are int type, compatible with max's formal para data type
      return type of max() is int, the call to it is replaced by its returned value*/
    System.out.println("The maximum between " + i +
      " and  " + j + " is " + k);
    
    //System.out.println("The maximum between 89.0 and 67.1 is " + max(89.0, 67.1)); //wrong as wrong input data type for method parameters
    
    // below statement calls the max method which accepts two double input, the method call will be replaced by its return value 3.0 and is directly printed out
    //System.out.println("1.0 + 3.0="+max(1.0, 3)); 
    //max(1.0, 3);//return value not used, not recommended.	
 }

}