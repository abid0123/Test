//Program to illustrate copying an array using arraycopy
package ReferencePrograms;
public class ArraySystemCopy {
 public static void main(String[]args)
 {
   int []a = {22, 33, 44, 55, 66, 77, 88, 99};
   System.out.println("a: " + a); //address of a printed
   print (a);//call print method to print a's element
   int[]aa=new int[a.length];
   System.out.println("aa: " + aa);//aa address
   print (aa);//aa element value, default are all 0
   aa[1]=11;
   print(a);
   print(aa);
   aa = new int [12];//aa is another array, has another address,different size 
   System.arraycopy(a,0,aa,3,8);//(Object src, int srcPos, Object dest, int destPos, int length)
   
   System.out.println("aa:  " + aa);
   print(aa);
   
 } 

 public static void print(int[]a)
 {
   for (int i=0;i<a.length;i++)
    System.out.print(a[i] + " ");
    System.out.println();
 }
    
}






