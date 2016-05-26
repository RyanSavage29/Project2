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
			
			scrambled = String.valueOf(charScramble);
			int turnCounter = 0;
			
			while (run && !(scrambled.equals(answer)))
			{
				System.out.println("------------");
				for (int i = 0; i < scrambled.length(); i++)
				{
					System.out.print(i);
				}
				System.out.println();
				System.out.println(scrambled + "\n------------\n");
				System.out.println("Enter 1 to swap letters. \nEnter 2 to recieve the answer. \nEnter 3 to quit.");
				decision = scnr.nextInt();
				switch (decision)
				{
					case 1:
					turnCounter++;
					System.out.println("Enter the first index value. (Integer value)");
					index1 = scnr.nextInt();
					while(!(0 <= index1) || !(index1 < answer.length()))
					{
						System.out.println("Nope. Try again.");
						index1 = scnr.nextInt();
					}
					System.out.println("Enter the second index value. (Integer value)");
					index2 = scnr.nextInt();
					while(!(0 <= index2) || !(index2 < answer.length()))
					{
						System.out.println("Nope. Try again.");
						index2 = scnr.nextInt();
					}
					charScramble = scrambled.toCharArray();
					temp = charScramble[index1];
					charScramble[index1] = charScramble[index2];
					charScramble[index2] = temp;
					scrambled = String.valueOf(charScramble);
					break;
					case 2:
					System.out.println("You chose to give up. Nobody is happy about this. The answer was: " + answer);
					scrambled = answer;
					end = true;
					break;
					case 3:
					System.out.println("Now quitting.");
					run = false;
					break;
					default:
					System.out.println("Invalid response. 1 to swap. 2 to give up. 3 to quit.");
					break;
				}
			}
			if (scrambled.equals(answer))
			{
				if (!end)
				{
					System.out.println("Congratulations. The answer was " + answer + ". It took you " + turnCounter + " turns to solve. Try another one?");
				}
				else
				{
				System.out.println("You gave up after " + turnCounter + " turns. Good for you. :^)");
				System.out.println("1 to go again. 2 to quit.");
				decision = scnr.nextInt();
				switch (decision)
					{
						case 1:
						end = false;
						break;
						case 2:
						System.out.println("Now quitting.");
						run = false;
						break;
						default:
						System.out.println("Assuming unwillingness to comply as eagerness to play. Starting new game.");
						break;
					}
				}
			}
		}
		word.close();
	}
}