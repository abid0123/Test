package ReferencePrograms;
//Sample exercise with solution--for chapter 4 Q4.1 and Q4.3//

/* Handphone.java: 
Create a method with signature:
public static String canWork(double price)

The method will return a string telling you what feature a handphone supports. The feature depends on the price ($,without contract).

Write an application to call the above method and display the feature handphones support. The handphones' prices are ranged between $20 to $300 with gap $50.
*/
 
public class Handphone{
  public static void main(String[] args) {
    System.out.println("Price($)\t\tFeature");
    System.out.println("-------------------------------");

    for (double p = 20; p <= 300; p=p+50) {
      System.out.println( p + "\t\t"+ canWork(p));
    }
  }

  public static String canWork(double price) {
    if (price< 50) return "can only make call and send SMS.";
    else if (price <200) return "can make call, send SMS and MMS.";
    else  return "can make call, send SMS, MMS and record video.";

  }
}

