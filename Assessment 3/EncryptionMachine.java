// Zareef Amyeen
// 1.20.2022
// CSE 142 Section BS
// TA: Michelle Jose Morris
// Take Home Assessment 3
// Program that encrypts a key and a collection of words inputted from the user

import java.util.*;

//Class that encrypts a key and a number of words
public class EncryptionMachine{
   public static final int SHIFT = 6;
   public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
   //Main method that has the table of contents/summary of the encryption machine
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);
      introductionMessage();
      keyEncryption(console);
      getInput(console);
   }
   
   /**
   * Prints the introductory message for the program
   */
   public static void introductionMessage(){
      System.out.println("Welcome to the CSE142 Encryption Machine!");
      System.out.println("The program lets you encrypt a message");
      System.out.println("with a key so your recipient can decrypt.");
      System.out.println();
      System.out.println("Encrypted messages use a shared keyword to decrypt.");
   }
   
   /**
   * Encrypts the key of the word
   * @param console - Scanner used for getting input
   */
   public static void keyEncryption(Scanner console){
      System.out.print("  Enter key: ");
      String key = console.next();
      wordEncrypt(key);
      System.out.println();
   }
   
   /**
   * Takes in input of the words and prints out the encrypted version
   * @param console - Scanner used for getting input
   */
   public static void getInput(Scanner console){
      System.out.print("How many words are in your message? ");
      int words = console.nextInt();
      for (int i = 1; i <= words; i++){
         System.out.print("  Next word: ");
         String word = console.next();
         wordEncrypt(word);
      }
      System.out.println();
      System.out.println("Message fully encrypted. Happy secret messaging!");
   }
   
   /**
   * Takes in a word or key to encrypt and prints out the encrypted version
   * @param word - word/key that will be encrypted
   */
   public static void wordEncrypt(String word){
      String encryptedword = "";
      for (int i = 0; i <= word.length()-1; i++){
         int shiftedIndex = (ALPHABET.indexOf(word.charAt(i)) + SHIFT) % ALPHABET.length();
         encryptedword += ALPHABET.charAt(shiftedIndex);
      }
      System.out.println("    \"" + word + "\" has been encrypted to: " + encryptedword);  
   }
}