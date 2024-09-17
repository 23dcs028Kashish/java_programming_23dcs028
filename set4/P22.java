/*Write a java that implements an interface
AdvancedArithmetic which contains amethod signature
int divisor_sum(int n). You need to write a class
calledMyCalculator which implements the interface.
divisorSum function just takes an integer as input and
return the sum of all its divisors.
For example, divisors of 6 are 1, 2, 3 and 6, so
divisor_sum should return 12. The value of n will be at
most 1000. */
/**
 * InnerP22
 */
import java.util.*;
interface AdvancedArithmetic {
    int divisor_sum(int n);
    
}
class calledMyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int sum=0;
        int sqrt =(int) Math.sqrt(n);
        for(int i=1;i<=sqrt;i++){
            if(n%i==0){
                sum+=i;
                if(i!=n/i){
                    sum +=n/i;
                }
            }
        } 
        return sum;
    }
}

class P22{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
     calledMyCalculator cmc=new calledMyCalculator();
     System.out.println("enter the Number:");
     int x=sc.nextInt();

     System.out.println("sum:"+cmc.divisor_sum(x));

    }
}

