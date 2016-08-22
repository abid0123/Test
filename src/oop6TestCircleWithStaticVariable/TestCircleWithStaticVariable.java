package oop6TestCircleWithStaticVariable;
// TestCircleWithStaticVariable.java: Demonstrate using instance and
// static variables
public class TestCircleWithStaticVariable {
  /** Main method */
  public static void main(String[] args) {
    // Create circle1
    CircleWithStaticVariable circle1 = 
      new CircleWithStaticVariable();


    // Display circle1 BEFORE circle2 is created
    System.out.println("Before creating circle2");
    System.out.println( "Circle 1's radius =" + circle1.getRadius() +
      " and number of Circle objects =" + CircleWithStaticVariable/*circle1*/.getNumOfObjects());
   
    // Create circle2
    CircleWithStaticVariable circle2 = 
      new CircleWithStaticVariable(5);
   
    //observe the below 3 statements' print out, any difference, why?
    System.out.println(circle2.getNumOfObjects());
    System.out.println(circle1.getNumOfObjects());
    System.out.println(CircleWithStaticVariable.getNumOfObjects());
   
    // Change the radius in circle1
    circle1.setRadius(9);

    // Display circle1 and circle2 AFTER circle2 was created
    System.out.println("\nAfter creating circle2 and modifying " +
      "circle1's radius to 9");
    System.out.print( "Circle 1's radius =" + circle1.getRadius() +
      " and number of Circle objects =" + circle2.getNumOfObjects());

    System.out.println( "\nCircle 2's radius =" + circle2.getRadius() +
      " and number of Circle objects =" + circle1/*CircleWithStaticVariable*/.getNumOfObjects());

  }

  
}

