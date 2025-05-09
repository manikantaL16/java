import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = sc.nextInt();
        
        System.out.println("Collatz sequence:");
        System.out.print(n + " ");
        
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (3 * n) + 1;
            }
            System.out.print(n + " ");
        }
        
        sc.close();
        System.out.println("\nSequence complete.");
    }
}
