package lab;

import java.util.Scanner;

public class Series {
public static void main(String args[]) {
	int k, a=0,b=3;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the elements:");
	k=sc.nextInt();
	for (int i=0;i<k;i++) {
		System.out.print(" " +a+ ",");
		a=a+b;
		b=b+2;
	}
}
}
