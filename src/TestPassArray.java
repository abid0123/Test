// TestPassArray.java: Demonstrate passing arrays to methods
public class TestPassArray {
  /** Main method */
  public static void main(String[] args) {
    int[] a = {1, 2};//one of the way to declare, create and initilaise array
    // int j[9];//not allowed in Java
    // Swap elements using the swap method
    System.out.println("Before invoking swap");
    System.out.println("array is {" + a[0] + ", " + a[1] + "}");
    swap(a[0], a[1]);//a[0] and a[1] are int type, their values will not be changed after method call
    System.out.println("After invoking swap");
    System.out.println("array is {" + a[0] + ", " + a[1] + "}");

    // Swap elements using the swapFirstTwoInArray method
    System.out.println("Before invoking swapFirstTwoInArray");
    System.out.println("array is {" + a[0] + ", " + a[1] + "}");
    swapFirstTwoInArray(a);//a is an array. It's elements' values will be changed if modified in the called method 
    System.out.println("After invoking swapFirstTwoInArray");
    System.out.println("array is {" + a[0] + ", " + a[1] + "}");
  }

  /** Swap the first two elements in the array */
  public static void swapFirstTwoInArray(int[] array) {//non primitive type of para is passed by reference
    int temp = array[0];
    array[0] = array[1];//array element values are changed
    array[1] = temp;
  }

  public static void swap(int n1, int n2) {//primitive data type of para is passed by value
    int temp = n1;
    n1 = n2;
    n2 = temp;
  }
}