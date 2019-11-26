package bootcamp2;
import java.util.Scanner;


     public class Oranges {
	 public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	         int org;        
	         int gross=0;        
	         int abovegross;                      
	         int dozens;      
	         int extras;                
	         System.out.print("Enter number of oranges: ");
	         org = sc.nextInt();
	         if(org!=0) {
	         gross = org / 144;
	         abovegross = org % 144;
	         
	         dozens = abovegross / 12;
	         extras = abovegross % 12;          
	       
	System.out.println("Your number of oranges is "+gross+" gross,"+dozens+" dozen, and "+extras+".");
	      }  
	      }
}  


