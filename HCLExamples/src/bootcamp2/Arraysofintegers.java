package bootcamp2;
import java.io.*; 
import java.util.*;
public class Arraysofintegers {
	public static boolean areEqual(int arr1[], int arr2[]) 
	    { 
	        int m = arr1.length; 
	        int n = arr2.length; 
	  
	        if (m != n) 
	            return false; 
	  
	        Arrays.sort(arr1); 
	        Arrays.sort(arr2); 
	  
	        for (int j = 0; j < m; j++) 
	            if (arr1[j] != arr2[j]) 
	                return false; 
	 
	        return true; 
	    } 
	      public static void main(String[] args) 
	    { 
	        int arr1[] = { 2, 5, 7, 1, 2 }; 
	        int arr2[] = { 7, 1, 9, 8, 4 }; 
	  
	        if (areEqual(arr1, arr2)) 
	            System.out.println("Equal."); 
	        else
	            System.out.println("Not equal."); 
	    } 
} 



