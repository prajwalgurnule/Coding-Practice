import java.util.*;
class Main{
    public static void main(String args[]){
        int[] nums = {4, 5, 4, 2, 2, 3, 1};
        ArrayList<Integer> result = removeDuplicates(nums);
        System.out.print("Array after removing duplicates: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    
    public static ArrayList<Integer> removeDuplicates(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i =0; i< arr.length; i++){
            boolean found = false;
            for (int j =0; j<result.size(); j++){
                if (arr[i] == result.get(j)){
                    found = true;
                    break;
                }
            }
            if (!found) result.add(arr[i]);
        }
        return result;
    }
}
