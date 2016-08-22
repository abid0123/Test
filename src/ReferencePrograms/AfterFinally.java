package ReferencePrograms;
/*this example shows that if there is any exception not caught in catch block, 
the statement after the try-catch-(finally) will not run, even if there is finally block and finally block will run.
*/
import javax.swing.*;
public class AfterFinally {
	public static void main(String[] a){
		String strNum1 = JOptionPane.showInputDialog("Try-catch-finally Example","Enter first integer No.");
	    int num1=0;
	    boolean b1=false, b22=false;
	    try{
	       num1 = Integer.parseInt(strNum1);
	       b1=true;
	    }catch(Error e){//no exception is caught here. If there is exception thrown out in the matching try block, the finally block will run. But the code after finally block will not run. 
	    	b1=false;
		}finally{
			if(!b1)
	       	System.out.println("You didn't enter 1st No. correct and there is no catch for this part. Now it's in finally block. So there is no chance to enter again");
	    }
	    String strNum2 = JOptionPane.showInputDialog("Try-catch-finally","Enter second integer No.");
	    int num2=0;
	    try{
     	    num2 = Integer.parseInt(strNum2);
	    }catch(Exception s){
	    	System.out.println("You're caught not entering 2nd integer correctly. Here is another chance..");
	    	strNum2 = JOptionPane.showInputDialog("Try-catch-finally","Enter second integer No.");
 
	        try{
		    num2 = Integer.parseInt(strNum2);
		    b22=true;
		    }finally{//there is no catch block here, if any exception thrown out in the closest try block, the last System.out.println() will not run.
		    	if(!b22)
		       	System.out.println("You enter 2nd integer No. wrongly twice, no catch for this part. It's now in fainally. So there is no chance to enter again");
		    }
	    }
		System.out.println("num1 = " +num1 + ". num2="+num2 );//this statement will run only when the all the exceptions thrown are caught.
	}
	

}
