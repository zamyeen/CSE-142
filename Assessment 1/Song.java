//Zareef Amyeen
//1/6/2021
//CSE142 Section BS
//TA: Michelle Jose Morris
//Take Home Assessment #1
//
//This program will print the song "There Was an Old Woman Who Swallowed a Fly" with a 
//custom verse (written by me)

public class Song{
   public static void main (String[] args){
      flyVerse();
      spiderVerse();
      birdVerse();
      catVerse();
      dogVerse();
      snakeVerse();
      horseVerse();
   }
   
   //Method prints the verse about the Fly
   public static void flyVerse(){
      System.out.println("There was an old woman who swallowed a fly.");
      lastLine();
      System.out.println();
   }
   
   //Method prints the verse about the Spider
   public static void spiderVerse(){
      System.out.println("There was an old woman who swallowed a spider,");
      System.out.println("That wriggled and iggled and jiggled inside her.");
      swallowedSpider();
   }
   
   //Method that reduces the redundancy of the line "she swallowed the spider"
   public static void swallowedSpider(){
      System.out.println("She swallowed the spider to catch the fly,");
      lastLine();
      System.out.println();
   }
   
   //Method prints the verse about the Bird
   public static void birdVerse(){
      System.out.println("There was an old woman who swallowed a bird,");
      System.out.println("How absurd to swallow a bird.");
      swallowedBird();
   }
   
   //Method prints the "she swallowed the bird" line and the following redundant lines
   public static void swallowedBird(){
      System.out.println("She swallowed the bird to catch the spider,");
      swallowedSpider();
   }
   //Method prints the verse about the Cat
   public static void catVerse(){
      System.out.println("There was an old woman who swallowed a cat,");
      System.out.println("Imagine that to swallow a cat.");
      swallowedCat();
   }
   
   //Method that prints the "she swallowed the cat" line and the following redundant verses
   public static void swallowedCat(){
      System.out.println("She swallowed the cat to catch the bird,");
      swallowedBird();
   }
   
   //Method prints the verse about the Dog
   public static void dogVerse(){
      System.out.println("There was an old woman who swallowed a dog,");
      System.out.println("What a hog to swallow a dog.");
      swallowedDog();
   }
   
   //Method that prints the "she swallowed the dog" and following redundant verses
   public static void swallowedDog(){
      System.out.println("She swallowed the dog to catch the cat,");
      swallowedCat();
   }
   
   //Method prints the verse about the Snake (my custom verse)
   public static void snakeVerse(){
      System.out.println("There was an old woman who swallowed a snake,");
      System.out.println("What a mistake to swallow a snake.");
      swallowedSnake();
   }
   
   //Method that prints the "she swallowed the snake" and following redundant verses
   public static void swallowedSnake(){
      System.out.println("She swallowed the snake to catch the dog.");
      swallowedDog();
   }
   //This method prints the last verse about the Horse
   public static void horseVerse(){
      System.out.println("There was an old woman who swallowed a horse,");
      System.out.println("She died of course.");
   }
   
   //This method prints the last line of every verse
   public static void lastLine(){
      System.out.println("I don't know why she swallowed that fly,");
      System.out.println("Perhaps she'll die.");
   }
}