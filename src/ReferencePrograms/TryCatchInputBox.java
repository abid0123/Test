package ReferencePrograms;

/*TryCatchInputBox.java: Example for Exception Handling */

import javax.swing.JOptionPane;

public class TryCatchInputBox 
{

  String strNum1, strNum2;
  int num1, num2, quot;
  static int jopIcon = JOptionPane.QUESTION_MESSAGE;
  static String title = "Exception Demo";
  static String output = "Result"; 
  boolean bFlag = true; //state, true means no exception
  
  public TryCatchInputBox()
  {
  }

  public void computeQuot(int int1, int int2){
    try {
      quot = int1/int2; //this statement may throw exception;
      output += "\n\n Correct inputs! The quotient is:  "+ quot; //if no exception, print out the quotient
    }catch(/*Throwable*/ArithmeticException ae)
    {
      output += "\n\n Whoa! Not performed due to zero divide error!"; //if divider is 0, ArithmeticException comes out
      jopIcon = JOptionPane.ERROR_MESSAGE;//prepare the  error message
      bFlag = false;//there's error
    }
  }
  
  public void justDoIt()
  {
  /*prompt user to enter 2 numbers in a dialog box by calling JOptionPane class overloaded static method
 	showInputDialog with costomized title and icon
  */  
   strNum1 = JOptionPane.showInputDialog(null,"Enter the 1st number(int).",title,jopIcon);
   strNum2 = JOptionPane.showInputDialog(null,"Enter the 2nd number(int).",title,jopIcon);
 
   try
    {
      num1 = Integer.parseInt(strNum1);//here, exception may come out
      num2 = Integer.parseInt(strNum2);//here, exception may come out

      computeQuot(num1, num2);//if no exception, then compute the quotient

    }catch(NumberFormatException nfe)
    {
      output += "\n\n Whoa! Input error: must enter valid integers";//if exception comes out, prepare error message
      jopIcon = JOptionPane.ERROR_MESSAGE; 
      
      /* trace and print the exception info
        If you don't want to display the exception message, remove nfe.printStackfTrace()
      */
     // nfe.printStackTrace();//or
    // System.out.println(nfe.getMessage());
      System.out.println(nfe.toString());
      bFlag = false;
    }finally//no matter there is exception or not, run finally block
    {
      output +="\n\n 1st number = " +strNum1 +  ",  2nd number = " + strNum2;//if no exception
      if (bFlag) jopIcon = JOptionPane.INFORMATION_MESSAGE;
      JOptionPane.showMessageDialog(null,output,title,jopIcon);//whether there is exception or not, always run codes in finally block
      
      /*if there is exception, give user chance and 
      prompt user enter 2 number again, until user key in the correct numbers.
      If you don't want to give user another chance, remove the following swhile loop
      */
      while (!bFlag) doAgain();
    } 
  }
 
  public void doAgain()
  {
    //prepare
    bFlag = true;
    output = "";
    jopIcon = JOptionPane.QUESTION_MESSAGE;
    justDoIt();
  }
  
  public static void main(String[] args)
  {
    TryCatchInputBox tryCatch = new TryCatchInputBox();
    
    tryCatch.justDoIt();
    
    System.out.println("Have a nice day!");//only when there is no exception
    System.exit(0);//if there is no exception, exit from here.
  }//end of main method
}//end of class
