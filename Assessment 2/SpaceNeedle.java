// Zareef Amyeen
// 1.18.2022
// CSE 142 Section BS
// TA: Michelle Jose Morris
// Take Home Assessment 2 Part B
// Prints a text art of the space needle that varies with size

//class Space Needle that contains the methods to print the Space Needle
public class SpaceNeedle{
   public static final int SIZE = 2;
   //Summary of how the Space Needle is printed
   public static void main(String[] args){
      printNeedle();
      topHalfBar();
      bottomHalf();
      printNeedle();
      printStem();
      topHalfBar();
   }
   
   //Prints the needle of the Space Needle that is also used
   //after the top part of the structure
   public static void printNeedle(){
      for (int line = 1; line <= SIZE; line++){
         for (int spaces = 1; spaces <= SIZE*3; spaces++){
            System.out.print(" ");
         }
         System.out.println("||");
      }
   }
   
   //Prints the bar and combines the 2 methods topHalf and printBar to reduce redundancy
   public static void topHalfBar(){
      topHalf();
      printBar();
   }
   
   //Prints the top half of the Space Needle
   //Also used to print the identical base of the space needle
   public static void topHalf(){
      for (int line = 1; line <= SIZE; line++){
         for (int spaces = 1; spaces <= SIZE*3-line*3; spaces++){
            System.out.print(" ");
            
         }
         System.out.print("__/");
         for (int colons = 1; colons <= 3*line-3; colons++){
            System.out.print(":");
         }
         System.out.print("||");
         for (int colons = 1; colons <= 3*line-3; colons++){
            System.out.print(":");
         }
         System.out.println("\\__");
      }
   }
   
   //Prints the bottom half of the top structure of the Space Needle
   public static void bottomHalf(){
      for (int lines = 1; lines <= SIZE; lines++){
         for (int spaces = 1; spaces <= 2*lines-2; spaces++){
            System.out.print(" ");
         }
         System.out.print("\\_/");
         for (int vs = 1; vs <= SIZE*3-2*lines; vs++){
            System.out.print("\\/");
         }
         System.out.println("\\_/");
      }
   }
   
   //Prints the stem of the Space Needle
   public static void printStem(){
      for (int lines = 1; lines <= SIZE * SIZE; lines++){
         for(int spaces = 1; spaces <= 2 * SIZE + 1; spaces++){
            System.out.print(" ");
         }
         System.out.print("|");
         for (int percents = 1; percents <= SIZE - 2; percents++){
            System.out.print("%");
         }
         System.out.print("||");
         for (int percents = 1; percents <= SIZE - 2; percents++){
            System.out.print("%");
         }
         System.out.println("|");
      }
   }
   
   //Prints the "Bar" of the space needle found after the base and the top half
   public static void printBar(){
      System.out.print("|");
      for (int i = 1; i <= SIZE*6; i++){
         System.out.print("\"");
      }
      System.out.println("|");
   }
}