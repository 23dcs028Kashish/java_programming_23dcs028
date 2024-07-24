 class P5{
    public static void main(String[] args) {
       
        int[] codes = {1, 2, 3, 4, 5};
        double[] prices = {1000, 500, 200, 150, 800};

        
        double totalBill = 0;
        for (int i = 0; i < codes.length; i++) {
            totalBill += calculateBill(codes[i], prices[i]);
        }

       
        System.out.println("Total Bill: " + totalBill);
System.out.println("23DCS028 KASHISH GANDHI");

    }

    public static double calculateBill(int code, double price) {
        double bill = 0;
        switch (code) {
            case 1:
                bill = price + (price * 0.08); // 8% tax for motor
                break;
            case 2:
                bill = price + (price * 0.12); // 12% tax for fan
                break;
            case 3:
                bill = price + (price * 0.05); // 5% tax for tube light
                break;
            case 4:
                bill = price + (price * 0.075); // 7.5% tax for wires
                break;
            default:
                bill = price + (price * 0.03); // 3% tax for all other items
                break;
        }
        return bill;

    }
}
