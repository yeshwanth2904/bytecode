package statements;

public class greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=5;
		double per;
		double area;
		area=3.14*r*r;
		System.out.println("the area of circle is:" +area);
		per=2*3.14*r;
		System.out.println("the perimetr of circle is:" +per);
		if(area>per)
		{
			System.out.println("area is greater than perimeter");
		}
		else
		{
			System.out.println("perimeter is greater than area");
		}
	}

}
