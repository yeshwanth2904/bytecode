package statements;

public class calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount=50000;
		int sell=40000;
		int result;
		result=sell-amount;
		if(result>0)
		{
			System.out.println("it is a profit by:" +result);
		}
		else if(result<0)
		{
			System.out.println("it is a loss by:" +result);
			
		}
		else
		{
			System.out.print("it is not a profit or loss :" +amount);
		}

	}

}
