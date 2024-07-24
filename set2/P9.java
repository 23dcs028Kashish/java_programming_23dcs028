import java.util.*;
class P9{

public static String double_char(String str) {
    String result = "";
    for (int i = 0; i < str.length(); i++) {
        result += str.substring(i, i + 1) + str.substring(i, i + 1);
    }
    return result;
}


public static void main(String[] args) {
    System.out.println(double_char("The")); 
    System.out.println(double_char("AAbb")); 
    System.out.println(double_char("Hi-There")); 
 System.out.println("23DCS028 KASHISH GANDHI");
}
}

