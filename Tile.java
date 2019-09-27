
public class Tile {
	String letter;
	int value;
	
	Tile(){
		
	}

	public Tile(String letter, int value) {
		this.letter = letter;
		this.value = value;
	}

	public String getLetter() {
		return letter;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	void printTile(Tile obj1) {
		System.out.println("Letter: " + getLetter());
		System.out.println("Value: " + getValue());
	}
}
