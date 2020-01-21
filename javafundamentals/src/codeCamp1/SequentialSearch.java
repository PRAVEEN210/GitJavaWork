package codeCamp1;

import java.io.IOException;
import java.util.ArrayList;

public class SequentialSearch {
	public static void main(String[] args) throws IOException {
		int n = 6;
		ArrayList<Integer> arrli = new ArrayList<Integer>(n);
		for (int i = 1; i <= n; i++)
			arrli.add(i);
		System.out.println(arrli);
		arrli.remove(5);
		System.out.println(arrli);

		for (int i = 0; i < arrli.size(); i++)
			System.out.print(arrli.get(i) + " ");
	}
}
