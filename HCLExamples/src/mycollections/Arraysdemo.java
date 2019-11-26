package mycollections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Arraysdemo implements Comparator {
	
	public static void main(String[] args) {
		int marks[]= {82,78,55};
		String subjects[]= {"Maths","Physics","Chemistry"};
		List<String> booklist=new ArrayList<String>();
		booklist.add("Let us C by Yashwanth Kanethar");
		booklist.add("Welcome to Java by Herbert Sheildt");
		booklist.add("Core Java");
		
		//Collections.sort(booklist);
		Collections.sort(booklist,Collections.reverseOrder());
		
		for(String book:booklist)
		{
			System.out.println(book);
		}
		System.out.println("Before sorting an array:");
		for(int m : marks)
		{
			System.out.println(m);
		}
		Arrays.parallelSort(marks);
		System.out.println("After sorting an array:");
		for(int m : marks)
		{
			System.out.println(m);
		}
	}
	
	@Override
	public int compare(Object arg0, Object arg1) {
		String s1=(String)arg0;
		String s2=(String)arg1;
		if(s1.equals(s2))
	}

}
