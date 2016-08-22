/* *User enters class size and individual scores of students
 Sum and average are computed and displayed * */
package ReferencePrograms;
import java.util.Scanner;

public class Score_Array {
 public static void main(String[]args) {
  
  int classSize=0;
  double[] scores;
  double sum = 0;
  double av;
  double input;
  boolean sizeValid = false;
  boolean markValid = false;
  String numStr;
 
  Scanner sc = new Scanner(System.in);
  while(sizeValid==false){
  System.out.println("Class size should be between 1 to 23. \n" +"Please enter number of students in your class:");
  classSize = sc.nextInt();
    if ((classSize>=1)&&(classSize<=23))
    {
     sizeValid = true;
    } 
    else
    {
    System.out.println("You have entered the wrong range. Please re-enter.");
    sizeValid = false;
    }
  }
  scores = new double[classSize];
  System.out.println("The class size is " + classSize +".");
  while(markValid==false){
  for (int i =0; i < scores.length; i++){
   System.out.println("Please enter score for student " + (i + 1 )+ " :");
   input = sc.nextDouble();
   if ((input>=0)&&(input<=100))
   {
    scores[i] =input;
    
    sum = sum + scores[i];
    markValid = true;
   }
   else
   {
     System.out.println("Scores should be between 0 and 100. Please re-enter");
     markValid = false;
     i =(i-1);
   }
  } 
 }
  double sum2 = (double)sum;
  av = (sum2/classSize);
  int av1 = (int)(av * 100);
  double av2 = (av1)/100.0;
  String output = "The scores entered are ";
  for (int i = 0; i <scores.length;i++)
  {
    output += scores[i] + " ";
  }
  
   output += "\nThe average is " + av2;

  System.out.println(output);
  System.exit(0);
   
 }
}
 
