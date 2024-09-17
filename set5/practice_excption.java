class MyException extends Exception{
  MyException(String s){
    super(s);
  }
}
public class practice_excption {
    public static void main(String args[]){
        try{
            throw new MyException("gandhi");
        }
        catch(MyException e){
            
            System.out.println(e.getMessage());
            System.out.println("kashish");

        }
    }
}
