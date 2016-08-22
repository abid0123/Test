// TestOverrideMethod.java: Test the Cylinder class that overrides
// its superclass's method findArea() 
package oop7TestOverrideMethod; 
public class TestOverrideMethod {
  public static void main(String[] args) {
    Cylinder2 myCylinder = new Cylinder2(5.0, 2.0);//child class object created
    Cylinder2 myClinder3 = new Cylinder2(); //another child class object created using different constructor
  
    CircleWithAccessors myradius = new CircleWithAccessors();//parent class object created
    CircleWithAccessors myarea = new CircleWithAccessors(5.0);//parent class object created using different constructor

    System.out.println(myradius.getRadius());
    double d = myradius.findArea();
    System.out.println("The length is " + myCylinder.getLength());//child class object access child class method
    System.out.println("The radius is " + myCylinder.getRadius());//child class object access parent class method
    System.out.println("The surface area of the cylinder is "+
      myCylinder.findArea());//child class method is called
  
    System.out.println("The volume of the cylinder is "+
      myCylinder.findVolume());
  }
}