
import java.util.*;
/*all the classes in the java.util.* package are imported
   include Scanner, etc.
*/
	/* TryCatch.java: catch the invalid number entered and divided by 0 overflow Arithmetic exception
	   if you try to assess the array element not within index 0 to arrayname.length-1,
       ArrayIndexOutOfBoundsException will be thrown, which could be caught as well.
	   If any if the exception occurred is not caught, the program will crash and stop. 
	   If all the exception occurred are caught, after running the exception handling code, the program will continue to run 
	 */
	public class TryCatchArry {
	  /** Main method */
	  public static void main(String args[]) {
	    
	    int  [] numbers = new int[6];//one of the way to declare and create an array
	   
	    //Get element value one by one from keyboard 
	    Scanner sc;
		int count=0;//to record the total No. of exception occurred
		count=getArryEleDt(numbers);//array numbers element value will be updated with user input after this mathod call 
		
		//preparing for displaying array content  
	    String output = "The array elements entered: ";
	    for (int i = 0; i < numbers.length; i++) {
	      output += numbers[i] + " ";
	    }
	   
	    System.out.println(output);//display array content
	    // Find the quote of the last element to the first element
		int quote=0;//for store division result of the last element value divided by the first element value
		try{
			quote = numbers[numbers.length-1]/numbers[0];//if this statement cause exception, the next statement will not run, instead, the next matching catch block will run.
			//quote = numbers[numbers.length]/numbers[0];//replace the above statement with this line, run the program, what will happen?
			//quote = numbers[6]/numbers[0];//or replace it with this line, what will happen?
			
			System.out.println("The quote of the last element to the first element is "+quote);
			//if no exception, print the result;
	    }catch(ArithmeticException/*Exception*/ e){//if the first No. is 0, the exception will thrown and caught here
	    	System.out.println("can't get the quote of the last element to the first element\nas "+e.toString());
	    	count++;
	    }finally{//no matter there is exception or not, finally block always runs.
		    System.out.println("The total No. of excpetion occured is "+count);
	    }//end of finally block 
	  }//end of main method
	  
	  /*method to get integer No. input from user and store it into array
	    with exception handled, input parameter ary's content will be changed after method call
	    int[] ary is passed as reference
	  */
	  public static int getArryEleDt(int[] ary){
		  Scanner sc;
		  int countEx=0;//to store No. of exception occurred
		  for (int i = 0; i <ary.length; i++) {//numbers.length returns the array size;
			   System.out.println("Please enter No. "+(i+1) +" Integer value:");
			   try{
				   sc=new Scanner(System.in);
				   ary[i] = sc.nextInt();//assign user entered value each array element, may cause exception
			   }catch(InputMismatchException/*Exception*/ e){//if user enter Non integer value, exception will occur and caught here
				   System.out.println("No. "+(i+1)+" input is not an Interger value. Detailed reason:"+e.toString());
				   i--;//re-enter ith number, since exception occurs
				   countEx++;
			   }//end of catch block
		   }//end of for loop
		   return countEx;//return total No. of exception occurred
	  }//end of method int getArryEleDt(int[] ary)
	}//end of class