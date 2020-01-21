package bootcamp3;
import java.util.Scanner;
public class Savingsaccount {
	public static void main(String[] args) {

		long acct_no;
		String customer_name, trans_type;
		double trans_amount, bal_amount,n_balance;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number");
		acct_no = sc.nextLong();
		System.out.println("Enter Customer Name");
		customer_name = sc.next();
		System.out.println("Enter Transtion Type");
		trans_type = sc.next();
		System.out.println("Enter Trans Amount");
		trans_amount = sc.nextLong();
		System.out.println("Enter Balance");
		bal_amount = sc.nextDouble();
		System.out.println("New Balance");
		n_balance = sc.nextDouble();
		Bank b = new Bank(acct_no, customer_name, trans_type, trans_amount, bal_amount,n_balance);
		b.transaction();  // calling method

		}

		}

		class Bank {
		private long acct_no;
		private String customer_name, trans_type;
		private double trans_amount, bal_amount,n_balance;

		public Bank(long acct_no, String customer_name, String trans_type, double trans_amount, double bal_amount, double n_balance) {

		super();
		this.acct_no = acct_no;
		this.customer_name = customer_name;
		this.trans_type = trans_type;
		this.trans_amount = trans_amount;
		this.bal_amount = bal_amount;
		this.n_balance=n_balance;
		}

		public void transaction()
		{
		double amount = 0;
		if (trans_type.equals("withdrawal")) {
		if (trans_amount <= bal_amount) {
		amount = bal_amount - trans_amount;

		} else {
		System.out.println("invaid transaction");
		}
		}
		if (trans_type.equals("deposit")) {  
		amount = bal_amount + trans_amount;  

		}
		System.out.println("Account Number :" + acct_no);
		System.out.println("Customer Name :" + customer_name);
		System.out.println("Transtion Type :" + trans_type);
		System.out.println("Trans Amount :" + trans_amount);
		System.out.println("old Balance" + bal_amount);
		System.out.println("New Balance" + n_balance);

		}
}


