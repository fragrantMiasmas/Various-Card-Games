package card;

import java.util.ArrayList;
import java.util.Stack;

import game.Egyptian;
import game.Game;

public class Play {

	public static void main(String args[]) {

		Game eg = new Egyptian();
		Deck deck = eg.getGameDeck();
		ArrayList<Card> deck1= deck.createDeck();		
		deck.shuffle(deck1);
		
		
//		Stack<Card> stack = deck.cardStack(deck1, 13);
//		for(int i =0;i<stack.size();i++) {
//			
//			System.out.println(stack.get(i).getName());
//		}
				
	}
}
