package ReferencePrograms;
//Rectangle.java: base class
//design Java application to create an object from this class, then call its method to
//set the length and breath, calculate and print its area
class Rectangle{// Rectangle class
	private	double l,b;// two sides l, b as data members 
	//double area;
    public Rectangle(){//constructor with initializing l, b to 0.
		 l=b=0.0;
	}
    
    public Rectangle(double len, double b){//constructor with initializing l, b through input parameter
		 l=len;
		 this.b=b;
	}
	//method for setting l, b to user-defined values
	public void setRectangle(double length, double breadth){
    		l=length;
    		b=breadth;
  	}
	public double calcArea(){//method to calculate area
    	      return l*b;
              /*double area;
	        area = l*b;
	  	return area;*/
  	}
}