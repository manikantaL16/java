public class Main {
    public static void main(String[] args) {
        int height = 3;
        for (int i = 1; i <= height; i++) {
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
