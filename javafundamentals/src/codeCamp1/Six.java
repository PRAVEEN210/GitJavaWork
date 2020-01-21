package codeCamp1;
import java.util.Scanner;
public class Six {
	public static void main(String[] args) {
		int j = 0, q = 0;
		Scanner s = new Scanner(System.in);

		int p[] = new int[10];
		int odd[] = new int[10];
		int even[] = new int[10];
		System.out.println("Enter car numbers:");
		for (int i = 0; i < 10; i++) {
			p[i] = s.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			if (p[i] % 2 != 0) {
				odd[j] = p[i];
				j++;
			} else {
				even[q] = p[i];
				q++;
			}
		}
		System.out.print("Odd:");
		if (j > 1) {
			for (int i = 0; i < (j - 1); i++) {
				System.out.print(odd[i] + ",");
			}
			System.out.print(odd[j - 1]);
		} else {
			System.out.println("No number");
		}
		System.out.println("");
		System.out.print("Even:");
		if (q > 1) {
			for (int i = 0; i < (q - 1); i++) {
				System.out.print(even[i] + ",");
			}
			System.out.print(even[q - 1]);
		} else {
			System.out.println("No number");
		}
	}

}
