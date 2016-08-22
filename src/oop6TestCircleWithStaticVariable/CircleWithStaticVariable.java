package oop6TestCircleWithStaticVariable;
//CircleWithStaticVariable.java: example with static variable

public class CircleWithStaticVariable {
  /** The radius of the circle */
  private double radius;

  /** The number of the objects created */
  private static int numOfObjects = 0;  
  public final double PAI=3.14;
  /** no-arg constructor */
  public CircleWithStaticVariable() {
    radius = 1.0;
    numOfObjects++;
  }

  /** Construct a circle with a specified radius */
  public CircleWithStaticVariable(double r) {
    radius = r;
    numOfObjects++;
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double newRadius) {
    radius = newRadius;
  }

  /** Return numOfObjects */
  public static int getNumOfObjects() {
    return numOfObjects;
  }

  /** Return the area of this circle */
  public double findArea() {
    return radius * radius * PAI;/*Math.PI;*/
  }
}