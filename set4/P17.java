

import java.util.*;
class P17{
     P17(){
        System.out.println("This is parent class");
    }
    public static void main(String args[]){

        child c=new child();
        c.dis();
       
    }
}
class child extends P17{
    void dis(){
    System.out.println("This is child class.");
}
}