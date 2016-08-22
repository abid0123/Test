package ReferencePrograms.lengthUnit;

public class LengthUnitConverter {
	double ft2Mt = 0.3048, ft2Inch = 12,ft2Yd = 0.333, ft2Mile = 0.0001894;
    double mt2Yd = 1.0936, mt2Inch = 39.37;
    double yd2Inch=36, yd2Mile = 0.0005682;
    double inch2Mile = 0.000015783;
	
	public double foot2Meter(double foot){
		double mt = ft2Mt*foot;//calculate meter for the corresponding foot and store it in variable mt
		return mt;
	}
	public double meter2Foot(double meter){
		double ft =  meter/ft2Mt; 
		return ft;
	}
	public double foot2Inch(double foot){
		return ft2Inch*foot;
	}
	public double inch2Foot(double inch){
		return inch/ft2Inch; 
	}
	public double foot2Mile(double foot){
		return ft2Mile*foot;
	}
	public double mile2Foot(double mile){
		return mile/ft2Mile; 
	}
	public double foot2Yard(double foot){
		return ft2Yd*foot;
	}
	public double yard2Foot(double yard){
		return yard/ft2Yd; 
	}
	public double meter2Inch(double meter){
		return mt2Inch*meter;
	}
	public double inch2Meter(double inch){
		return inch/mt2Inch; 
	}
	public double meter2Yard(double meter){
		return mt2Yd*meter;
	}
	public double yard2Meter(double yard){
		return yard/mt2Yd; 
	}
	public double yard2Mile(double yard){
		return yd2Mile*yard;
	}
	public double mile2Yard(double mile){
		return mile/yd2Mile; 
	}
	public double yard2Inch(double yard){
		return yd2Inch*yard;
	}
	public double inch2Yard(double inch){
		return inch/yd2Inch; 
	}
	public double mile2Inch(double mile){
		return mile/inch2Mile;
	}
	public double inch2Mile(double inch){
		return inch*inch2Mile; 
	}
	
	//all-in conversion method
	public static double convert(int intChoice, double dSrc){
		LengthUnitConverter con = new LengthUnitConverter(); 
		double result  = 0;
		switch (intChoice){//based on chosen conversion, call relacent method to do calculation
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
		case 100: result = dSrc; break;//no need to convert
		}
		return result;
	}

}
