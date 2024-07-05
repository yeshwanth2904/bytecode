package statements;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=60,b=60,c=60;
		if(a==b && a==c)
		{
			System.out.println("it is a equilateral triangle");
		}
		else if(a==b || a==c)
		{
			System.out.println("it is a isoceles triangle");
		}
		else
		{
			System.out.println("it is a scalene triangle");
		}

	}

}
