/*
Create a class Salad -Method: void SaladBowl (), that shows the all the content of salad, instance variables ( int no. of salad ordered), create a super class Vegetable of Salad-Instance Variables: String vegName, int vegCount, Method: getVegName(), getVegCount().
Create interface Fruits- getFruits(); Interface Sauces- getSauces();, Interface Dressing- getDressings.
Salad is the subclass of Vegetable and implements all three interfaces, create object of Salad class and call all the methods of Salad and Vegetable class as well implement methods of all three interface
Output:
No. of Salads ordered: 2
Name of Vegetable: cucumber
Vegetable count : 2
Name of Vegetable : Cabbage
Vegetable count: 1
Name of Vegetable: tomato
Vegetable count : 4
Fruits: Grapes
Sauces: Mayonise
Dressings: Russian */
package question;
class Vegetable{ 
    public String vegName;
    public int vegCount;
    public Vegetable(String vegName, int vegCount) {
        this.vegName = vegName;
        this.vegCount = vegCount;
    }

    public String getVegName() {
        return vegName;
    }

    public int getVegCount() {
        return vegCount;
    }
}
interface Fruits{
    String getfruits();
}
interface Sauces{
    String getsauces();
}
interface Dressings{
    String getdressing();
}
 class Salad extends Vegetable implements Fruits,Sauces,Dressings{
    private int noOfSaladsOrdered;

    public Salad(String vegName, int vegCount, int noOfSaladsOrdered) {
        super(vegName, vegCount);
        this.noOfSaladsOrdered = noOfSaladsOrdered;
    }

    public void SaladBowl() {
        System.out.println("No. of Salads ordered: " + noOfSaladsOrdered);
        System.out.println("Name of Vegetable: " + getVegName());
        System.out.println("Vegetable count: " + getVegCount());
    }

    

    @Override
    public String getdressing() {
        return "Russian";
        
    }

    @Override
    public String getsauces() {
        return " Mayonise";
       
    }

    @Override
    public String getfruits() {
        return "Grapes";
        
    }
    
 }
public class interface_Q2 {
    public static void main(String[] args) {
        Salad salad1 = new Salad("Cucumber", 2, 2);
        Salad salad2 = new Salad("Cabbage", 1, 2);
        Salad salad3 = new Salad("Tomato", 4, 2);

        // Calling methods of Salad and Vegetable class
        salad1.SaladBowl();
        System.out.println("Fruits: " + salad1.getfruits());
        System.out.println("Sauces: " + salad1.getsauces());
        System.out.println("Dressings: " + salad1.getdressing());

        System.out.println();

        salad2.SaladBowl();
        System.out.println("Fruits: " + salad2.getfruits());
        System.out.println("Sauces: " + salad2.getsauces());
        System.out.println("Dressings: " + salad2.getdressing());

        System.out.println();

        salad3.SaladBowl();
        System.out.println("Fruits: " + salad3.getfruits());
        System.out.println("Sauces: " + salad3.getsauces());
        System.out.println("Dressings: " + salad3.getdressing());
    }
}
