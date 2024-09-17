interface MyInterface{
    void abstractMethod();

    default void defaultMethod(){
        System.out.println("this is defult interface");
    }
}
class Myclass implements MyInterface{
    public void abstractMethod(){
        System.out.println("this abstract");
    }
}

class Myclass1 implements MyInterface{
    public void abstractMethod(){
        System.out.println("this abstract kashish");
    }
}
public class interface_Q {
     public static void main(String args[]){
        Myclass m=new Myclass();
        m.abstractMethod();
        m.defaultMethod();
        Myclass1 n=new Myclass1();
        n.abstractMethod();

     }
    
}
