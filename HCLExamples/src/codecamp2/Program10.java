package codecamp2;

public class Program10 {
	
		   private static int calculateDiff(int i, int j,int[] array)
		   {        
		       return Math.abs(array[i] - array[j]) + Math.abs(i - j);
		   }  
		   private static int maxDistance(int[] array)
		   {        
		       int result = 0;  
		       for (int i = 0; i < array.length; i++)  
		       {
		           for (int j = i; j < array.length; j++)
		           {
		               result = Math.max(result, calculateDiff(i,j,array));
		           }
		       }
		       return result;
		   }
		   public static void main(String[] args)
		   {
		       int[] array = {1,3,2,9};
		       System.out.println(maxDistance(array));
		   }
}


