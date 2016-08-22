package oop7TestInheritance;
public class TestInheritance {
  public static void main(String[ ] args) {
	YoungGeorge yg= new YoungGeorge("Fei Hong"); 

	// create child class YoungeGeogr object yg
   	/* yg inherits all non-private members (data and methods) defined in OldGeorge class as well as class YoungGeorge.*/
	System.out.println("Little George's name is : "+ yg.surName+" "+yg.givenName+ ". His house income: "
   	+yg.getSalary()+" and his score: "+ yg.getScore());
    OldGeorge bg=new OldGeorge();
   // YoungGeorge y = new YoungGeorge(); 
	System.out.println("Old George's name is : "+ bg.surName+" "+bg.givenName+ ". His house income: "+bg.getSalary());
    }
}



