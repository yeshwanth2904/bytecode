import java.util.*;
public class BankAccount
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);

       BankAccount1 account1=new BankAccount1();
       account1.account=s.nextLine();
       account1.accountHolder=s.nextLine();
       account1.balance=s.nextDouble();
        account1.displayinfo();
        double amount=s.nextDouble();
        if(amount>0)
        {
            account1.deposit(amount);
        }
       else {
            account1.withdraw(amount);
        }


    }
    public static class BankAccount1
    {
        Scanner s=new Scanner(System.in);
        String account;
        String accountHolder;
        double balance;

        public void displayinfo()
        {
            System.out.println(account);
            System.out.println(accountHolder);
            System.out.println(balance);
        }
        public void deposit(double amount)
        {
            balance=balance+amount;
            System.out.println("Deposited amount"+balance);
        }
        public void withdraw(double amount)
        {
            if(amount<=balance)
            {
                balance=balance+amount;
                System.out.println("withdraw"+balance);
            }
            else
            {
                System.out.println("no money");
            }
        }
    }

}