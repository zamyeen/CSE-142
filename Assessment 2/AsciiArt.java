// Zareef Amueen
// 1.18.2022
// CSE 142 Section BS
// TA: Michelle Jose Morris
// Take Home Assessment 2 Part A
// Prints a text art of my choice (I chose a gamecube controller)

//class Ascii Art contains the methods to print the gamecube controller
public class AsciiArt{
   //Table of contents of the program
   public static void main (String[] args){
      top();
      buttons();
      bottom();
   }
   
   //Prints the top 4 lines
   public static void top(){
      for (int spaces = 1; spaces <= 2; spaces++){
         System.out.print(" ");
      }
      System.out.print("-====-");
      for (int spaces = 1; spaces <= 4; spaces++){
         System.out.print(" ");
      }
      System.out.print("-==============-");
      for (int spaces = 1; spaces <= 4; spaces++){
         System.out.print(" ");
      }
      System.out.println("-====-");
      
      System.out.print(" =");
      for (int spaces = 1; spaces <= 6; spaces++){
         System.out.print(" ");
      }
      System.out.print("====");
      for (int spaces = 1; spaces <= 16; spaces++){
         System.out.print(" ");
      }
      System.out.print("====");
      for (int spaces = 1; spaces <= 6; spaces++){
         System.out.print(" ");
      }
      System.out.println("=");
      
      System.out.print("=");
      for (int spaces = 1; spaces <= 30; spaces++){
         System.out.print(" ");
      }
      System.out.print("__");
      for (int spaces = 1; spaces <= 6; spaces++){
         System.out.print(" ");
      }
      System.out.println("=");
   }
   
   //Prints lines 4-9 where the buttons on the controller are
   public static void buttons(){
      System.out.print("=");
      for (int spaces = 1; spaces <= 4; spaces++){
         System.out.print(" ");
      }
      System.out.print("_");
      for (int spaces = 1; spaces <= 24; spaces++){
         System.out.print(" ");
      }
      System.out.println("(__)  _  =");
      
      System.out.print("=   / \\");
      for (int spaces = 1; spaces <= 24; spaces++){
         System.out.print(" ");
      }
      System.out.println("___ ( ) =");
      
      System.out.print("=  (   )");
      for (int spaces = 1; spaces <= 22; spaces++){
         System.out.print(" ");
      }
      System.out.println("(   )(_) =");
      
      System.out.print("=   \\_/");
      for (int spaces = 1; spaces <= 23; spaces++){
         System.out.print(" ");
      }
      System.out.println("(___)    =");
      
      System.out.print("=");
      for (int spaces = 1; spaces <= 18; spaces++){
         System.out.print(" ");
      }
      System.out.print("()");
      for (int spaces = 1; spaces <= 18; spaces++){
         System.out.print(" ");
      }
      System.out.println("=");
      
      System.out.print("=");
      for (int spaces = 1; spaces <= 27; spaces++){
         System.out.print(" ");
      }
      System.out.print("()");
      for (int spaces = 1; spaces <= 9; spaces++){
         System.out.print(" ");
      }
      System.out.println("=");
   }
   
   //Prints the bottom of the controller
   public static void bottom(){
      System.out.print("=");
      for (int spaces = 1; spaces <= 13; spaces++){
         System.out.print(" ");
      }
      System.out.print("-==========-");
      for (int spaces = 1; spaces <= 13; spaces++){
         System.out.print(" ");
      }
      System.out.println("=");
      
      System.out.print("=");
      for (int spaces = 1; spaces <= 6; spaces++){
         System.out.print(" ");
      }
      handle();
      for (int spaces = 1; spaces <= 12; spaces++){
         System.out.print(" ");
      }
      handle();
      for (int spaces = 1; spaces <= 6; spaces++){
         System.out.print(" ");
      }
      System.out.println("=");
      
      handle();
      System.out.print(" =  #  =");
      for (int spaces = 1; spaces <= 10; spaces++){
         System.out.print(" ");
      }
      System.out.print("=  _  = ");
      handle();
      System.out.println();
      
      handle();
      System.out.print(" = ### =");
      for (int spaces = 1; spaces <= 10; spaces++){
         System.out.print(" ");
      }
      System.out.print("= (_) = ");
      handle();
      System.out.println();
      
      handle();
      System.out.print(" =  #  =");
      for (int spaces = 1; spaces <= 10; spaces++){
         System.out.print(" ");
      }
      handle();
      System.out.print(" ");
      handle();
      System.out.println();
      
      handle();
      System.out.print("  =====");
      for (int spaces = 1; spaces <= 12; spaces++){
         System.out.print(" ");
      }
      System.out.print("=====  ");
      handle();
      System.out.println();
      
      handle();
      for (int spaces = 1; spaces <= 26; spaces++){
         System.out.print(" ");
      }
      handle();
      System.out.println();
      
      System.out.print(" =====");
      for (int spaces = 1; spaces <= 28; spaces++){
         System.out.print(" ");
      }
      System.out.println("=====");
   }
   
   //Function that prints out the handles of a controller
   public static void handle(){
      System.out.print("=");
      for (int spaces = 1; spaces <= 5; spaces++){
         System.out.print(" ");
      }
      System.out.print("=");
   }
}

