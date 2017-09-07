package stupid.controller;

import java.util.Scanner;

/**
 * 
 * @author ksin8488
 *
 */

public class StupidController
{
	public void start()
	{
		System.out.println("I will program well. ");
		
		testScanner();
	}
	
	private void testScanner()
	{
		Scanner firstScanner; 
		firstScanner = new Scanner(System.in);
		System.out.println("What is your favorite food?");
		String answer = firstScanner.nextLine();
		System.out.println("Oh cool, you like " + answer);
	}
	
}
