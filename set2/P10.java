import java.util.*;
class P10{

public static int findLength(String str) {
    return str.length();
}


public static  String toLowercase(String str) {
    return str.toLowerCase();
}


public static String toUppercase(String str) {
    return str.toUpperCase();
}


public static String reverseString(String str) {
    StringBuilder sb = new StringBuilder(str);
    return sb.reverse().toString();
}


public static String sortString(String str) {
    char chars[] = str.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
}
public static void main(String args[]){
 String str = "Kashish";
    
    int length = findLength(str);
    System.out.println("Length: " + length);
    
    String lowercase = toLowercase(str);
    System.out.println("Lowercase: " + lowercase);
    
    String uppercase = toUppercase(str);
    System.out.println("Uppercase: " + uppercase);
    
    String reversed = reverseString(str);
    System.out.println("Reversed: " + reversed);
    
    String sorted = sortString(str);
    System.out.println("Sorted: " + sorted);
System.out.println("23DCS028 KASHISH GANDHI");

}
}