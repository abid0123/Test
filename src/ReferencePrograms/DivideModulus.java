package ReferencePrograms;
//reference programs for declaration, initialization, computation and data type

public class DivideModulus 
{
  public static void main(String[] args)
  {
    int a =16, b = 3, c ,d;//declare multiple variables on the same statement, iniliatize some of them at the same time
    c = a/b; //get division
    d = a%b; //get modulus

    System.out.println("16/3 division is "+ c); //print out result
    System.out.println("16/3 modulus is "+ d);

    float fa =(float)16.0, fb = (float)3.0, fc; //16.0 is double type, it must be cast to float type in order to be assigned to fa
    fc = fa/fb; 
   
    System.out.println("16.0/3.0 division is "+ fc); //compare the difference between fc and c
    
  }
}