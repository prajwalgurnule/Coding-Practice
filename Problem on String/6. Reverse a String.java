class Main{
    public static void main(String[] args){
        String str = "Helo World";
        System.out.println("Original String - " +str);
        String result = reverse(str);
        System.out.println("Updated String - " +result);
    }
    
    public static String reverse(String str){
        char[] c = str.toCharArray();
        // two Pointer
        int left = 0, right = c.length - 1;
        while (left < right){
            // swap
            int temp = c[left];
            c[left] = c[right];
            c[right] = c[left];
            // Move the pointers
            left ++; right --;
        }
        return new String(c);
    }
}
