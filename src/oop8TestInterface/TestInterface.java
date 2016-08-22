//TestInterface.java
package oop8TestInterface;
public class TestInterface{
  public static void main(String[] args) {
	Samsung modelS4   = new Samsung();
  	modelS4.sendSOS("Help");
    if(modelS4.sendMMS("QBama","No War")) System.out.println("Not bad!");
    else System.out.println("Not Good!");


  	AhBengPhone modelPCK= new AhBengPhone();
  	modelPCK.sendSOS("Help");
    if(modelPCK.sendMMS("QBama","No War")) System.out.println("Not bad!");
    else System.out.println("Not Good!");

 
  	
       /*please create another class Apple to implement interfaces SMS and MMS
	and create object of Nokia class, call its sendSMS() and sendMMS()
       */
  }
}

