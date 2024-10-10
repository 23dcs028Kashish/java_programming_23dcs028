/*Write an example that counts the number of times a particular character, such as e, appears in a file. The
character can be specified at the command line. You can
use xanadu.txt as the input file.*/
import java.io.FileReader;
import java.io.IOException;

public class P28 {
    public static void main(String[] args) {
        
        if (args.length != 2) {
            System.out.println("Usage: java P28 <character> <filename>");
            return;
        }

        
        char targetChar = args[0].charAt(0);  
        String fileName = args[1];            

        int charCount = 0;

        
        try (FileReader reader = new FileReader(fileName)) {
            int currentChar;
            while ((currentChar = reader.read()) != -1) {
                if (currentChar == targetChar) {
                    charCount++;
                }
            }
            System.out.println("The character '" + targetChar + "' appears " + charCount + " times in " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file: " + fileName);
        }
    }
}
