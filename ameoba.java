import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 0, s = 1;
        
       
        if (n == 0) {
            System.out.print(f);
            return;
        } else if (n == 1) {
            System.out.print(s);
            return;
        }

        int last = 0;
        for (int i = 2; i <= n; i++) {
            last = f + s;
            f = s;
            s = last;
        }
        System.out.print(last);
        sc.close();
    }
}  