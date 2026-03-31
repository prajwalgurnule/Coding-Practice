class main{
  public static void main(String[] args){
    String str = "Hello World";
    System.out.println(solve(str));
  }
  
  public static String solve(String str){
    StringBuilder result = new StringBuilder();
    for (char ch : str.toCharArray()){
      char lower = Character.toLowerCase(ch);
      if (lower == 'a' || lower == 'e' || lower == 'i' ||
                lower == 'o' || lower == 'u') continue;
      result.append(ch);
    }
    return result.toString();
  }
}
