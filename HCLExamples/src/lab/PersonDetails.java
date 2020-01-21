package lab;

import java.util.Scanner;

public class PersonDetails {
	public static void main(String args[]) {
String fullName;
String address;
String emailId;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name");
fullName =sc.nextLine();
System.out.println("Enter the address");
address = sc.nextLine();
System.out.println("Enter the EmailId");
emailId=sc.nextLine();
if (fullName.isEmpty()) {
	System.out.println("In sufficinet");
}
else if(address.isEmpty()) {
	System.out.println("In sufficient");
}
else if(emailId.isEmpty()) {
	System.out.println("In sufficient");
}
System.out.println("Name: "+fullName+" Address: "+address+" EmailId :"+emailId);
}
}