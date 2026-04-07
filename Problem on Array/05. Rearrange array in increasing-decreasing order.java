// Problem Statement: Rearrange a given array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6, 3};
        int n = arr.length;
        int[] result = rearrangeArray(arr, n);
        for (int num : result) System.out.print(num + " ");
    }
    
    
    public static int[] rearrangeArray(int arr[], int n){
        Arrays.sort(arr);
        for (int i = n/2, j = n-1; i<j; i++, j--){
            // Swap Operation
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
