import java.util.*;
class Date{
 Scanner sc=new Scanner(System.in);

 int d;
 int m;
 int y;
Date(int day, int month ,int year){
d=day;
m=month;
y=year;
}
void setd(){
 d=sc.nextInt();
if(d>31){
System.out.println("enter right day");
}
}

void setm(){
m=sc.nextInt();
if(m>12){
System.out.println("enter right month");
}

}

void sety(){
y=sc.nextInt();
}

int getd(){
return d;
}
int getlm(){
return m;
}
int gety(){
return y;
}
void displayDate(){

System.out.println("\nDate:"+d+"/"+m+"/"+y);
}
}
class P14{
public static void main(String args[]){
 Date D=new Date(0,0,0);
System.out.println("Enter day:");
D.setd();
System.out.println("enter month:");
D.setm();
System.out.println("enter year:");
D.sety();
D.displayDate();
System.out.println("\n23DCS028 KASHISH GANDHI");
}
}




