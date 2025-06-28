package animal;

import java.awt.Color;
import java.awt.Graphics;

import cell.Cell;
import field.Location;

public class Rabbit extends Animal implements Cell {
	public Rabbit() {
		super(10, 2);
	}

	@Override
	public void draw(Graphics g, int x, int y, int size) {
		int alpha = (int)((1-getAgePercent())*255);
		g.setColor(new Color(255, 0, 0, alpha));
		g.fillRect(x, y, size, size);
	}

	@Override
	public Animal breed() { //跟Fox是一样的
		Animal ret = null;
		if ( isBreedable() && Math.random() < 0.12 ) {
			ret = new Rabbit();
		}
		return ret;
	}
	
	@Override
	public String toString() {
		return "Rabbit:"+super.toString();
	}
	//而对于Rabbit来说，它就没有feed函数，所以它也什么都不吃。
}
