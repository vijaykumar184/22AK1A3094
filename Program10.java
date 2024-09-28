import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        // Read the first N characters and display them in reverse
        try {
            File file = new File("Program10.txt");
            Scanner scanner = new Scanner(file);
            System.out.print("Enter the number of characters to read: ");
            Scanner inputScanner = new Scanner(System.in);
            int N = inputScanner.nextInt();

            StringBuilder content = new StringBuilder();
            while (scanner.hasNextLine() && content.length() < N) {
                content.append(scanner.nextLine());
            }
            scanner.close();

            // Ensure we only take the first N characters
            String firstNChars = content.substring(0, Math.min(N, content.length()));
            String reversed = new StringBuilder(firstNChars).reverse().toString();

            System.out.println("Reversed first " + N + " characters: " + reversed);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
