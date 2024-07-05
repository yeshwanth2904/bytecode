package assingment3;
import java.util.Scanner;
public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner S=new Scanner(System.in);
    int a=S.nextInt();
    int b=S.nextInt();
    int c=S.nextInt();
    if (a>b && b>c)
    {
    	System.out.println("a is greater"+a);
    }
    else if(b>c && b>a) 
       {
    		System.out.println("b is greater"+b);
    	}
    else 
    {
    System.out.println("c is greater"+c);
    
	}

	}}
