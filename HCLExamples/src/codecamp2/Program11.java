package codecamp2;

import java.util.Scanner;

public class Program11 {
   public static void main(String args[])
   {
    int j,space,rows,k=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter No. of Rows :");
    rows=sc.nextInt();
   
       for (j=1; j<=rows; j++)
       {  
           for (space=1; space<=(rows-j);space++)
           {    
               System.out.print(" ");
           }
           while (k!= (2*j-1) )
           {  
               System.out.print("*");
               k++;
           }
           k=0;
           System.out.println();
       }
   }
 

}




