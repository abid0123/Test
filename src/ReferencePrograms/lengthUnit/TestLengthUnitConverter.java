package ReferencePrograms.lengthUnit;

import javax.swing.JOptionPane;

public class TestLengthUnitConverter {
	public static void main(String [] s){
		
		LengthUnitConverter con = new LengthUnitConverter(); 
		//all the methods in class LengthUnitConvesion are non static, object needs be to created in order to use any of its method
		/*
		 * 	double ft2Mt = 0.3048, ft2Inch = 12,ft2Yd = 0.333, ft2Mile = 0.0001894;
		    double mt2Yd = 1.0936, mt2Inch = 39.37;
		    double yd2Inch=36, yd2Mile = 0.0005682;
		    double inch2Mile = 0.000015783;
		 */
		String instruction[] = { "", "1:   foot to meter", "2:  foot to mile",  "3: foot to inch", "4: foot to yard\n",
					                 "5:  meter to foot", "6:  mile to foot",  "7: inch to foot", "8: yard to foot\n",                
					                 "9:  meter to mile", "10: meter to inch", "11: meter to yard\n",
					                 "12: mile to meter", "13: inch to meter", "14: yard to meter\n",
					                 "15: yard to inch",  "16: yard to mile\n",
					                 "17: inch to yard",  "18: mile to yard\n",
							         "19: inch to mile",  "20: mile to inch"
							         };//first element empty so that conversion sequence and index are the same
		String instructions= "";
		for(int i=1; i<instruction.length;i++){//ignore first empty one
			instructions = instructions + instruction[i];
		}//cascade all the conversion into one string 
		
		String strChoice = JOptionPane.showInputDialog(null, "Please choose the convertion:\n"+instructions,"Length Unit Convertion", JOptionPane.INFORMATION_MESSAGE);
		int intChoice = Integer.parseInt(strChoice);
		//System.out.println(instruction.length+" choices. You choose "+ intChoice);
		
		//based on conversion chosen, fetch source unit and target unit name  
		String conversion = instruction[intChoice].trim();
		String srcUnit = conversion.substring(conversion.indexOf(":")+1,conversion.indexOf("to"));
		String targetUnit  = conversion.substring(conversion.indexOf("to")+2);
		
		String strSourceValue = JOptionPane.showInputDialog(null, "Please enter the value in "+srcUnit +" to be converted to "+targetUnit+":\n","Length Unit Convertion:"+conversion, JOptionPane.INFORMATION_MESSAGE);
		double dSrc = Integer.parseInt(strSourceValue);
		
		double result  =con.convert(intChoice, dSrc);
		/*switch (intChoice){//based on chosen conversion, call relacent method to do calculation
		case 1: result = con.foot2Meter(dSrc);break;
		case 2: result = con.foot2Mile(dSrc);;break;
		case 3: result = con.foot2Inch(dSrc);break;
		case 4: result = con.foot2Yard(dSrc);break;
		case 5: result = con.meter2Foot(dSrc);break;
		case 6: result = con.mile2Foot(dSrc);break;
		case 7: result = con.inch2Foot(dSrc);;break;
		case 8: result = con.yard2Foot(dSrc);break;
		case 9: result = MileMeter.meter2Mile(dSrc);break;
		//call MileMeter class static method from class directly
		
		case 10: result = con.meter2Inch(dSrc);break;
		case 11: result = con.meter2Yard(dSrc);break;
		case 12: result = new MileMeter().mile2Meter(dSrc);break;
		//static method can also be called from object
		
		case 13: result = con.inch2Meter(dSrc);;break;
		case 14: result = con.yard2Meter(dSrc);break;
		case 15: result = con.yard2Inch(dSrc);break;
		case 16: result = con.yard2Mile(dSrc);break;
		case 17: result = con.inch2Yard(dSrc);break;
		case 18: result = con.mile2Yard(dSrc);break;
		case 19: result = con.inch2Mile(dSrc);break;
		case 20: result = con.mile2Inch(dSrc);break;
		}*/
		
		JOptionPane.showMessageDialog(null,dSrc+srcUnit+"="+result+" "+targetUnit ,"Lenght Unit Conversion", JOptionPane.INFORMATION_MESSAGE);
	}
}
