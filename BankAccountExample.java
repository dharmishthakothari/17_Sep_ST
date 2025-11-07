package basic_17_Sep;

class BankAccount
{
	String accHolderName; 
	int accNumber;
	float balance;
	
	void setDetails(String name,int accNumber1,float initBalance)
	{
		accHolderName=name;
		accNumber=accNumber1;
		balance=initBalance;
	}
	void deposite(float amount)
	{
		//balance=blance+amount;
		balance+=amount;
	}
	void withdrow(float amount)
	{
		balance-=amount;
	}
	void displayInfo()
	{
		System.out.println(accNumber+"\t"+accHolderName+"\t"+balance);
	}
	
}


public class BankAccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount mayur=new BankAccount();
		BankAccount ritesh=new BankAccount();
		BankAccount dharmishtha=new BankAccount();
		
		mayur.setDetails("Mayur",123,10000);
		dharmishtha.setDetails("Dharmishtha",222,5000);
		
		
		mayur.displayInfo();
		mayur.deposite(2000);
		mayur.displayInfo();
		mayur.withdrow(4000);
		mayur.displayInfo();
		
		
		
		
	}

}
