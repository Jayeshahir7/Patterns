public class ReverseLeftHalfPyramid {
 public static void main(String[] args) 
 {
     int n = 5; // Number of rows
     for (int i = n; i >= 1; i--) {
         // Print spaces
         for (int k = 1; k <= n - i; k++) {
             System.out.print(" ");
         }
         // Print stars
         for (int j = 0; j < i; j++) {
             System.out.print("*");
         }
         System.out.println();
     }
 } 

}
