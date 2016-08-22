package ReferencePrograms;
// UseMathMax.java: using class Math's method max(int a, int b) to find the bigger value
public class UseMathMax {
  /** Main method */
  public static void main(String[] args) {
    int i = 5;
    int j = 2; 
    int k = Math.max(i, j);//i and j are actual para of method max
    /*class Math's method max(int a, int b) return the bigger value of a and b,
     the call to it is replaced by its returned value*/

    System.out.println("The maximum between " + i +
      " and " + j + " is " + k);
  
  }

}
