/* This program output the msg "Welcome to Java"
   many times - depending on the user-input integer.
*/   
import java.util.Scanner;

public class Eg_WhileLoop 
{//rewrite this program in do-while
   public static void main(String[] args)
   {
	System.out.println("Please enter an integer below:");//prompt user a message   
	Scanner sc = new Scanner(System.in);//let user enter a value from keyboard
    int number = sc.nextInt();//read the value user keyed from the keyboard to variable number
	
    int i = 0;//declare a in type of variable for counting
    while (i < number){  //so long the value of i is smaller than the value of number, the loop body will run
       
       System.out.println(i+1 + ": Duke welcomes you to Java!");
       i=i+1;//i++;
       /*each time the loop runs,"..: Duke welcomes you to Java!" will be displayed, 
         then value of i will be increased by 1 
       */ 
    }//the loop will end when the value of i is not smaller than the value of number, in another word: 
    //the loop will end when the value of i is euqual to or larger than the value of number

  //below is the do while version  
  /*  i=0;
   do{
	   System.out.println(i+1 + " Welcome to Java!");
       i=i+1;//i++; 
	   
   }while (i < number);*/
  sc.close();
  }
}