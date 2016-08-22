package ReferencePrograms;

//this example shows how to use one class method in another class
public class CalculateTime{
	StopWatch watch = new StopWatch();//instance variable of CaculateTime class
      public static void main(String a[]){
		CalculateTime cTime = new CalculateTime();
		cTime.watch.setName("Accurate");
           cTime.watch.start();
           Rectangle rec =new Rectangle(2,3);//create 1st Rectangle object
           System.out.println("1st rectangle area is: "+rec.calcArea());
           
           cTime.watch.stop();
           System.out.println("The time spent in creating 1st rectangle and calculate its area is "+cTime.watch.getElapsedTimeSecs()+", calulated by "+cTime.watch.name);

           cTime.watch.start();//use the same StopWatch object to calculate time
           Rectangle sqr =new Rectangle();//create 2nd Rectangle object using no arg constructor
           sqr.setRectangle(10,10);//change Rectangle obejct's length and breath
           System.out.println("2ns rectangle area is: "+sqr.calcArea());
           cTime.watch.stop();
           System.out.println("The time spent in creating 2nd rectangle and calculate its area is "+cTime.watch.getElapsedTimeSecs()+", calulated by "+cTime.watch.name );

     }
}
