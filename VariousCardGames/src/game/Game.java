package game;

import java.util.ArrayList;

import card.Card;
import card.Deck;
import card.Player;

public class Game {

	ArrayList<Player> cardPlayers;
	Deck gameDeck = new Deck();
	
	public void addPlayer() {
		
	}
	public void deal(ArrayList<Card> deck, Player[] cardPlayers) {
		
		for(int i=0;i<deck.size();i++) {
			Card next = deck.get(i);
			
			//each player gets a card
			for(int j=0;j<cardPlayers.length;j++) {
				cardPlayers[j].getHand().add(next);
			}
		}
	}

	public boolean isFinished(){ //must override based on game rules
		return false;
	}
	public ArrayList<Player> getCardPlayers() {
		return cardPlayers;
	}

	public void setCardPlayers(ArrayList<Player> cardPlayers) {
		this.cardPlayers = cardPlayers;
	}

	public Deck getGameDeck() {
		return gameDeck;
	}

	public void setGameDeck(Deck gameDeck) {
		this.gameDeck = gameDeck;
	}
}
