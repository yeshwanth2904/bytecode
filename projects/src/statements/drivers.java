package statements;

public class drivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String d="unmarried";
		 char gender='m';
		 int age=6;
			if (d=="married")
			{
				System.out.println("the driver is eligible1");
				
			}
			
			else if(d=="unmarried" && gender=='m' && age>35)
			{
				System.out.println("driver is eligible2");
			}
			else if(d=="unmarried" && gender=='f' && age>25)
			{
				
				System.out.println("driver is eligible3");
			}
			else
			{
				System.out.println("driver is not eligible");
			}

	}

}
