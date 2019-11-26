package bootcamp;
import java.util.Scanner;
public class Personaldetails {
	 public static void main(String args[])  throws Exception
	   {
	       String name, gender;
	       int age;
	       Scanner Sc=new Scanner(System.in);
	       name= Sc.next();
	       age=Sc.nextInt();
	       gender=Sc.next();
	       
	   System.out.println("Name:"+name+", Age:"+age+" and "+"Gender:"+gender);
	                                 
	   }
}


