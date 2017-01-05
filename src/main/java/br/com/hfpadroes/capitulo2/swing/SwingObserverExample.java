package br.com.hfpadroes.capitulo2.swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {

	private JFrame frame;
	
	public static void main(String[] args) {
		
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}

	public void go(){
		frame = new JFrame();
		
		JButton button = new JButton("O que eu devo fazer?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		
		frame.getContentPane().add(BorderLayout.CENTER, button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
