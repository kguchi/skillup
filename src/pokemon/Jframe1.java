package pokemon;

import java.awt.*;
//import java.awt.FlowLayout;
import javax.swing.*;

public class Jframe1 {
//		String buttonName;
		
//		frame.getContentPane().add(button);
//		JLabel label = new JLabel("Hello World");
//		frame.getContentPane().setLayout(new FlowLayout());
//		frame.getContentPane().add(label);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Jframe1() {
		JFrame frame = new JFrame("pokemon");
		JButton button = new JButton("start");
//		JLabel label = new JLabel("Hello World");
		frame.getContentPane().add(button);
		frame.getContentPane().setLayout(new FlowLayout());
		frame.setSize(600, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	}
	
	
//	public String getButton() {
//		return this.buttonName;
//	}
	
//	public void setButton(String buttonName) {
//		this.buttonName = button;
//	}
}
