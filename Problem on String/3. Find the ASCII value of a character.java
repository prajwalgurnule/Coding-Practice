import java.util.*;

class main{
  public static void main(String[] args){
    
    solve();
  }
  
  public static void solve(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Character - ");
    char ch = sc.next().charAt(0);
    System.out.println("The ASCII value of " + ch + " is " + (int) ch);
  }
}
