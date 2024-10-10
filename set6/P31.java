import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class P31 {
    public static void main(String[] args) {
        
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter("output.txt"))) {
            
            System.out.println("Enter text (type 'exit' to stop):");
            String inputLine;
            while (!(inputLine = consoleReader.readLine()).equalsIgnoreCase("exit")) {
                fileWriter.write(inputLine);
                fileWriter.newLine(); 
            }
            System.out.println("Text written to output.txt successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        
        try (FileInputStream byteReader = new FileInputStream("output.txt");
             FileOutputStream byteWriter = new FileOutputStream("output_bytes.dat")) {
             
            byte[] buffer = new byte[1024]; 
            int bytesRead;
            while ((bytesRead = byteReader.read(buffer)) != -1) {
                byteWriter.write(buffer, 0, bytesRead); 
            }
            System.out.println("Byte data written to output_bytes.dat successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
