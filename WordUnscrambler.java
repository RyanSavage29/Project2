import java.util.Scanner;
import java.util.Random;
import java.io.FileInputStream;
import java.io.IOException;

public class WordUnscrambler
{
	public static void  main(String args[]) throws IOException
	{
		FileInputStream word = new FileInputStream("words.txt");
		Scanner scnr = new Scanner(System.in);
		Scanner textScnr = new Scanner(word);
		Random rand = new Random();
		
		String answer;
		String scrambled;
		int index1;
		int index2;
		
		System.out.println("Enter 1 to swap letters.");
		System.out.println("Enter 2 to solve.");
		System.out.println("Enter 3 to quit.");
		userWord = scnr.next();
		
		System.out.println("Enter the indexes seperated by spaces");
		userWord = scnr.next;
		
		System.out.println("Congratulations! You unscrambled the word project in " + " steps.");
	}
}