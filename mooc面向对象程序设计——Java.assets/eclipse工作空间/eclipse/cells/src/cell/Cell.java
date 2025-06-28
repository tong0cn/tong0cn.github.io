package cell;

import java.awt.Graphics;
 
public class Cell {
	private boolean alive = false; //有一个alive的变量，表明自己是不是活着的。
	
	public void die() { alive = false; } //die -> alive置为false。
	public void reborn() { alive = true; } //reborn -> alive置为true。
	public boolean isAlive() { return alive; }
	
	public void draw(Graphics g, int x, int y, int size) {
		g.drawRect(x, y, size, size); //先画个方框
		if ( alive ) {	//如果是活着的
			g.fillRect(x, y, size, size); //这个方框是要填起来的。
		}
	}
}
