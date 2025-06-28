package animal;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import cell.Cell;

//下一行说：Fox这个类是Animal的子类、同时它也实现了Cell。
//即：Fox是一种Animal，但是因为它实现了Cell，因此Fox可以被放到Field里头去。
public class Fox extends Animal implements Cell {
	public Fox() {
		super(20, 4);
	}
	
	@Override
	public void draw(Graphics g, int x, int y, int size) {
		int alpha = (int)((1-getAgePercent())*225);
		g.setColor(new Color(0, 0, 0, alpha));//(int)((20-getAge())/20.0*225)
		g.fillRect(x, y, size, size);
	}

	@Override
	public Animal breed() {
		Animal ret = null;
		//如果isBreedable（因为还有一个年龄问题，在Animal中的这个函数：
		//如果当前的年龄大于等于breedableAge(可以生baby的年龄)，那么就是可以生baby的。）
		if ( isBreedable() && Math.random() < 0.05 ) { //如果现在是可以生的并且符合一定的概率。
			ret = new Fox(); //那么就生一个新的出来
		} //否则的话就是null（初始值）
		return ret;
	}

	@Override
	public String toString() {
		return "Fox:"+super.toString();
	}

	@Override
	public Animal feed(ArrayList<Animal> neighbour) {
		Animal ret = null;
		if ( Math.random() < 0.2 ) { //如果达到一定的几率
			//随机的在它周围邻居的兔子当中挑一个兔子，把它吃掉
			ret = neighbour.get((int)(Math.random()*neighbour.size()));
			//吃掉之后把自己的longerLife（也就是ageLimit）加2，它的寿命就变长了
			longerLife(2); 
		}
		return ret;
	}
}
