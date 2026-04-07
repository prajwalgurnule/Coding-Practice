// Problem Statement: Given an array, we have to find the largest element in the array.
import java.util.*;
class Solution{
// Brute Force
    // 1. Sort the array in ascending order.
    // 2. Print the element at the (size of the array - 1)th index, which corresponds to the largest element in the array.
    public static void main(String[] args){
         // Initialize arrays
        int[] arr1 = {2, 5, 1, 3, 0};
        // Find and output the largest element in array
        System.out.println("The Largest element in the array is: " + sortArr(arr1));
    }
    
    public static int sortArr(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    
// Optimal Approach
    // 1. Create a variable called max and initialize it with the value of the first element in the array.
    // 2. Use a for loop to iterate through the rest of the elements in the array.
    // 3. In each iteration, compare the current element with the max variable.
    // 4. If the current element is greater than the max value, update the max value with the current element's value.
    // 5. After completing the loop, print the max variable, which will hold the largest value in the array.
    public static void main(String[] args){
         // Initialize arrays
        int[] arr1 = {2, 5, 1, 3, 0};
        // Find and output the largest element in array
        System.out.println("The Largest element in the array is: " + findMax(arr1));
    }
    
    public static int findMax(int arr[]) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
}
