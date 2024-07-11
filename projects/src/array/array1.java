package array;
import java.util.Scanner;
public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner tinku=new Scanner(System.in); 
    System.out.println("enter the number of elements:");
    int n=tinku.nextInt();
    int[] number=new int[n];
    int sum=0;
    System.out.println("enter the element:");
    for(int i=0; i<n;i++) {
       number[i]= tinku.nextInt();
    	sum=sum+number[i];
    }
    System.out.println(sum);
	}
}


