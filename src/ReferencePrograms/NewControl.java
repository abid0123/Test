package ReferencePrograms;

import java.util.Scanner;

public class NewControl {
	public static void main(String[] p){
		
	//below shows switch/case accept String type of data	
	  System.out.println("What day is today?");
	  Scanner input = new Scanner(System.in);
	  
	  String day = input.nextLine();
	  switch(day) {//since java 1.7
	    case "Monday":
	    case "Mon":
		    System.out.println("Jogging at 5pm");
		    break;
		case "Tuesday":
		case "Tue":
			System.out.println("Ballet at 6pm");
			break;
		default: System.out.println("Free activity");
	  }
	  
	  //below shows another way to travel through array and get element value one by one
	  int [] numbers = {10, 20, 30, 40, 50}; 
	  for(int elementValue : numbers) {  //since java 1.5   
	       System.out.print(elementValue+" "); 
	  } //	  for(double elementValue : numbers) OK., but for(char elementValue : numbers) wrong   
 

	  System.out.println();
	 // is equivalent to:
	  for(int i = 0; i<numbers.length;i++) {     
	       System.out.print(numbers[i]+" "); 
	  } 

	}
}
