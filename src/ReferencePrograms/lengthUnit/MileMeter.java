package ReferencePrograms.lengthUnit;

import javax.swing.JOptionPane;

public class MileMeter {
	public static double mile2Meter(double mile){
		double mt = 1609.344*mile;//calculate meter for the corresponding mile and store it in variable mt
		return mt;
	}
	public static double meter2Mile(double meter){
		double mile = 0.0006214 * meter; 
		return mile;
	}
	public static void main(String[] a){
	    String strMile = JOptionPane.showInputDialog(null,"Please enter the Value of Mile","Mile to Meter Convertion",JOptionPane.QUESTION_MESSAGE);// get foot from dialog box in String format and store it in variable strMile
	    
		//declare m as double type
	    double m = Double.parseDouble(strMile);//get mile numerical value from String format and store it in m
	      
		//declare mt as double to hold value of meter
	    //1 mile = 1609.344m, 1 m = 0.0006214 mile
	    double mt = mile2Meter(m);// call method to calculate meter for the corresponding mile and store it in variable mt
	    
	    System.out.println("For mile: " + m + " the meter is " + mt);//print out the value of mile and its meter
	
        String strMeter = JOptionPane.showInputDialog(null,"Please enter the Value of Meter","Meter to Mile Convertion",JOptionPane.QUESTION_MESSAGE);// get foot from dialog box in String format and store it in variable strMeter
	    
		//reuse mt variable
	     mt = Double.parseDouble(strMeter);//get meter numerical value from String format and store it in mt
	      
	    //1 mile = 1609.344m, 1 m = 0.0006214 mile
	     m = meter2Mile(mt);// call method to calculate mile for the corresponding meter and store it in variable m
	    
	    System.out.println("For meter: " + mt + " the mile is " + m);//print out the value of meter and its mile

	}
}
