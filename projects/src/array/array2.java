package array;
import java.util.Scanner;
public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s= new Scanner(System.in); 
 System.out.println("enter the the elements");
 int n=s.nextInt();
 int[] number=new int[n];
 System.out.println("Enter the numbers");
 for(int i=0;i<n;i++);
  number[i]=s.nextInt();
  System.out.println("Even elements in the array are:");
  for (int number : number) 
      if (number % 2 == 0) {
          System.out.println(number);
      }
  }
	}
	


