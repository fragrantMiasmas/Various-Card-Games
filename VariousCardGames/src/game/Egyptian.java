package game;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Timer;

import card.Card;
import card.Player;

public class Egyptian extends Game{

	//egyptian rat screw
	Stack<Card> pool= new Stack<Card>(); //every player contributes to this stack
	
	public void enterCard(Player p1){
		Stack<Card> pile = p1.getPile();
		Card next = pile.pop();
		pool.push(next);		
	}
	public void slap() {
		System.out.println("Slapped!");
	}
	public ArrayList<Player> eliminatePlayer(Player player) {
		if(player.getPile().isEmpty()) {
			super.getCardPlayers().remove(player.getNumber());
		}
		return super.getCardPlayers();
	}
	public boolean isDouble() {
		int card1 = pool.get(pool.size()).getValue();
		int card2 = pool.get(pool.size()-1).getValue();
		
		if(card1==card2) {
			return true;
		}
		else
			return false;
	}
	
	public boolean isSandwich(){
		int card1 = pool.get(pool.size()).getValue();
		int card2 = pool.get(pool.size()-2).getValue();
		
		if(card1==card2) {
			return true;
		}
		else
			return false;
	}
	public boolean isFace(){
		Card top = pool.peek();
		if(top.getValue()>10) {
			return true;
		}
		else
			return false;
	}
	public boolean isEnough(){ 
		
		//example: must put down 3 cards after king unless you put own another face card
		return false;
	}
	public int playersLeft() { //must account for slapping back in later
		return super.getCardPlayers().size();
	}
	public boolean isFinished(){ //overrides superclass
		if(playersLeft()==1) { //if only one player has cards left
			return true;
		}
		else
			return false;
	}
}
