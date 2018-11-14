package card;

import java.util.ArrayList;
import java.util.Stack;

public class Player {

	String name;
	int number;  //by index
	int rank;
	ArrayList<Card> hand = new ArrayList<>();
	Stack<Card> pile = new Stack();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}

	public Stack<Card> getPile() {
		return pile;
	}

	public void setPile(Stack<Card> pile) {
		this.pile = pile;
	}
}
