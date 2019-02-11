package objects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import gameState.GameState;

public class Block extends Rectangle {
	
	public static final int blockSize = 64;
	private int id;
	public Block(int x, int y , int id) {
		setBounds(x,y, blockSize, blockSize);
		this.id = id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	public int getID() {
		return this.id;
	}
	
	public void tick() {
	}
	
	public void draw(Graphics g ) {
		if (id == 1) g.setColor(Color.RED);g.setColor(Color.BLACK);
		if (id == 2) g.setColor(Color.RED); 
		if (id == 3) g.setColor(Color.GREEN);
		
		if( id != 0) {
		g.fillRect(x - (int)GameState.xOffset, y - (int)GameState.yOffset, width, height);
		}
		
	}
}
