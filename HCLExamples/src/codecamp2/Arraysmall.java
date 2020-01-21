package codecamp2;

import java.util.Scanner;

	public class Arraysmall {
		public static int getSmallest(int[] a, int total){  
			int temp;
			for (int j = 0; j < total; j++)  
			       {  
			           for (int k = j + 1; k < total; k++)  
			           {  
			               if (a[j] > a[k])  
			               {  
			                   temp = a[j];  
			                   a[j] = a[k];  
			                   a[k] = temp;  
			               }  
			           }  
			       }  
			      return a[0];  
			}  
			public static void main(String args[]){  
			int b[]={52,63,97,81,54,98,11,4,12,17};    
			System.out.println("Smallest of an array is: "+getSmallest(b,10));  
			}
}



	






