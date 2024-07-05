package statements;

public class anycharracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='/';
		if(c>='a' && c <= 'z')
		{
			System.out.println("it is a alphabet");
			
		}
		else if(c >= '0' && c<= '9')
		{
			System.out.println("it is a digit");
		}
		else
		{
			System.out.println("it is a special character");
		}

	}

}
