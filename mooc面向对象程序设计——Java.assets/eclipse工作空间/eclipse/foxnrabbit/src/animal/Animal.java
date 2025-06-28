package animal;

import java.util.ArrayList;

import field.Location;

public abstract class Animal {
	private int ageLimit;
	private int breedableAge; //可以生baby的年龄
	private int age;
	private boolean isAlive = true;
	
	public Animal(int ageLimit, int breedableAge) {
		this.ageLimit = ageLimit;
		this.breedableAge = breedableAge;
	}
	
	protected int getAge() {
		return age;
	}
	
	protected double getAgePercent() {
		return (double)age/ageLimit;
	}
	
	//Animal的breed是一个抽象函数，也就是说Animal不管怎么breed。
	public abstract Animal breed();
	
	public void grow() {
		age++; //岁数+1
		if ( age >= ageLimit ) { //如果岁数到了岁数的limit了
			die(); //就die
		}
	}
	
	public void die() {
		isAlive = false; //死了
	}
	
	public boolean isAlive() {
		return isAlive;
	}

	public boolean isBreedable() {
		//如果当前的年龄大于等于breedableAge(可以生baby的年龄)，那么就是可以生baby的。
		return age >= breedableAge;
	}
	
	//move函数：拿到一个Location（表达在Field里面位置的一个数组）。
	public Location move(Location[] freeAdj) {
		Location ret = null;
		if ( freeAdj.length>0 && Math.random() < 0.02 ) { // 在一定的几率下
			ret = freeAdj[(int)(Math.random()*freeAdj.length)]; //找一个随机的位置
		}
		return ret; //返回那个位置
	}
	
	@Override
	public String toString() {
		return ""+age+":"+(isAlive?"live":"dead");
	}
	
	public Animal feed(ArrayList<Animal> neighbour) {
		return null; //什么也不吃
	}
	
	protected void longerLife(int inc) {
		ageLimit += inc;
	}
	
}
