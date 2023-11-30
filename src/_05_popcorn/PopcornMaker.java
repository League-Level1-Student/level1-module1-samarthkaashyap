package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		Microwave wave = new Microwave();
		String flavor = JOptionPane.showInputDialog("What flavor is your popcorn?");
		String time = JOptionPane.showInputDialog("How many minutes do you want to cook your popcorn?");
		int time_2 = Integer.parseInt(time); 
		
		Popcorn corn = new Popcorn(flavor);
		wave.putInMicrowave(corn);
		wave.setTime(time_2);
		wave.startMicrowave();
		corn.eat();
	}
	
}
