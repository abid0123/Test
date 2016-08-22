package oop6TestVariableScope;
//TestVariableScope.java: example for variable scope
public class TestVariableScope 
{  
  //instance variables 
  int noOfGold = 5;
  int noOfSilver = 6;

 
  void dCPE3APP()
  {
  //local variable for method DCPE3APP()

    int noOfGold = 2;

    System.out.println("Class DCPE3APP got "+noOfGold+" gold medals");//noOfGold, local variable
    System.out.println("There are altogether "+noOfSilver+" silver medals");////noOfSilver, instance variable
  }
  
  void dCPE3BQQ()
  {
    //local variable for method DCNT1BQQ()
    int noOfGold = 3;
    System.out.println("Class DCPE3BQQ got "+noOfGold+" gold medals");//noGold, local variable
    System.out.println("There are altogether "+noOfSilver+" silver medals");//noOfSilver, instance variable
  }
  
  public static void main(String[] a)
  {
    TestVariableScope medals = new  TestVariableScope();
    medals.dCPE3APP();//2, 6
    medals.dCPE3BQQ();//3,6
    
    System.out.println("There are altogether "+ medals.noOfGold+" gold medals");//noOfGlod, instance variable  
  }
}