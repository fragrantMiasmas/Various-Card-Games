package card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Deck {
	
	ArrayList<Card> myDeck;
	
	
	public Suit generateSuit(int index) {
		if(index>=0&& index<13) {
			return Suit.SPADES;
		}
		else if(index>=13&& index<26) {
			return Suit.HEARTS;
		}
		else if(index>=26&& index<39) {
			return Suit.DIAMONDS;
		}
		else if(index>=39&& index<52) {
			return Suit.CLUBS;
		}
		else
			return Suit.CLUBS;
	}
	public  ArrayList<Card> createDeck() {
		
		 myDeck = new ArrayList<>();
		
		for(int i=0;i<52; i++) {
			
			Card newCard = new Card();
			newCard.setSuit(generateSuit(i));
			newCard.setValue((i%13)+1);
			newCard.setName(newCard.getValue() + " of " + newCard.getSuit()); //jqk later
			//System.out.println(newCard.getName());
			myDeck.add(newCard); 
		}
		return myDeck;
	}
	
	public void shuffle(ArrayList deck) {
		Collections.shuffle(deck);
	}
	
	public Stack cardStack(ArrayList<Card> deck, int stackSize) {
		Stack<Card> newStack = new Stack<Card>();
		
		for(int i =0;i<stackSize;i++) {
			Card next = deck.get(i);
			newStack.push(next);
		}
		return newStack;
	}
	public Card drawCard(Stack<Card> cardstack) {
		Card nextCard= cardstack.pop(); 
		return nextCard;
	}
}
