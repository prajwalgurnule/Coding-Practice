// Average of all the elements in the array

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int nums : arr) System.out.print(" " + nums);
        int n = arr.length;
        double sum=0;
        for (int i=0; i<n; i++){
            sum += (double) arr[i];
        }
        double average = (double) sum / n;
        System.out.println("\n Average = " + average);
    }
}
