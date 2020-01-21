package codecamp2;

import java.util.Scanner;
	public class Stringcharacter 
	{

		public static void main(String[] args) 
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a string");
			String string=sc.next();
			int length=string.length();
			if(length%2!=0)
			{
			 char c= (char) string.codePointAt(length/2);
			 System.out.println("The middle character is "+c);	
			}
			else
			{
				char c1=  (char) string.codePointAt((length/2)-1);
				char c2=  (char) string.codePointAt(length/2);
				System.out.println("The middle characters are "+c1+" "+c2);
			}
		}

}


