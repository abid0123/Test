// CircleWithAccessors.java: The class with accessor methods
package oop7TestOverrideMethod; 
public class CircleWithAccessors {
  /** The radius of the circle */
  private double radius;

  /** no arg constructor */
  public CircleWithAccessors() {
    radius = 1.0;
  }

  /** Construct a circle with a specified radius */
  public CircleWithAccessors(double r) {
    radius = r;
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double newRadius) {
    radius = newRadius;
  }

  /** Return the area of this circle */
  public double findArea() {
    return radius * radius * 3.14159;
  }
}