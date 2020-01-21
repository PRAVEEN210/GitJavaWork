package codeCamp1;
import java.util.Scanner;
public class Seven {
			   public static void main(String args[])
		   {
		       int i, j,k;
		       int arr[][] = new int[3][3];
		       int arr1[][]=new int[3][3];
		      int arrm[][]=new int[3][3];
		       Scanner scan = new Scanner(System.in);
		   
		       System.out.print("Enter Array1 Elements : ");
		       for(i=0; i<3; i++)
		       {
		           for(j=0; j<3; j++)
		           {
		               arr[i][j] = scan.nextInt();
		           }
		       }
		       System.out.print("Enter Array2 Elements : ");
		       for(i=0; i<3; i++)
		       {
		           for(j=0; j<3; j++)
		           {
		               arr1[i][j] = scan.nextInt();
		           }
		       }
		       	      	      	   		        
		       System.out.println("Multiplication of two matrices is");
		       for (i = 0; i < 3; i++) {
		           for (j = 0; j < 3; j++) {
		               for (k = 0; k < 3; k++) {
		                   arrm[i][j] += arr[i][k] * arr1[k][j];
		               }
		           }
		       }
		       for (i = 0; i < 3; i++) {
		           for (j = 0; j < 3; j++) {
		               System.out.print(arrm[i][j] + " ");
		           }
		           System.out.print("\n");
		       }
		      
		   }
		  
	}

