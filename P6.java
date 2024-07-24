
import java.util.*;
class P6{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

int n;
System.out.print("enter the number of day:");
n=sc.nextInt();
int n1=0,n2=1,n3;
System.out.print(n1+" "+n2);
for(int i=2;i<n;++i){
  n3=n1+n2;
System.out.print(" "+n3);
n1=n2;
n2=n3; 
}
System.out.println(" ");
System.out.println("23DCS028 KASHISH GANDHI");
}} 