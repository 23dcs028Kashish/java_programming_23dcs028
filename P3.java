import java.util.*;
class P3{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter Distance in meter:");
int d=sc.nextInt();
System.out.println("enter the time:");
System.out.print("Enter Hour:");
int hr=sc.nextInt();
System.out.print("Enter minutes:");
int min=sc.nextInt();
System.out.print("Enter seconds:");
int sec=sc.nextInt();
int time=(hr*3600)+(min*60)+sec;
float v=(float)d/time;
System.out.println("Speed in m/s:"+v);
time=hr+(min/60)+(sec/3600);
 v=(float)(d*0.001)/time;
System.out.println("Speed in km/h:"+v);
v=(float)(d/1609)/time;
System.out.println("speed in mil/h:"+v);
System.out.println("23DCS028 KASHISH GANDHI");
}
}