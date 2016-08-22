//Example for char data type. 

public class TestChar{
	public static void main(String[] args){
		char x = 'a';//'a' has ASCII value 97, the ASCII value of a--z is increased by 1 for the next letter 
		char y = 'c';//'c' has ASCII value 99
  
		System.out.println(y++);//display y as 'c', then y become 'd'
		System.out.println(++y);//y become e, then displayedd as 'e'
        System.out.println(x>y);//false
		System.out.println(x-y);//-4
           //     System.out.println(x+1);//98 is printed.
		
		System.out.println(x+"\t"+y);//display x as 'a' and y as 'd', there is a big gap in between 

  }
}