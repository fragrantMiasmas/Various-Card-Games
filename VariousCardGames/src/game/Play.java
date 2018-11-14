package game;

import java.util.ArrayList;
import java.util.Stack;

import card.Card;
import card.Deck;
import card.Player;

public class Play {

	public static void main(String args[]) {

		Game eg = new Egyptian();
		
		//shuffle deck
		Deck deck = eg.getGameDeck();
		ArrayList<Card> deck1= deck.createDeck();		
		deck.shuffle(deck1);
		
		//create players
		eg.populate(4);
		ArrayList<Player> cp = eg.getCardPlayers();
		eg.deal(deck1, cp);
		
		for(int i=0;i<cp.size();i++) {
			Player curr = cp.get(i);
			System.out.println("Player number " + curr.getNumber() + " has " + curr.getHand().size() + " cards");
		}
		
//		Stack<Card> stack = deck.cardStack(deck1, 13);
//		for(int i =0;i<stack.size();i++) {
//			
//			System.out.println(stack.get(i).getName());
//		}
				
	}
}
