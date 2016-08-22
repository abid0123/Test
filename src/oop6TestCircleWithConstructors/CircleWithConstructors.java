package oop6TestCircleWithConstructors;
// Define the Circle class with two constructors
class CircleWithConstructors {
   double radius;
   //String color;
  /** no-arg constructor */
  CircleWithConstructors() {
    radius = 1.0;
  }

  /** Construct a circle with a specified radius */
  CircleWithConstructors(double r) {
     radius = r;
  }

  /*static double findP(){
      double p=2*Math.PI*radius;
      return p;
  }*/
  /** Return the area of this circle */
  double findArea() {
    return radius * radius * 3.14159;
  }
}
