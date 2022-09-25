// Zareef Amyeen
// 2.2.2022
// CSE 142 Section BS
// TA: Michelle Jose Morris
// Take Home Assessment 5
// Program that plays the guessing game with you
// Program will choose a random number and will prompt you to guess the random number
// Will tell you whether your guess was above or below the guess until you guess the number
// After the game is over will tell you the number of games played, total guesses, average guesses
// and best game

import java.util.*;

//Contains the program Guessing Game
public class GuessingGame{
   public static final int MAX_VALUE = 100;
   //Contains table of contents of the program/structure
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);
      Random rand = new Random();
      customHaiku();
      boolean playAgain = true;
      int numGuesses;
      int leastGuesses = 1000000;
      int totalGuesses = 0;
      int totalGames = 0;
      while (playAgain){
         //int randomNumber = rand.nextInt(MAX_VALUE) + 1;
         numGuesses = playSingleGame(console, rand);
         totalGames++;
         leastGuesses = Math.min(leastGuesses, numGuesses);
         totalGuesses += numGuesses;
         System.out.print("Do you want to play again? ");
         String response = console.next().toLowerCase();
         System.out.println();
         if (response.charAt(0) != 'y'){
            playAgain = false;
         }
      }
      printResults(totalGames, totalGuesses, leastGuesses);
   }
   
   /**
   * Prints the custom haiku written by me
   */
   public static void customHaiku(){
      System.out.println("Think you can guess me?");
      System.out.println("You thought it would be so easy.");
      System.out.println("Try try again.");
      System.out.println();
   }
   
   /**
   * prints the overall results of the game
   * @param totalGames - total games played
   * @param totalGuesses - total guesses (used to calculate average)
   * @param bestGame - number of guesses for best game
   */
   public static void printResults(int totalGames, int totalGuesses, int bestGame){
      System.out.println("Overall results:");
      System.out.println("Total games   = " + totalGames);
      System.out.println("Total guesses = " + totalGuesses);
      System.out.println("Guesses/game  = " + round (totalGuesses * 1.0 / totalGames));
      System.out.println("Best game     = " + bestGame);
   }
   
   /**
   * Plays a single game where player tries to guess a random number
   * @param console - Scanner that takes in input
   * @param rand - Random object that creates random numbers for the game
   * return number of guesses
   */
   public static int playSingleGame(Scanner console, Random rand){
      int randomNumber = rand.nextInt(MAX_VALUE) + 1;
      System.out.println("I'm thinking of a number between 1 and " + MAX_VALUE + "...");
      //System.out.println("Random Number is: " + randomNumber);
      System.out.print("Your guess? ");
      int guess = console.nextInt();
      int numOfGuesses = 1;
      while (guess != randomNumber){
         if (randomNumber > guess){
            System.out.println("It's higher.");
         } else {
            System.out.println("It's lower.");
         }
         System.out.print("Your guess? ");
         guess = console.nextInt();
         numOfGuesses++;
      }
      if (numOfGuesses == 1){
         System.out.println("You got it right in " + numOfGuesses + " guess!");
         return numOfGuesses;
      }
      System.out.println("You got it right in " + numOfGuesses + " guesses!");
      return numOfGuesses;
   }
   
   /**
   * Rounds a given number to the hundredth place
   * @param value - the number to be rounded
   * @return the rounded double
   */
   public static double round(double value){
      return Math.round(value * 10.0) / 10.0;
   }
}