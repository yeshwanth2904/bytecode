package statements;

public class electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int units=200;
		float bill;
		if(units>=0 && units<100)
		{
			bill=2*units;
			System.out.println("electricity bill is:"+bill);
		}
		else if(units>=100 && units<200)
		{
			bill=3*units;
			System.out.println("electricity bill is:"+bill);
		}
		else if(units>=200 && units<300)
		{
			bill=4*units;
			System.out.println("electricity bill is:"+bill);
		}
		else
		{
			  bill=5*units;
				System.out.println("electricity bill is:"+bill);}
		
	}

}
