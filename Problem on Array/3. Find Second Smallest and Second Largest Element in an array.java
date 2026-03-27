// Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

import java.util.*;
class Main{
    
// Brute Force
    // Sort the array in ascending order.
    // The element at the second index (index 1) is the second smallest element.
    // The element at the second index from the end (index length-2) is the second largest element.
    public static void getElements(int[] arr, int n) {
        
        // Edge case: when the array has less than 2 elements
        if (n == 0 || n == 1) {
            System.out.println(-1 + " " + -1);  // Print -1 for both second smallest and second largest
            return;
        }

        // Sort the array to easily find the second smallest and second largest elements
        Arrays.sort(arr);

        // Second smallest element is at index 1 after sorting
        int small = arr[1];

        // Second largest element is at index n-2 after sorting
        int large = arr[n - 2];

        // Output the second smallest and second largest elements
        System.out.println("Second smallest is " + small);
        System.out.println("Second largest is " + large);
    }

    public static void main(String[] args) {
        
        // Initialize the array with elements
        int[] arr = {1, 2, 4, 6, 7, 5};
        
        // Calculate the size of the array
        int n = arr.length;
        
        // Call the method to find and print the second smallest and second largest elements
        getElements(arr, n);
    }
    
// Optimal Approach
    
    public static void main(String[] args) {
        int[] arr = {2, 5 , 1, 6, 9, 8};
        Arrays.sort(arr);
        int n = arr.length;
        System.out.println(" Second Smallest : " + secondSmallest(arr, n));
        System.out.println(" Second Largest : " + secondLargest(arr, n));
    }
    
    public static int secondSmallest(int arr[], int n){
        if (n < 2) return -1;   // for array element less than 2
        int sm = Integer.MAX_VALUE, ssm = Integer.MAX_VALUE;    // sm = small, ssm = second small
        for (int i = 0 ; i < n; i++){
            if (arr[i] < sm){
                ssm = sm;
                sm = arr[i];
            }else if( arr[i] < ssm && arr[i] != sm) ssm = arr[i];
        }
        return ssm;
    }
    
    public static int secondLargest(int arr[], int n){
        if (n < 2) return -1;   // for array element less than 2
        int l = Integer.MIN_VALUE, sl = Integer.MIN_VALUE;    // l = large, sl = second large
        for (int i = 0 ; i < n; i++){
            if (arr[i] > l){
                sl = l;
                l = arr[i];
            }else if( arr[i] > sl && arr[i] != l) sl = arr[i];
        }
        return sl;
    }
}
