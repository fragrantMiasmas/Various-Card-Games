package game;

import java.util.ArrayList;

import card.Card;
import card.Deck;
import card.Player;

public class Game {

	private ArrayList<Player> cardPlayers = new ArrayList<Player>();
	private Deck gameDeck = new Deck();
	
	public void populate(int amountofplayers){
		for(int i=0;i<amountofplayers;i++) {
			Player newPlayer = new Player();
			newPlayer.setNumber(i+1);
			cardPlayers.add(newPlayer);
		}
	}
	public void addPlayer(Player p) {
		cardPlayers.add(p);
	}
	public void deal(ArrayList<Card> deck, 	ArrayList<Player> cardPlayers) {
		
		for(int i=0;i<deck.size();i++) {
			Card next = deck.get(i);
			//each player gets a card
			int playernum = (i+1)%cardPlayers.size();	
			cardPlayers.get(playernum).getHand().add(next);
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
