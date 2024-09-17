
import java.util.*;

public class pra extends Thread {
    public void run(){
        System.out.println("Kashish");
    }
    public static void main(String[] args) {
        pra t1=new pra();
        t1.start();
    }
}
