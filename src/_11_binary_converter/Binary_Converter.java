package _11_binary_converter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Binary_Converter implements ActionListener{
	JTextField input = new JTextField(20);
	JButton button = new JButton("convert");


	public void start() {
		JFrame frame = new JFrame("Convert Binary");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JPanel display = new JPanel();
		button.addActionListener(this);
		display.add(input);
		display.add(button);
		frame.add(display);
		frame.pack();	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
		String input2 = input.getText();
		JOptionPane.showMessageDialog(null, convert(input2));
		}
	}
	
	
	
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}
	
	
}
