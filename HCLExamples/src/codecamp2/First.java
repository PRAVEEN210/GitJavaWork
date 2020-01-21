package codecamp2;

import java.util.Scanner;

	public class First {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	String ename;
	int digital,digital2,digital3;
	int java,java2,java3;
	int networking,networking2,networking3;
	int digitalsum,digitalavg;
	int javaavg,javasum;
	int networksum,networkavg;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter scholar1 name");
	ename=sc.next();
	System.out.println("enter marks of digital logic");
	digital=sc.nextInt();
	System.out.println("enter marks of java");
	java=sc.nextInt();
	System.out.println("enter marks of networking");
	networking=sc.nextInt();
	System.out.println("enter Scholar 2 name:");
	ename=sc.next();
	System.out.println("enter marks of digital logic");
	digital2=sc.nextInt();
	System.out.println("enter marks of java");
	java2=sc.nextInt();
	System.out.println("enter marks of networking");
	networking2=sc.nextInt();
	System.out.println("enter Scholar 3 name:");
	ename=sc.next();
	System.out.println("enter marks of digital logic");
	digital3=sc.nextInt();
	System.out.println("enter marks of java");
	java3=sc.nextInt();
	System.out.println("enter marks of networking");
	networking3=sc.nextInt();
	digitalsum=digital+digital2+digital3;
	digitalavg=digitalsum/3;
	System.out.println("average of Digital-Logic of three scholars is:"+digitalavg);
	javasum=java+java2+java3;
	javaavg=javasum/3;
	System.out.println("average of Java of three scholars is:"+javaavg);
	networksum=networking+networking2+networking3;
	networkavg=networksum/3;
	System.out.println("average marks in networking of three scholars is:"+networkavg);
	}

}


