package _03_cat;

public class CatrRunner {
	public static void main(String[] args) {
		Cat cat = new Cat("tom");
		cat.meow();
		cat.printName();
		for (int i=0; i<=9; i++) {
			cat.kill();
		}
	}
}
