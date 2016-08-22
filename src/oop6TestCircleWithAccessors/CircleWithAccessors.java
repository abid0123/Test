package oop6TestCircleWithAccessors;
// CircleWithAccessors.java: The circle class with accessor methods
public class CircleWithAccessors {
  /** The radius of the circle, not visible outside current class */
  private double radius;

  /** no-arg constructor */
  public CircleWithAccessors() {
    radius = 1.0;
  }

  /** Construct a circle with a specified radius */
  public CircleWithAccessors(double r) {
    radius = r;
  }

  /** Accessor method to return private variable radius value*/
  public double getRadius() {
    return radius;
  }

  /** Accessor method to update private variable radius value*/
  public void setRadius(double newRadius){ 
    radius = newRadius;
  }

  /** Return the area of this circle */
  public double findArea() {
  
    return radius * radius * 3.14159;
  }
}