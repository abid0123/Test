//Cube.java: a subclass of Rectangle.java
package ReferencePrograms.oop7TestCube;
class Cube extends Rectangle{ //subclass of Rectangle class
  private double h; // new variable h for height added
  public Cube(){//consturctor for Cube class with h initialzed to 10.0.
  super();//constructor of superclass called.
  h = 10.0;
  }
  public void setHeight(double height){//method to set h to user-defined value
    h=height;
  }
	public double calcVolume(){//method to calculate volume
    double area=calcArea(); // calcArea of superclass used
    return area*h;
  }
}