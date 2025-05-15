public class TrianglePattern {
    public static void main(String[] args) {
        int n = 6;

        // First row: all stars, no spaces
        for (int i = 1; i <= n * 2 - 1; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Next rows: stars, spaces, stars
        for (int i = 1; i < n; i++) {
            // Left stars
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            // Spaces
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}