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
		
		boolean run = true;
		boolean end = false;
		String[] words = new String[];
		String answer;
		String scrambled;
		final int NUMBER_OF_WORDS = 15;
		int decision;
		int index1;
		int index2;
		char temp;
		
		for (int i = 0; i < NUMBER_OF_WORDS; ++i){
			words[i] = textScan.next();
		}
		
		while (run)
		{
			answer = words[rand.nextInt(Number_OF_WORDS)];
			
			char[] charScramble = new char[answer.length()];
			charScramble = answer.toCharArray();
			for (int i = 0; i < (charScramble.length - 1); i++)
			{
				int j = rand.nextInt(charScramble.length - 1);
				temp = charScramble[i];
				charScramble[i] = charScramble[j]; 
				charScramble[j] = temp;
			}
			
			scrambled = String.valueOf*charScramble);
			int counter = 0;
		}
		
		System.out.println("Congratulations! You unscrambled the word project in " + " steps.");\
		word.close();
	}
}