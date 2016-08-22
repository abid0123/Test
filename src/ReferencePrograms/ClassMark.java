package ReferencePrograms;

/**User enters class size and individual scores of students
 Sum and average are computed and displayed * */
import javax.swing.JOptionPane;
public class ClassMark {
 public static void main(String[]args) {
  
  int num1=0;
  int[] scores;
  int sum = 0;
  double av;
  int input,i;
  boolean mydouble = false;
  boolean check = false;
  String numStr;
 
  while(mydouble==false){
  numStr = JOptionPane.showInputDialog(null,"Class size should be between 1 to 23 \n" +" Please enter number of students in your class" , "Class Size", JOptionPane.QUESTION_MESSAGE);
  num1 = Integer.parseInt(numStr);
    if ((num1>=1)&&(num1<=23))
    {
     mydouble = true;
    } 
    else
    {
    JOptionPane.showMessageDialog(null, "You have entered the wrong range. Please re-enter","Warning", JOptionPane.INFORMATION_MESSAGE);
    mydouble = false;
    }
  }
  scores = new int[num1];
  while(check==false){
    for (i =0; i < scores.length; i++){
    String scoreStr = JOptionPane.showInputDialog(null, "The class size is " + num1 + "\n Please enter score " + (i + 1 )+ " :","Number Entry", JOptionPane.QUESTION_MESSAGE);
    input = Integer.parseInt(scoreStr);
    if ((input>=0)&&(input<=100))
    {
        scores[i] =Integer.parseInt(scoreStr);
    
        sum = sum + scores[i];
        check = true;
    }
    else
    {
     JOptionPane.showMessageDialog(null, "Scores should be between 0 and 100. Please re-enter","Warning", JOptionPane.INFORMATION_MESSAGE);
     check = false;
     i =(i-1);
    }
  } 
 }
  double sum2 = (double)sum;
  av = (sum2/num1);
  int av1 = (int)(av * 100);
  double av2 = (av1)/100.0;
  String output = "The scores entered are ";
  for (i = 0; i <scores.length;i++)
  {
    output += scores[i] + " ";
  }
  
  output += "\nThe sum is " + sum;
  output += "\nThe average is " + av2;

  JOptionPane.showMessageDialog(null, output, "Results", JOptionPane.INFORMATION_MESSAGE);
  System.exit(0);
   
 }
}
 
