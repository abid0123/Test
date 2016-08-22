/* 
   This program adds up integers from 1 to 5
   but stops when the sum becomes 6 or more than 6.
*/   
public class Eg_Break 
{
  public static void main(String[] args)
  {
   int sum = 0;
   int item = 0;
   while (item<5){
	 item++;
     sum = sum + item;
     if (sum >= 6) break;//break means completely jump out the nearest loop
     /*if sum is larger or equals to 6, the loop stops. 
     will proceed to run the statement after the loop
     */
   }
   System.out.println("The sum is " + sum);
   System.out.println("Last item added is " + item);
  }
}