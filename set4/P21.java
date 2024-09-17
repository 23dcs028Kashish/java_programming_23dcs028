/*Create a class 'Degree' having a method 'getDegree' that
prints "I got a degree". It has two subclasses namely
'Undergraduate' and 'Postgraduate' each having a method
with the same name that prints "I am an Undergraduate"
and "I am a Postgraduate" respectively. Call the method
by creating an object of each of the three classes. */ 
class Degree{
    void getDegree(){
        System.out.println("I got a degree.");
    }
}
class Undergraduate extends Degree{
    void getDegree(){
        System.out.println("I am an Undergraduate.");
    }    
}
class Postgraduate extends Degree{
    void getDegree(){
        System.out.println("I am a Postgraduate.");
    }
}
public class P21 {
    public static void main(String[] args) {
        Degree D=new Degree();
        Undergraduate UG=new Undergraduate();
        Postgraduate PG=new Postgraduate();

        D.getDegree();
        UG.getDegree();
        PG.getDegree();
    }
}
