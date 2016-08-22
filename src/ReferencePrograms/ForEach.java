package ReferencePrograms;

/*
Although the enhanced for loop can make code much clearer, it can't be used in some common situations.
Only access. Elements can not be assigned to, eg, not to increment each element in a collection.
Only single structure. It's not possible to traverse two structures at once, eg, to compare two arrays.
Only single element. Use only for single element access, eg, not to compare successive elements.
Only forward. It's possible to iterate only forward by single steps.
At least Java 5. Don't use it if you need compatibility with versions before Java 5.
*/
public class ForEach {
	public static void main(String[] a){
		double [ ] numbers = {10.1, 0.2, 3, 4.5};
		for(double num : numbers){//num refers to array element value
			System.out.print(num+" ");
		}
		
		System.out.println("\nThe above for each is equivalent to traditional for loop way:");
        for( int i=0; i<numbers.length;i++){
        	double num = numbers[i];
        	System.out.print(num+" ");
        }
	}
}
