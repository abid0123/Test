//Rectangle.java: base class
package ReferencePrograms.oop7TestCube;
class Rectangle{// Rectangle class
	private	double l,b;// two sides l, b as data members 
	public Rectangle(){//constructor with initialzing l, b to 0.
	 l=b=0.0;
  }
	public void setRectangle(double length, double breadth){//method for setting l, b to user-defined values
    l=length;
    b=breadth;
  }
	public double calcArea(){//method to calculate area
    double area;
	  area = l*b;
	  return area;
  }

}