package _07_duck;

public class Snake {
	int numberOfChildren;
	String typeOfSnake;
	void hiss() {
		System.out.println("The snake hisses at its "+ numberOfChildren + " children.");
	}
	void slither() {
		System.out.println("The snake slithers like a " + typeOfSnake);
		
	}
	Snake(int numberOfChildren, String typeOfSnake){
		this.numberOfChildren = numberOfChildren;
		this.typeOfSnake = typeOfSnake;
	}
	
	
	
	
	
	
	
}
