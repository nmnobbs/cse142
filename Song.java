// Nicole Nobbay
// 10/15/2021
// CSE 142
// TA: Thien Tran
// Resubmission: Take-home Assessment #1
// Song: "There Was an Old Woman Who Swallowed a Fly"
// Prints out seven verses of the song called
// "There Was an Old Woman Who Swallowed a Fly."
// The sixth verse of the song is unique in that I created the
// custom lines to match the pattern made by the first five
// verses of the song.

public class Song {
   public static void main(String[] args) {
      firstLines();
       
      secondVerse();
 
      thirdVerse();
      
      fourthVerse();
      
      fifthVerse();
      
      sixthVerse();
      
      lastVerse();
   }
   
   // Prints out the ending lines of each verse.
   public static void firstVerse() {
      System.out.println("I don't know why she swallowed that fly,");
      System.out.println("Perhaps she'll die.");
      System.out.println();
   }
   
   // Prints out the first lines of the song.
   public static void firstLines() {
      System.out.println("There was an old woman who swallowed a fly.");
      firstVerse();
   }
   
   // Prints out the second verse of the song.
   public static void secondVerse() {
      System.out.println("There was an old woman who swallowed a spider,");
      System.out.println("That wriggled and iggled and jiggled inside her.");
      spiderFly();
   }
   
   // Prints out the line connecting the first and second verse.
   public static void spiderFly() {
      System.out.println("She swallowed the spider to catch the fly,");
      firstVerse();
   }
   
   // Prints out the line connecting the second and third verse.
   public static void birdSpider() {
      System.out.println("She swallowed the bird to catch the spider,");
      spiderFly();
   }
  
   // Prints out the third verse of the song.
   public static void thirdVerse() {
      System.out.println("There was an old woman who swallowed a bird,");
      System.out.println("How absurd to swallow a bird.");
      birdSpider();
   }
   
   // Prints out the line connecting the third and fourth verse.
   public static void catBird() {
      System.out.println("She swallowed the cat to catch the bird,");
      birdSpider();
   }
   
   // Prints out the fourth verse of the song.
   public static void fourthVerse() {
      System.out.println("There was an old woman who swallowed a cat,");
      System.out.println("Imagine that to swallow a cat.");
      catBird();
   }
   
   // Prints out the line connecting the fourth and fifth verse.
   public static void dogCat() {
      System.out.println("She swallowed the dog to catch the cat,");
      catBird();
   }
   
   // Prints out the fifth verse of the song.
   public static void fifthVerse() {
      System.out.println("There was an old woman who swallowed a dog,");
      System.out.println("What a hog to swallow a dog.");
      dogCat();
   }
   
   // Prints out the line connecting the fifth and sixth verse.
   public static void pigDog() {
      System.out.println("She swallowed the pig to catch the dog,");
      dogCat();
   }
   
   // Prints out my unique sixth verse of the song.
   public static void sixthVerse() {
      System.out.println("There was an old woman who swallowed a pig,");
      System.out.println("Oh how big to swallow a pig.");
      pigDog();
   }
  
   // Prints out the last verse of the song.
   public static void lastVerse() {
      System.out.println("There was an old woman who swallowed a horse,");
      System.out.println("She died of course.");
   }
}