/*
 * This example shows the different of using and not using array to store a group of data
 */
package ReferencePrograms;
public class AgeName 
{
   public static void main(String[] a)
   {
	 //if array is not used, 3 variables are used to store 3 data
     int stntAge1 = 1;
     int stntAge2 = 3;
     int stntAge3 = 6;
    
    System.out.println("The first gorup of student age is: "+stntAge1 +"\t"+stntAge2+"\t"+stntAge3);
    //to get the sum of the 3 data, you need to add them one by one through 3 variables' names
    //if there are more data needed to be added, the statement will be very long 
    int avg = (stntAge1+stntAge2+stntAge3)/3;
    System.out.println("The average age is : "+ avg);

    //If array is used, only one array variable is need to store more than one data of the same type 
    int[] stntAge = new int[3];
    stntAge[0] = 19;
    stntAge[1]= 19;
    stntAge[2]= 4;
   
    System.out.print("The second gorup of student age is: ");
    int sum = 0;
    
    //loop is used to calculate the sum, on short statement in side the loop is enough to calculate the sum
    //even, the number of data is increased
    for (int i = 0; i<stntAge.length; i++)
    {
     System.out.print(stntAge[i]+"\t");
     sum = sum+stntAge[i];
    }
    System.out.println("\nThe average age is: "+sum/stntAge.length);
     
   }

}