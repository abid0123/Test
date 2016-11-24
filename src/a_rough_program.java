	public class a_rough_program {
		  
		  private double radius = 5;
		  private String color = "white";

		  public a_rough_program(){
		  }
		  public double getRadius() {
		    return radius;//return the value of instance variable radius
		  }
		  public void setRadius(double dbRadius) {
		radius = dbRadius;
		/*change the value of instance variable to method’s parameter’s value.*/
		  }
		  public String getColor() {
			return color;
		    /*add your own codes here to return the value of instance variable color*/
		  }
		  public void setColor(String strColor) {
		    /*add your own codes here to change the value of instance variable color to the method’s parameter value*/
		  }
		  public String toString() {
			  String s= "the colour is "+getColor()+" and te size is "+radius;
			return s;
		/*add your own codes here to prepare and the description of  the fan and return the description*/
		  }
		  
		//new line made for practical 6.2.3
		  public a_rough_program(String clr){		  
			  color=clr;
		  }
		 
		 
		}

    
    