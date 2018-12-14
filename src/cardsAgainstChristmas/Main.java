package cardsAgainstChristmas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner playerInput = new Scanner(System.in);
		
		Cards newDeck = new Cards();
		
		System.out.println("pick a number from 0 - 5");
		
		int first = playerInput.nextInt();
		
		System.out.println("pick a number from 0 - 5");
		
		
		int second = playerInput.nextInt();
		
		
		System.out.println("pick a number from 0 - 5");
		
		int third = playerInput.nextInt();
		
		
		System.out.println(newDeck.cardLists(first, second, third));
		
		
		
		
		
		
	}

}
