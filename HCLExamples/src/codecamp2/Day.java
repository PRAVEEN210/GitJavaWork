package codecamp2;

import java.util.Scanner;

	public class Day {

		public static void main(String[] args) 
		{
			int temp,temp1,temp2,month, year, week, day;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of days:");
			temp = sc.nextInt();
			year=temp/365;
			temp1=temp%365;
			System.out.println("Total number of years: "+year);
			week=temp/7;
			month=temp/30;
			System.out.println("Total number of months: "+month);
			temp2=week&7;
			System.out.println("Total number of weeks: "+week);
			day=temp;
			System.out.println("Total number of days: "+day);
			
		}
}



