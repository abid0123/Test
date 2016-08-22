/*
 * Class RandomNum.java will generate 5 number which is between 0 and 1(exclusive) 
 * randomly. Everytime, 5 different decimal point values will be displayed when you run it again. 
 */

public class RandomNum {
  /** Main method */
  public static void main(String args[]) {
     //System.out.print( Math.sqrt(7));
    // Print 5 random No.
    for (int i = 0; i < 5; i++) {
        double r  = Math.random();
        System.out.println(r);
       
        // System.out.print("random No. is:"+r+", it is rounded to "+ Math.round(r*10)+"\n ");
    }
     //System.out.println(Math.cos(90));
     //System.out.print(Math.pow(2,3));
    
    //handson:  generate and print 4D number
  }
}