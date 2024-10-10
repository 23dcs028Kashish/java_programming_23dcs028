import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class P41 {
    
    public static void main(String[] args) {
        
        HashSet<String> javaKeywords = new HashSet<>();
        String[] keywords = {
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue",
            "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "goto", "if", "implements",
            "import", "instanceof", "int", "interface", "long", "native", "new", "null", "package", "private", "protected",
            "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws",
            "transient", "try", "void", "volatile", "while", "true", "false"
        };

        
        for (String keyword : keywords) {
            javaKeywords.add(keyword);
        }

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path of the Java source file: ");
        String filePath = scanner.nextLine();

        
        int keywordCount = 0;

        try {
            Scanner fileScanner = new Scanner(new File(filePath));

           
            while (fileScanner.hasNext()) {
                String word = fileScanner.next();
                
                
                if (javaKeywords.contains(word)) {
                    keywordCount++;
                }
            }

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }

        
        System.out.println("Number of Java keywords in the Drivwfile: " + keywordCount);

        scanner.close();
    }
}
