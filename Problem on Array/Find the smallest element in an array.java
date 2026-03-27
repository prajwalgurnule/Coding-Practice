// 1. Find the smallest element in an array

import java.util.*;
class Main{
// Brute Force
    // 1. Sort the array in ascending order.
    // 2. Print the element at the 0th index, which corresponds to the smallest element in the array.

    public static void main(String[] args){
        int arr[] = {2, 5, 19, 3, 23};
        System.out.println("Smallest Element = "+ SortArray(arr));
    }
    
    public static int SortArray(int arr[]){
        Arrays.sort(arr);
        return arr[0];
    }
    
// Optimal Approach
  // 1. Create a variable called min and initialize it with the value of the first element in the array.
  // 2. Use a for loop to iterate through the remaining elements in the array.
  // 3. In each iteration, compare the current element with the min variable.
  // 4. If the current element is less than the min value, update the min value with the current element's value.
  // 5. After completing the loop, print the min variable, which will hold the smallest value in the array.
    public static void main(String[] args){
        int arr[] = {2, 5, 19, 3, 23};
        int n = arr.length;
        int min = SmallestElement(arr, n);
        System.out.println("Smallest Element = "+ min);
    }
    
    public static int SmallestElement(int arr[], int n){
        int min = arr[0];
        for (int i =0; i<n; i++){
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }
    
}
