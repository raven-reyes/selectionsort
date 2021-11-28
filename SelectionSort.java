import java.util.Arrays;

public class SelectionSort {
	public static void sort(int arr []) {
		// traverse unsorted array 
        for (int i = 0; i < arr.length; i++) 
        { 
        	
            // Find the minimum element in unsorted array 
            int min = i; 
            for (int j = i+1; j < arr.length; j++) 
                if (arr[j] < arr[min]) 
                    min = j; 
   
            // swap minimum element with compared element  
           int temp = arr[i];
           arr[i] = arr[min] ;
           arr[min] = temp;
           }
           
        } 
    
	// driver code 
	public static void main(String [] args) {
			int arr [] = {7,4,16,3};
			System.out.println("The original array is : " + Arrays.toString(arr));
			sort(arr);
			System.out.println("The sorted array is : " + Arrays.toString(arr));
		}
		
	}

	


	
		
	
