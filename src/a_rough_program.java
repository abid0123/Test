
import java.awt.Component;
import java.util.Scanner;
import javax.swing.JOptionPane;
/* This program asks user for an integer and
   output a message to report whether the integer is odd or even.
*/   

public class a_rough_program 
{
  public static void main(String[] ags)
  {
	  int ans = Integer.parseInt( JOptionPane.showInputDialog(frame,
		        "Text",
		        JOptionPane.INFORMATION_MESSAGE,
		        null,
		        null,
		        "sample text to help input"));
	  
	  String name;
      name = JOptionPane.showInputDialog(null,
       "Please enter your name");
      JOptionPane.showMessageDialog(null,"Hi "+ name);
	  
	
	  
   System.out.println("Please enter an integer here:");
   Scanner sc = new Scanner(System.in);
   int number = sc.nextInt();
   
 
   if (number==69){ 
	    System.out.println(number + " is correct!");
   }
   else{
		   System.out.println(number + " is wrong :'(");
   }
   sc.close(); 
   
   
  }
}  