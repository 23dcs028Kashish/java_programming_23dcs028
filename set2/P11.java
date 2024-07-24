import java.util.*;
class P11{
public static void main(String args[]){
 String str="CHARUSAT UNIVERCITY";
int length=str.length();
System.out.println("String length="+length);
Scanner sc=new Scanner(System.in);
System.out.println("enter your name first letter:");
char n;
n=sc.next().charAt(0);

String replacedStr = str.replace('H', n);
        
System.out.println("Replaced string: " + replacedStr);
 String lowerCaseStr = replacedStr.toLowerCase();
System.out.println("Lowercase String:"+lowerCaseStr);
 System.out.println("23DCS028 KASHISH GANDHI");

}}