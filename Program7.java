import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your date of birth (DD-MM-YYYY): ");
        String dob = scanner.next();

        int luckyNumber = calculateLuckyNumber(dob);
        System.out.println("Your lucky number is: " + luckyNumber);
    }

    public static int calculateLuckyNumber(String dob) {
        int sum = 0;
        for (char c : dob.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += c - '0';
            }
        }

        while (sum > 9) {
            int temp = 0;
            while (sum > 0) {
                temp += sum % 10;
                sum /= 10;
            }
            sum = temp;
        }
        return sum;
    }
}