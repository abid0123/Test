public class A_rough_program2 { //wanted to call this class Gameble
	public static void main(String[]a){
		a_rough_program classroomFan=new a_rough_program();
	String c=classroomFan.getColor();  //GET
		System.out.println("my class Fan color is "+c);
		
		a_rough_program panasonicFan=new a_rough_program();
		panasonicFan.setRadius(10.0);//SET
		
		System.out.println("For classroom fan "+classroomFan.toString());//GET
		System.out.println("For panasonic fan "+panasonicFan.toString()); //GET
	
	}
}