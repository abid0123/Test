package oop8TestInterface;
class AhBengPhone implements SMS, MMS{//class inherits method names from two interfaces 
  public void sendSOS(String what){
		System.out.println("AhBeng Phone!Alamak, cannot send any free urgent SMS !");
   }
  public boolean sendMMS(String toWhom, String what){
		System.out.println("AhBeng Phone!Alamak, cannot send any MMS to "+toWhom);
		return false;
  }
}