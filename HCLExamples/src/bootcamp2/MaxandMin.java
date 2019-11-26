package bootcamp2;

public class MaxandMin {
	
		public static void main(String args[]){
		    int array[] = new int[]{10, 4, 5, 4, 8, 10};
		 
		    // Calling getMax() method & getMin() method for getting max & min value
		    int max = getMax(array);
		    int min = getMin(array);
		    System.out.print("Max = "+max+ " & Min = "+min);

		  }
		 
		  // Method for getting the maximum value
		  public static int getMax(int[] inputArray){ 
		    int maxValue = inputArray[0]; 
		    for(int i=1;i < inputArray.length;i++){ 
		      if(inputArray[i] > maxValue){ 
		         maxValue = inputArray[i]; 
		      } 
		    } 
		    return maxValue; 
		  }
		 
		  // Method for getting the minimum value
		  public static int getMin(int[] inputArray){ 
		    int minValue = inputArray[0]; 
		    for(int i=1;i<inputArray.length;i++){ 
		      if(inputArray[i] < minValue){ 
		        minValue = inputArray[i]; 
		      } 
		    } 
		    return minValue; 
		  } 

}



