// Zareef Amyeen
// 2.15.2022
// CSE 142 Section BS
// TA: Michelle Jose Morris
// Take Home Assessment 6
//

import java.io.*;
import java.util.*;

public class MadLibs{
   public static void main(String[] args) throws FileNotFoundException{
      Scanner console = new Scanner(System.in);
      introductionMessage();
      boolean playing = true;
      while (playing){
         System.out.print("(C)reate mad-lib, (V)iew mad-lib, (Q)uit? ");
         String response = console.nextLine();
         if (response.equalsIgnoreCase("C")){
            createMadLib(console);
         } else if (response.equalsIgnoreCase("V")){
            viewMadLib(console);
         } else if (response.equalsIgnoreCase("Q")){
            playing = false;
         }
      }
   }
   
   /**
   * Prints the introduction message for madlibs
   */
   public static void introductionMessage(){
      System.out.println("Welcome to the game of Mad Libs.");
      System.out.println("I will ask you to provide various words");
      System.out.println("and phrases to fill in a story.");
      System.out.println("The result will be written to an output file.");
      System.out.println();
   }
   
   /**
   * Creates a madlib
   * @param console - Scanner that takes in input
   * @param rand - Random object that creates random numbers for the game
   * return number of guesses
   */
   public static void createMadLib(Scanner console) throws FileNotFoundException{
      File file = getFile(console);
      System.out.print("Output file name: ");
      PrintStream out = new PrintStream(new File(console.nextLine()));
      Scanner fileScan = new Scanner(file);
      while (fileScan.hasNextLine()){
         Scanner lineScan = new Scanner(fileScan.nextLine());
         while (lineScan.hasNext()){
            String token = lineScan.next();
            if (token.charAt(0) == '<' && token.charAt(token.length()-1) == '>'){
               token = token.substring(1,token.length()-1);
               token = token.replace('-',' ');
               String firstLetter = token.substring(0,1);
               if (firstLetter.equalsIgnoreCase("A") || firstLetter.equalsIgnoreCase("E") ||
               firstLetter.equalsIgnoreCase("I") || firstLetter.equalsIgnoreCase("O") || firstLetter.equalsIgnoreCase("U")){
                  System.out.print("Please type an " + token + ": ");
                  token = console.nextLine();
               } else {
                  System.out.print("Please type a " + token + ": ");
                  token = console.nextLine();
               }           
            }
            /*System.*/out.print(token + " ");
         }
         /*System.*/out.println();
      }
   }
   
   public static File getFile(Scanner console){
      System.out.print("Input file name: ");
      File file = new File(console.nextLine());
      while (!file.exists()){
         System.out.print("File not found. Try again: ");
         file = new File(console.nextLine());
      }
      return file;
   }
   
   public static void printFile(File file) throws FileNotFoundException{
      Scanner fileScanner = new Scanner(file);
      System.out.println();
      while (fileScanner.hasNextLine()){
         System.out.println(fileScanner.nextLine());
      }
      System.out.println();
   }
   
   /**
   * View a madlib from an input file and prints to console
   * @param console - Scanner that takes in input
   * @param rand - Random object that creates random numbers for the game
   * return number of guesses
   */
   public static void viewMadLib(Scanner console) throws FileNotFoundException{
      File file = getFile(console);
      printFile(file);
   }
}