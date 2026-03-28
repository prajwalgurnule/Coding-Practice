// Problem Statement: You are given an array. The task is to reverse the array and print it.
import java.util.*;
class Main {
    // Brute Force
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int[] result = reverseA(arr, n);
        for (int num : result) System.out.print(num + " ");
    }
    
    public static int[] reverseA(int arr[], int n){
        int[] ans = new int[n];
        for (int i =0; i < n; i++){
            ans[i] = arr[n - 1 - i];
        }
        return ans;
    }
    
    // Optimal Approach - Two Pointer Approach
    public static int[] reverseA(int arr[], int n){
        int p1 = 0, p2 = n - 1;
        while (p1 < p2){
            // Swap Operation
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            // Increment and Decrement
            p1 ++; p2 --;
        }
        return arr;
    }
}
