//Employee.java: Employee is the parent class of Faculty. Employee is child class of Person
package oop7ConstructorChaining;
class Employee extends Person {
 public Employee() {
    //super();//super(..) and this(..) cannot be used at the same time
    //this("(2) Invoke Employee's overloaded constructor");//it must be the first statement
    System.out.println("(3)Invoke Employee's no-arg constructor");
   
 }
 
 public Employee(String s){
    //super(s);//it's a must if there is no no-arg constructor in Person.java, it's not auto called
    //super();//only one super(.) can be used
	 System.out.println(s); 
 }
}
