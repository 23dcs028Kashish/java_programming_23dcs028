import java.util.Arrays;

public class P39 {
    
    public static <T extends Comparable<T>> void sort(T[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    static class Product implements Comparable<Product> {
        String name;
        double price;
        double rating;

        public Product(String name, double price, double rating) {
            this.name = name;
            this.price = price;
            this.rating = rating;
        }

        @Override
        public int compareTo(Product other) {
            return Double.compare(this.price, other.price);
        }

        @Override
        public String toString() {
            return "Product{name='" + name + "', price=" + price + ", rating=" + rating + '}' ;
        }
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product("Laptop", 999.99, 4.5),
            new Product("Smartphone", 699.99, 4.7),
            new Product("Tablet", 299.99, 4.2),
            new Product("Monitor", 199.99, 4.6)
        };

        System.out.println("Before sorting: " + Arrays.toString(products));
        System.out.println();
        
        sort(products);

        System.out.println("After sorting: " + Arrays.toString(products));
    }
}
