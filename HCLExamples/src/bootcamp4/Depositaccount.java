package bootcamp4;
import java.util.Scanner;
public class Depositaccount {
	
	public static void main(String[] args) {
	long acct_no;
	String customer_name,bank_name, trans_type;
	double trans_amount, bal_amount,n_balance = 0,interest_amount = 0,rate,time;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Account Number:");
	acct_no = sc.nextLong();
	System.out.print("Enter Customer Name:");
	customer_name = sc.next();
	System.out.print("Bank Name:");
	bank_name = sc.next();
	System.out.print("Enter Transtion Type:");
	trans_type = sc.next();
	System.out.print("Enter Transtion Amount:");
	trans_amount = sc.nextDouble();
	System.out.print("Enter Balance:");
	bal_amount = sc.nextDouble();
	//System.out.print("Enter Interest Amount:");
	//interest_amount = sc.nextDouble();
	//System.out.print("Enter NewBalance:");
	//n_balance = sc.nextDouble();

	Bank b = new Bank(acct_no, customer_name,bank_name, trans_type, trans_amount, bal_amount,interest_amount, n_balance);
	b.transaction();  
	}

	}

	class Bank {
	private long acct_no;
	private String customer_name,bank_name, trans_type;
	private double trans_amount, bal_amount,interest_amount,n_balance;

	public Bank(long acct_no, String customer_name,String bank_name, String trans_type, double trans_amount, double bal_amount,double interest_amount, double n_balance) {




	super();
	this.acct_no = acct_no;
	this.customer_name = customer_name;
	this.bank_name=bank_name;
	this.trans_type = trans_type;
	this.trans_amount = trans_amount;
	this.bal_amount = bal_amount;
	this.interest_amount=interest_amount;
	this.n_balance = n_balance;
	}

	public void transaction()
	{


	if (trans_type.equals("Withdrawal")) {
	if (trans_amount <= bal_amount) {  
	n_balance = bal_amount - trans_amount;  

	} else {
	System.out.println("invaid transaction");
	}
	}
	if (trans_type.equals("Deposit")) {  
	n_balance = bal_amount + trans_amount;  

	}
	if(bank_name.equals("SBI"))
	{
	double rate = 3.75, time = 1;
	interest_amount = bal_amount * (Math.pow((1 + rate / 100), time));
	}
	else if(bank_name.equals("HDFC"))
	{
	double rate = 4.5, time = 1;
	interest_amount = bal_amount * (Math.pow((1 + rate / 100), time));
	}
	else
	{
	double rate = 4.5, time = 1;
	interest_amount = bal_amount * (Math.pow((1 + rate / 100), time));
	}
	System.out.printf("Account Number :" + acct_no);
	System.out.printf("Customer Name :" + customer_name);
	System.out.printf("Bank Name :" + bank_name);
	System.out.printf("Transtion Type :" + trans_type);
	System.out.printf("Transaction Amount :Rs." +  trans_amount);
	System.out.printf("Balance Amount:Rs."+  bal_amount);
	System.out.printf("Interest Amount: Rs."+ interest_amount);
	System.out.printf("New Balance :Rs." +   n_balance);


	}
}


