package lab;

import java.util.Scanner;

public class ElectricityBill {

	private static Scanner sc;

	public static void main(String[] args) {
		String name;
		int units;
		double billAmount;
		sc = new Scanner(System.in);
		System.out.println("Enter Customer name:");
		name = sc.next();
		System.out.print(" Please Enter the Units that you Consumed  : ");
		units = sc.nextInt();

		billAmount = Electricity(units);
		System.out.println("\n Electricity Bill  =  " + billAmount);
	}

	public static double Electricity(int units) {
		double amount, sur_Tax = 0.1475, billAmount, fixed_MeterLength = 250;
		if (units == 100) {
			amount = units * 3.25;

		} else if (units == 200) {
			amount = units * 4.75;

		}

		else {
			amount = units * 6.35;

		}

		billAmount = amount + sur_Tax + fixed_MeterLength;
		return billAmount;
	}
}
