package DivideNConquer;

import java.util.Arrays;
import java.util.Random;

public class QS_LomutoPartition {
	
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high); 
            quickSort(arr, low, partition - 1); 
            quickSort(arr, partition + 1, high); 
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; 
        int i = low;
        for(int j = low; j < high; j++) { 
            if (arr[j] < pivot) {
                swap(arr, i, j); 
                i++; 
            }
        }
        swap(arr, i, high); 
        return i; 
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args) {
        int []arr = new int[10];
        
        for(int i = 0; i < 10; i++) 
            arr[i] = new Random().nextInt(100);
        
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(arr));
        
        quickSort(arr, 0, arr.length - 1);
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(arr));
    }
}    
