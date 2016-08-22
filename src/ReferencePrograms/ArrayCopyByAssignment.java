package ReferencePrograms;
//to explain the array copy cannot be done by assignment
public class ArrayCopyByAssignment
{
  public static void main(String[] args)
  {

    int[] intArryA = {1,2};
    int[] intArryB = {3,4};
    System.out.println("Before assignment:");
    System.out.println("intArryA is :" + intArryA.toString() + " and intArryB is: "+ intArryB.toString());
    intArryB = intArryA;
    System.out.println("After assignment:");
    System.out.println("intArryA is :" + intArryA.toString() + " and intArryB is: "+ intArryB.toString());


  }

}