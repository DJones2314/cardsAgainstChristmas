package cardsAgainstChristmas;

import java.util.ArrayList;
import java.util.List;

public class Cards extends Main{

	public String cardLists (int first, int second, int third) {
		
		ArrayList<String> people = new ArrayList<String>();
		people.add("Santa Claus");
		people.add("Mrs Claus");
		people.add("Elf");
		people.add("Rudolph");
		people.add("Naughty Elf");
		people.add("Matt");
		
		
		ArrayList<String> action = new ArrayList<String>();
		action.add("jumping");
		action.add("sexting");
		action.add("eating");
		action.add("throwing");
		action.add("fighting");
		action.add("licking");
		
		ArrayList<String> context = new ArrayList<String>();
		context.add("Nigel the penguin");
		context.add("your mumma");
		context.add("Dale");
		context.add("Gareth");
		context.add("Mr Tiddles");
		context.add("Santa's sack");
		
		
		return people.get(first) + " " + action.get(second) + " " + context.get(third) + ".";
	}
	
	
	
}
