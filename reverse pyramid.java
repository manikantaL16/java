public class Main {
    public static void main(String[] args) {
        int height = 5;
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k=1 ;k<=i;k++){
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
}