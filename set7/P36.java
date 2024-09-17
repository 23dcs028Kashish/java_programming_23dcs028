/*Write a program to create three threads ‘FIRST’,
‘SECOND’, ‘THIRD’. Set the priority of the ‘FIRST’
thread to 3, the ‘SECOND’ thread to 5(default) and the
‘THIRD’ thread to 7. */
import java.util.*;

public class P36 extends Thread {
  P36(String a){
    super(a);
 }
     public void run(){
    
        try {
            Thread.sleep(1000);
            System.out.println("call of "+ this.getName());
        } catch (Exception e) {
            System.out.println(e);
    }
}
public static void main(String[] args) {
    P36 p1= new P36("first");
    P36 p2= new P36("second");
    P36 p3= new P36("Third");
    p1.setPriority(3);
    p2.setPriority(5);
    p3.setPriority(7);
    p1.start();
    p2.start();
    p3.start();
}
}