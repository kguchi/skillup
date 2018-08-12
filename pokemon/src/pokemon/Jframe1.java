package pokemon;

import java.awt.*;
//import java.awt.FlowLayout;
import javax.swing.*;
import java.io.*;

public class Jframe1 extends JFrame {
//		String buttonName;
		
//		frame.getContentPane().add(button);
//		JLabel label = new JLabel("Hello World");
//		frame.getContentPane().setLayout(new FlowLayout());
//		frame.getContentPane().add(label);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Jframe1() {
		JFrame frame = new JFrame("pokemon");
		JButton button = new JButton("start");
//		JLabel aisatsu = new JLabel("Hello World");
		frame.getContentPane().add(button);
//		frame.getContentPane().add(aisatsu);
		frame.getContentPane().setLayout(new FlowLayout());
		frame.setSize(600, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		
		JPanel p = new JPanel();
		
		ImageIcon icon = new ImageIcon("/src/pokemon/image/pikachu.png");
		JLabel label = new JLabel(icon);
		p.add(label);
		frame.getContentPane().add(label);
//		getContentPane().add(p, BorderLayout.CENTER);
//		setBounds(100, 100, 500, 350);
		frame.setVisible(true);
		File file = new File("./src/pokemon/image/pikachu.png");
		String path = new File(".").getAbsoluteFile().getParent();
		System.out.println(file.exists());
		System.out.println(path + icon);
	}

	
	
//	public String getButton() {
//		return this.buttonName;
//	}
	
//	public void setButton(String buttonName) {
//		this.buttonName = button;
//	}
}
