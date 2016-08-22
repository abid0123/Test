//test Constructor Chaining
package oop7ConstructorChaining;
public class FacultyConstructorChaining extends Employee {
 public static void main(String[] args) { 
	new FacultyConstructorChaining();  
 }
 public FacultyConstructorChaining() {
        //super();//automatically called even though the statement is not there
	System.out.println("(4)Invoke Faculty's no-arg constructor.");
 }
}
