package ReferencePrograms;
/* PowerTwo.java: Use method of Math class, print a table of power of 2. The exponent ranges from 0 to 10*/

public class PowerTwo {
  public static void main(String[] args) {
    System.out.println("\nExponent\t 2 to the power of exponent");
    System.out.println("-------------------------------");

    for (int num = 0; num <= 10; num++) {
      System.out.println(num + "\t\t\t" + Math.pow(2,num));
    }
  }
}
