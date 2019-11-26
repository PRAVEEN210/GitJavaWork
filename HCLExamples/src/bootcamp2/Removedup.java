package bootcamp2;
import java.util.Scanner;

    public class Removedup {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("How many numbers are you going to enter? ");
	    int num = scan.nextInt();
	    int[] arr = new int[num]; // initialize array with user inputted length
	    int[] arrflag = new int[num];
	    System.out.print("Enter number: ");
	    for (int i = 0; i < arr.length; i++) { // enter numbers into array
	        
	        arr[i] = scan.nextInt();
	        arrflag[i] = 0;
	    }

	    int[] unique = new int[arr.length];    //initialize new array that will hold unique values
	    int n=0;
	    for (int i = 0; i < arr.length; i++) {            
	        if (arrflag[i] == 0) {
	            unique[n++] = arr[i];
	            for (int j = i+1; j < arr.length; j++) {    //check all elements above int i
	                if (arr[i] == arr[j]) {                        
	                    arrflag[j]=-1;
	                }
	            }                
	        }
	    }   
	    for (int i = 0; i < n; i++) {
	            System.out.print(unique[i]);
	            
	    }
}
}


