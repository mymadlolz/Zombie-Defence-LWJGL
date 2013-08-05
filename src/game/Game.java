package game;

import javax.swing.JFrame;


public class Game {
	public static void main(String[] args){
		
	}
	
	public Game(){
		JFrame f = new JFrame();
		f.setTitle("A DarkPixel Game");
		//f.add(new board());
		f.setSize(500, 400);
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
