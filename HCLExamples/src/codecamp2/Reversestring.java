package codecamp2;

import java.util.Scanner;

	public class Reversestring

	{

	    public static void main(String[] args)

	    {
	    String reverse = "";
	         int len;
	        System.out.println("Enter string to reverse and length : ");
	        Scanner read = new Scanner(System.in);
	        String str = read.nextLine();
	           len = str.length();
	            for(int k = str.length() - 1; k >= 0; k--)

	        {
	            reverse = reverse + str.charAt(k);
	        }
	        System.out.println("Reversed string is:");
	     
	        System.out.println(reverse);
	       
	        System.out.print("Length of Entered String is : " + len);

	    }

}


