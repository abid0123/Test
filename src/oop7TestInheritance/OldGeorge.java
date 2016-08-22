package oop7TestInheritance;
class OldGeorge{
	private double salary;
	/*protected*/ String surName = "Chee";
    String givenName;
	public OldGeorge() { //constructor 
		givenName="Big George";
        salary=2000;
	}
	public double getSalary() {// accessor method
		return salary;
	}
}
