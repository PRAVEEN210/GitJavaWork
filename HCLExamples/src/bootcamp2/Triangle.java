package bootcamp2;
   import java.util.Scanner;
	   public class Triangle {
	      public static void main(String args[])
	   {  
	        int x ,y ,z;
	        int sum;
	        String[] linevector;
	        String line;
	        Scanner sc=new Scanner(System.in);
	   
	           line=sc.nextLine();
	           linevector=line.split(",");
	   
	             x=Integer.parseInt(linevector[0]);
	             y=Integer.parseInt(linevector[1]);
	             z=Integer.parseInt(linevector[2]);
	   
	            sum=x+y+z;
	             if (sum== 180)
	               System.out.print("Triangle");
	             else
	               System.out.print("Not a Triangle");    
	        }
}



