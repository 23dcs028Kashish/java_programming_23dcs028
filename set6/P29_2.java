public class P29_2 {
    public static void main(String[] args) {
        
        int num = 10;

        
        Integer wrappedNum = num;

        
        int unwrappedNum = wrappedNum;

        
        String binaryString = Integer.toBinaryString(num);
        int comparison = Integer.compare(wrappedNum, 20);

        System.out.println("Primitive int: " + num);
        System.out.println("Wrapped Integer: " + wrappedNum);
        System.out.println("Binary representation of " + num + ": " + binaryString);
        System.out.println("Comparison of " + wrappedNum + " with 20: " + (comparison < 0 ? "Less than 20" : "Greater or equal to 20"));
    }
}
