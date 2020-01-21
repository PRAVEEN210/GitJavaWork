package codecamp2;

import java.util.Scanner;
		public class Palindrome
     	{
	    public static void main(String args[])
	    {
		        String x,y = "";
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter your string: ");
		        x = sc.nextLine();
		        int n = x.length();
		        for(int i= n-1; i>= 0; i--)
		        {
		            y = y + x.charAt(i);
		        }
		        if(x.equalsIgnoreCase(y))
		        {
		            System.out.println("Given string is palindrome.");
		        }
		        else
		        {
		            System.out.println("Given string is not palindrome.");
		        }
		    }

}



