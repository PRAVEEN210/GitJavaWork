package codecamp2;

public class Maximum {
	static int arr[] = {20, 720, 390, 540, 1000}; 
    
    // Method to find maximum of arr[] 
  static int largest() 
  { 
      int i; 
        
      // Initialize maximum element 
      int max = arr[0]; 
     
      
      // compare every element with current max   
      for (i = 1; i < arr.length; i++) 
          if (arr[i] > max) 
              max = arr[i]; 
     
      return max; 
  } 
    
  // Main method 
  public static void main(String[] args)  
  { 
      System.out.println("Absolute maximum value of given array is " + largest()); 
  } 
} 
