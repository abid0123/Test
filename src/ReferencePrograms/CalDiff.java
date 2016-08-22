package ReferencePrograms;

import java.util.Scanner;

//calculate the difference between 2 values
public class CalDiff 
{
		public static void main(String args[]){
			//declare 3 double type value 
			double dbFirst, db2nd, dbDiff;
			Scanner sc = new Scanner(System.in);
			//prompt user to key in 2 floating point values
			System.out.println( "Please enter 1st floating point value:");

			dbFirst = sc.nextDouble();
			System.out.println( "Please enter 2nd floating point value:");

			db2nd = sc.nextDouble();

			/*call method to calculate the difference between 2 floating point values*/
		dbDiff = getDiff(dbFirst,db2nd);//which getDiff() is called?

		//print out the result
		System.out.print("The difference between value: "+ dbFirst + " and " + db2nd + " is: " +dbDiff);
		}


/*
 * Method to calculate the absolute difference between two double values
 * */
		public static double getDiff(double d1, double d2){
			double d = d1-d2;//get the difference
			d = Math.abs(d);//get the absolute difference by calling Math method abs()
			return d;
		}

		/*
 * Method to calculate the absolute difference between two int values
 * */
		public static int getDiff(int d1, int d2){
			int d = d1-d2;//get the difference
			d = Math.abs(d);//get the absolute difference by calling Math method abs()
			return d;
		}

	}

