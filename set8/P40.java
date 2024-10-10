import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Scanner;

public class P40 {
    public static void main(String[] args) {
        
        Map<String, Integer> wordMap = new TreeMap<>();

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String inputText = scanner.nextLine();

       
        String[] words = inputText.toLowerCase().split("[\\W]+");

        
        for (String word : words) {
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        
        Set<Map.Entry<String, Integer>> entrySet = wordMap.entrySet();
        System.out.println("\nWord Count:");
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
