package ReferencePrograms;
/*
 * Internally a variable argument is maintained as an array that can
 * hold zero to more arguments of the same type. 
 * An method with variable length argument is equivalent to many overloaded method
 * taking different number of parameters but with the same data type 
 * 
 * There are two major constraints in the usage of variable arguments. 
 * The first thing is a method is allowed to carry only one variable argument type. 
 * The other constraint is that a variable argument type can appear only as the last parameter in a method definition. The following shows the legal and illegal usage of variable argument types.
	static void test(int... a, String... b)//Invalid, more than one variable argument type.
	static void test(int... a, int... b)//Invalid, more than one variable argument type.
	static void test(int... a, int b, int c)//Invalid, Variable argument type must be the last parameter.
	static void test(int a, int... b, int c)//Invalid, Variable argument type must be the last parameter.
	static void test(int a, int... b) // This is legal.
	static void test(int... a)//This is also legal.
 */

public class ArgumentNumVary {
    static int add(int ... numbers){
		int result = 0;
		for(int num:numbers){
			result+=num;
		}
		return result;
    }//equivalent to many overloaded add methods
    
    public static void main(String[] a){
    	System.out.println(add(3,4));
    	System.out.println(add(3,4,5));
    	System.out.println(add());
    }

}
