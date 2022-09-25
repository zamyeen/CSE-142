import java.util.*;

public class DecryptionMachine{
   public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);
      
      System.out.print("What is your key: ");
      String key = console.nextLine();
      System.out.println(key.length());
     
      System.out.print("What is your encrypted key: ");
      String encryptedKey = console.next();
      
      int SHIFT  = decryptKey(key,encryptedKey);
      System.out.println("Shift is: " + SHIFT);
      
      getInput(console, SHIFT);
   }
   
   public static int decryptKey(String key, String encryptedKey){
      //System.out.println(ALPHABET.indexOf(encryptedKey.charAt(0)));
      //System.out.println(ALPHABET.indexOf(key.charAt(0)));
      return (ALPHABET.indexOf(encryptedKey.charAt(0)) - ALPHABET.indexOf(key.charAt(0)) + ALPHABET.length()) % ALPHABET.length();
   }
   
   public static void getInput(Scanner console, int SHIFT){
      System.out.print("How many words are in your message? ");
      int words = console.nextInt();
      String decryptedMessage = "";
      for (int i = 1; i <= words; i++){
         System.out.print("  Next word: ");
         String word = console.next();
         decryptedMessage += decryptWord(word, SHIFT);
         decryptedMessage += " ";
      }
      System.out.println(decryptedMessage);
      //System.out.println("Message fully encrypted. Happy secret messaging!");
   }

   public static String decryptWord(String word, int SHIFT){
      String decryptedWord = "";
      for (int i = 0; i <= word.length()-1; i++){
          decryptedWord += ALPHABET.charAt((ALPHABET.indexOf(word.charAt(i)) - SHIFT + ALPHABET.length())%ALPHABET.length());
      }
      return decryptedWord;
   }
}