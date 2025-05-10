import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        if (num % 7 == 0 && num % 9 == 0) {
            System.out.println("Divisible by both 7 and 9");
        } else if (num % 7 == 0) {
            System.out.println("Divisible by 7");
        } else if (num % 9 == 0) {
            System.out.println("Divisible by 9");
        } else {
            System.out.println("Not divisible by 7 or 9");
        }
        
        scanner.close();
    }
}
