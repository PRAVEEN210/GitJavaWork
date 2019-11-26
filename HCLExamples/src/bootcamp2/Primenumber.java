package bootcamp2;

import java.util.Scanner;

public class Primenumber {
	public static void main(String args[])
    {
        int num, j, count=0;
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Input any integer: ");
        num = sc.nextInt();
		
        for(j=2; j<num; j++)
        {
            if(num%j == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.print(num+"p");
        }
        else
        {
            System.out.print(num+"np");
        }
    }
}




