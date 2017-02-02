//
class Account
{
    private String name;
    private int bal;

    Account(String name,int bal)
    {
        this.name=name;
        this.bal=bal;
    }

    void withdraw(int amt)
    {
        bal-=amt;
    }
	
//synchronized	
  void withdrawAction(int amt)
    {
        System.out.println(name + " is going to withdraw ");
        
		if(bal>amt)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            withdraw(amt);
        }
        else
        {
            System.out.println("Can not withdraw ");
            return;
        }
        System.out.println("Withdraw complete , Bal : " + bal);
    }
}
class AccountTransactions extends Thread
{
    Account accObj;
    int amt;

    AccountTransactions(Account accObj,int amt)
    {
        this.accObj=accObj;
        this.amt=amt;
    }
    public void run()
    {

			//accObj.withdrawAction(amt);

			synchronized(accObj)
			{
				accObj.withdrawAction(amt);
			}
	}

}

class  TestAccount
{
    public static void main(String[] args)
    {
        Account accObj=new Account("Ram",1000);
       Account accObj2=new Account("Gopal",2000);

        AccountTransactions thr1=new AccountTransactions(accObj,600);//imp
        AccountTransactions thr2=new AccountTransactions(accObj2,600);

        thr1.start();
        thr2.start();

    }
}
