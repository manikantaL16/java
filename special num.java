import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a two-digit number:");
        int n = sc.nextInt();
        
        int d1 = n % 10;   
        int d2 = n / 10;   
        
        int sum = d1 + d2;
        int product = d1 * d2;
        
        if ((sum + product) == n) {
            System.out.println("The number " + n + " satisfies the condition.");
        } else {
            System.out.println("The number " + n + " does not satisfy the condition.");
        }
        
        sc.close();
    }
}
