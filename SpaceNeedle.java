// Nicole Nobbay
// 11/19/2021
// CSE 142
// TA: Thien Tran
// Resubmission: Assessment #2
// Prints a text image of the Space Needle with a specific
// size that can be adjusted.

// A class to represent the figure of the Space Needle.
public class SpaceNeedle {
   public static final int SIZE = 4;
   
   public static void main(String [] args) {
      point();
      chunk();
      bottomHalf();
      point();
      body();
      chunk();
   }
   
   // Prints the slim point of the Space Needle figure at
   // its top and its middle.
   public static void point() {
      for (int i = 1; i <= SIZE; i++) {
         for (int j = 1; j <= 3 * SIZE; j++) {
            System.out.print(" ");
         }
         System.out.println("||");
      }
   }
   
   // Prints the top half of the head of the Space Needle figure
   // as well as the base of the figure.
   public static void topHalf() {
      for (int i = 1; i <= SIZE; i++) {
         for( int j = 1; j <= -3 * i + 3 * SIZE; j++) {
            System.out.print(" ");
         }
         System.out.print("__/");
         
         for (int j = 1; j <= 3 * i - 3; j++) {
            System.out.print(":");
         }
         System.out.print("||");
         
         for( int j = 1; j<= 3 * i - 3 * SIZE; j++) {
            System.out.print(" ");
         }
         for (int j = 1; j <= 3 * i - 3; j++) {
            System.out.print(":");
         }
         System.out.println("\\__");
      }
   }
   
   // Prints the middle line of the head and the last
   // line of the Space Needle figure.
   public static void fringe() {
      System.out.print("|");
      
      for (int i = 1; i <= 6 * SIZE; i++) {
         System.out.print('"');
      }
      System.out.println("|");
   }
   
   // Prints the bottom half of the head of the Space Needle figure.
   public static void bottomHalf() {
      for (int i = 1; i <= SIZE; i++) {
         for (int j = 1; j <= 2 * i - 2; j++) {
            System.out.print(" ");
         }
         System.out.print("\\_");
         
         for (int j = 1; j <= -2 * i + (SIZE * 3) + 1; j++) {
            System.out.print("/\\");
         }
         System.out.println("_/");
      }
   }
   
   // Prints the rectangular body of the Space Needle figure.
   public static void body() {
      for (int i = 1; i <= SIZE * SIZE; i++) {
         for (int j = 1; j <= SIZE * 2 + 1; j++) {
            System.out.print(" ");
         }
         System.out.print("|");
         
         for (int j = 1; j <= SIZE - 2; j++) {
            System.out.print("%");
         }
         System.out.print("||");
         
         for (int j = 1; j <= SIZE - 2; j++) {
            System.out.print("%");
         }
         System.out.println("|");
      }
   }
   
   // Prints the top half and base of the Space Needle figure in
   // addition to the middle and last line of the figure
   // one after the other.
   public static void chunk() {
      topHalf();
      fringe();
   }
}