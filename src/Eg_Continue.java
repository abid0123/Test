/* 
   This program adds up integers from 1 to 5 skipping integer 2
*/
public class Eg_Continue 
{
  public static void main(String[] args)
  {
   int sum = 0;
   int item = 0;
   while (item < 5){
     item++;  
     if (item==2) continue;//continue means this round loop execution ends here, then check loop condition again 
     /*if item is 2, ignore the rest statement in the loop for the current round of loop execution, 
     go and check loop condition then decide whether to run the loop another round
     */
     sum = sum + item;
   }
   System.out.println("The sum is " + sum);
 //  System.out.println("The sum would have been " + (sum+2) +
  //                    " without the line with continue statement");
  }
}