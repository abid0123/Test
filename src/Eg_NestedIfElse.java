import java.util.Scanner;

public class Eg_NestedIfElse {
	public static void main(String[] a){
     System.out.println("Please enter an integer number here:");
	 Scanner sc = new Scanner(System.in);
	 int number = sc.nextInt();
	 if (number > 0) 
	 {
		System.out.println(number + " is positive.");
	 }else if (number < 0)//when the condition of if is false
	 {//then check if number is smaller than 0
	     System.out.println(number + " is negative.");
	 }
	 else {//for all the rest condition, code runs here only when all the conditions above are false
	   System.out.println(number + " is 0.");
	 }
	 sc.close();
	}
}
