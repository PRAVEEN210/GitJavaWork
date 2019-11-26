package bootcamp;

import java.util.Scanner;

public class Fibanocci {
	public static void main(String args[])  
	{    
	int num;
	System.out.print("n=");
	Scanner sc=new Scanner (System.in);
	int a=1;
	int b=0;
	num=sc.nextInt();

	for(int i=0;i<num;i++)
	{
	System.out.print(b);
	b=a+b;
	a=b-a;
	if(i<=num-2)
	{
	System.out.print(" ");
	}
	// if (i == num - 1) {
	// System.out.println(".\nThese are the first " + num + " Fibonacci Numbers!");
	// }
	}
	}

}
