import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number (n > 0): ");
        int decimal = scanner.nextInt();

        if (decimal > 0) {
            System.out.println("Binary representation: " + Integer.toBinaryString(decimal));
        } else {
            System.out.println("Please enter a positive number.");
        }

        scanner.close();
    }
}
