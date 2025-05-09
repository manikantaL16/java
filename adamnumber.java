public class Main {
    static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    static int square(int num) {
        return num * num;
    }

    static String isAdamNumber(int num) {
        int oSquare = square(num);
        int reverseSquare = square(reverse(num));
        int reversedSquaredReversed = reverse(reverseSquare);
        return (oSquare == reversedSquaredReversed) ? "Adam Number" : "Not an Adam Number";
    }

    public static void main(String[] args) {
        int num = 12;
        System.out.println("Number: " + num);
        System.out.println("Result: " + isAdamNumber(num));
    }
}
