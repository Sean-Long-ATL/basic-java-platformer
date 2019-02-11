package main;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Game {
	public static void main(String[] argss) {
		JFrame frame = new JFrame("Platformer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLayout(new BorderLayout());
		frame.add(BorderLayout.CENTER, new GamePanel());	
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}

