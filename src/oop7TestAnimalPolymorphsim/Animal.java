// Animal is superclass of Cow, Pig and Snake subclasses
package oop7TestAnimalPolymorphsim;
class Animal {

	private int legs=4;
	public void talk(){//If subclass doesn't have talk() method, this method is called.
		System.out.println("Animals can't talk");
	}
}
