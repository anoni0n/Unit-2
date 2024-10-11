package word_games;
import java.util.Scanner;

public class WordGamesTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String userWord = input.nextLine();
        WordGames newGame = new WordGames(userWord);
        //prints out the scrambled word
        System.out.println(newGame.scramble());

        // Add random word at index
        // Print out the word
        System.out.println("\nEnter an integer: ");
        int idx = input.nextInt();
        input.nextLine();  // skip over the newline
        System.out.println("Enter a word: ");
        String wordInsert = input.nextLine();
        System.out.println(newGame.bananaSplit(idx,wordInsert));

        // Ask for a character (store as a String)
        // Ask for random word
        // Add random word at character
        // Print out the word
        System.out.println("\nEnter a character: ");
        String insertLetter = input.nextLine();
        System.out.println("Enter a word: ");
        String wordInsert2 = input.nextLine();
        System.out.println(newGame.bananaSplit(insertLetter,wordInsert2));

        //prints out the word surrounded by brackets
        System.out.printf("%n%s", newGame);




    }
}
