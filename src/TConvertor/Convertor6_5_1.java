package TConvertor;

public class Convertor6_5_1{
	public static double cToF(double c){ //a static method
	/**it takes temperature in Celsius and converts it to Fahrenheit, 
	 * then return the conversion result. fahrenheit = (9.0/5)*celsius +32*/
		return (9.0/5)*c +32;
	} 	
	public double fToC (double f){ //a non static method
	/** it takes temperature in Fahrenheit and converts it to Celsius, 
	celsius = (fahrenheit -32) *5.0/9 */
		return (f -32) *5.0/9;
	}
}
