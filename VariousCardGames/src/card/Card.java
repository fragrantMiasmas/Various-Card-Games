package card;

public class Card {
	
	private int value;
	private Suit suit;
	private String name;

	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Suit getSuit() {
		return suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
