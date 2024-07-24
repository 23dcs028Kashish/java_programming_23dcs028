import java.util.*;
class Employee{
 Scanner sc=new Scanner(System.in);

 String fs=" ";
 String ls=" ";
 double sal;
Employee(String f,String l,double s){
fs=f;
ls=l;
sal=s;
}
void setfs(){
 fs=sc.nextLine();
}

void setls(){
ls=sc.nextLine();
}

void setsal(){
sal=sc.nextDouble();
if(sal<0){
sal=0.0;
}
else{
sal=sal+(sal*0.10);
}
}

String getfs(){
return fs;
}
String getls(){
return ls;
}
double getsal(){
return sal;
}
}
class P13{
public static void main(String args[]){
 Employee E1=new Employee("","",0.0);
System.out.println("Enter First name:");
E1.setfs();
System.out.println("enter last name:");
E1.setls();
System.out.println("enter salary:");
E1.setsal();

System.out.println("Employee name:"+E1.getfs()+" "+E1.getls());
System.out.println("Salary:"+E1.getsal());
System.out.println("\n23DCS028 KASHISH GANDHI");
}
}
