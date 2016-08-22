/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s37893
 */
public class CompareString {
  public static void main(String[] a){
     String s1 = new String("Welcome");
     String s2 = new String("welcome");
     String s3 = new String("welcome");
     String s4 = "welcome";
     String s5 = "welcome";
   
    System.out.println(s1.equals(s2)); //false, s1 and s2 have different contents  
    System.out.println(s2.equals(s3)); //true, s2 and s3 have the same contents
    System.out.println(s2==s3); //false, s2 and s3 must have the same reference, not just contents 
    System.out.println(s4==s5);//true, s4 and s5 have both the same reference, and contents 
    System.out.println(s4==s3);//false, s4 and s3 have different reference
    System.out.println(s4.equals(s3));//true, s4 and s3 have same content
    System.out.println(s1.equalsIgnoreCase(s5));//true
    s4="bye";
    System.out.println("s4="+s4+" s5="+s5);
    s5=s4;//s4 and s5 do share the same memory location
    System.out.println(s4==s5);//now s4 and s5 share the same memory location
  }
}
