package bootcamp2;

	import java.io.*;
	import java.util.ArrayList;
	 
	public class Marks {
	public static void main(String[] args)
	   {
	 
	       ArrayList<Integer> arrlist = new ArrayList<Integer>(6);
	 
	       arrlist.add(56);
	       arrlist.add(65);
	       arrlist.add(67);
	       arrlist.add(87);
	       arrlist.add(47);

	       arrlist.add(2, 78);
	 
	       for (Integer number : arrlist) {
	           System.out.print(""+number+",");
	       }
	   }
}


