// Zareef Amyeen
// 2.24.2022
// CSE 142 Section BS
// TA: Michelle Jose Morris
// Take Home Assessment 7
// Reads in a file containing a person and their responses to the Keirsey's temperament test
// These responses are then converted to a personality type (of each dimension) which are outputed to a file

import java.io.*;
import java.util.*;

public class Personality {
   public static final int DIMENSIONS = 4;
   public static void main(String[] args) throws FileNotFoundException{
      Scanner console = new Scanner(System.in);
      introductionMessage();
      
      System.out.print("input file name? ");
      Scanner fileScan = new Scanner(new File(console.nextLine()));
      
      System.out.print("output file name? ");
      PrintStream out = new PrintStream(new File(console.nextLine()));
      
      while (fileScan.hasNextLine()){
         String name = fileScan.nextLine();
         String response = fileScan.nextLine();
         int[] aCounts = new int[DIMENSIONS];
         int[] bCounts = new int[DIMENSIONS];
         getABCount(aCounts,bCounts,response);
         /*for (int i = 0; i < response.length(); i++){
            System.out.print(response.charAt(i));
            if (i % 7 == 6){
               System.out.println();
            }
         }*/
         int[] bPercentage = new int[DIMENSIONS];
         getBPercentage(aCounts,bCounts,bPercentage);
         String personality = getPersonalityType(bPercentage);
         //System.out.println(Arrays.toString(aCounts));
         //System.out.println(Arrays.toString(bCounts));
         //System.out.println(Arrays.toString(bPercentage));
         //System.out.println(personality);
         /*System.*/out.println(name + ": " + Arrays.toString(bPercentage) + " = " + personality);
      }
   }
   
   /**
   * Prints the introduction message for Personality program
   */
   public static void introductionMessage(){
      System.out.println("This program processes a file of answers to the");
      System.out.println("Keirsey Temperament Sorter. It converts the");
      System.out.println("various A and B answers for each person into");
      System.out.println("a sequence of B-percentages and then into a");
      System.out.println("four-letter personality type.");
      System.out.println();
   }
   
   /**
   * Gets count of a and b counts for each personality dimension and stores in corresponding arrays
   * @param aCounts - array of size dimension, that contains counts of A responses for each dimension of personality ("returned" by pass by reference)
   * @param bCounts - array of size dimension, that contains counts of B responses for each dimension of personality ("returned" by pass by reference)
   * @param response - string of responses for the 70 questions that are either A, B, or -
   */
   public static void getABCount(int[] aCounts, int[] bCounts, String response){
      response = response.toLowerCase();
      for (int i = 0; i < response.length(); i++){
         char singleResponse = response.charAt(i);
         if (singleResponse == 'a'){
            aCounts[(i%7+1)/2]++;
         } else if (singleResponse == 'b'){
            bCounts[(i%7+1)/2]++;
         }      
      }
   }
   
   /**
   * Converts the array of aCounts and bCounts into an array of B percentages (which is not returned
   * but by pass by reference is stored)
   * @param aCounts - array of size dimension, that contains counts of A responses for each dimension of personality
   * @param bCounts - array of size dimension, that contains counts of B responses for each dimension of personality
   */
   public static void getBPercentage(int[] aCounts, int[] bCounts, int[] bPercentage){
      for (int i = 0; i < aCounts.length; i++){
         bPercentage[i] = (int)Math.round(100.0 * bCounts[i] / (bCounts[i] + aCounts[i]));
      }
   }
   
   /**
   * Converts the array of B percentages into the 4 letter personality
   * @param bPercentage - array of size dimension, that contains percentage of B responses for each dimension
   * @return string of the personality type
   */
   public static String getPersonalityType(int[] bPercentage){
      String personality = "";
      String aAnswers = "ESTJ";
      String bAnswers = "INFP";
      for (int i = 0; i < bPercentage.length; i++){
         if (bPercentage[i] < 50){
            personality += aAnswers.charAt(i);
         } else if (bPercentage[i] == 50){
            personality += "X";
         } else {
            personality += bAnswers.charAt(i);
         }
      }
      return personality;
   }
}