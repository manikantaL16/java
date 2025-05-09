public class Main {
    static String isKaprekar(int n) {
        int sq = n * n;
        int temp = sq;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }
    
        int pow = 1;
        for (int i = 1; i < digits; i++) {
            pow *= 10;
            int left = sq / pow;
            int right = sq % pow  ;
            if (right != 0 && (left + right) == n) {
                return "Kaprekar Number";
            }
        }
        return (n == 1) ? "Kaprekar Number" : "Not a Kaprekar Number";
    }
     
    public static void main(String[] args) {
        for (int i =  1; i < 100; i++)
            System.out.println("Number: " + i + " - " + isKaprekar(i));
    }
}
