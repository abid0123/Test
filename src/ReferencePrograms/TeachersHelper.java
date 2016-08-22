package ReferencePrograms;
import java.util.Scanner;
 
public class TeachersHelper 
{
  public static void main(String[] args){

     System.out.println("Please enter your mark:");
     Scanner sc= new Scanner(System.in);
     double dbMark = sc.nextDouble();

    //call method to get the grade catogory for the mark keyed in
    char chGrade = calculateGrade(dbMark);

    //print out the grade catogory
    System.out.println("You are gade " + chGrade + ".");
    System.exit(0);
  }
 
/*
 * method calculateGrade accept floating point marks, and return the grade category of A---F 
 */
  public static char calculateGrade(double gradeAverage)
  {
    char grade;
  
    if (gradeAverage >= 80.0) grade = 'A';
    else if (gradeAverage >= 70.0) grade = 'B';
    else if (gradeAverage >= 60.0) grade = 'C';
    else if (gradeAverage >= 50.0) grade = 'D';
    else grade = 'F';

    return grade;
  }
}