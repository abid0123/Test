//Samsung.java: implementing class of interface SMS.java, MMS.java
package oop8TestInterface;

class Samsung implements SMS, MMS{//class inherits method names from two interfaces 
    public void sendSOS(String what){
		System.out.println("Samsung Shiok! is sending urgentFreeSMS: "+ what);
    }

  public boolean sendMMS(String toWhom, String what){
		System.out.println("Samsung Shiok! sending MMS "+ what +" to "+toWhom);
		return true;
  }

 }
