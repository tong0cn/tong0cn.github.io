package animal;

import java.util.ArrayList;

import field.Location;

public abstract class Animal {
	private int ageLimit;
	private int breedableAge; //������baby������
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
	
	//Animal��breed��һ����������Ҳ����˵Animal������ôbreed��
	public abstract Animal breed();
	
	public void grow() {
		age++; //����+1
		if ( age >= ageLimit ) { //�����������������limit��
			die(); //��die
		}
	}
	
	public void die() {
		isAlive = false; //����
	}
	
	public boolean isAlive() {
		return isAlive;
	}

	public boolean isBreedable() {
		//�����ǰ��������ڵ���breedableAge(������baby������)����ô���ǿ�����baby�ġ�
		return age >= breedableAge;
	}
	
	//move�������õ�һ��Location�������Field����λ�õ�һ�����飩��
	public Location move(Location[] freeAdj) {
		Location ret = null;
		if ( freeAdj.length>0 && Math.random() < 0.02 ) { // ��һ���ļ�����
			ret = freeAdj[(int)(Math.random()*freeAdj.length)]; //��һ�������λ��
		}
		return ret; //�����Ǹ�λ��
	}
	
	@Override
	public String toString() {
		return ""+age+":"+(isAlive?"live":"dead");
	}
	
	public Animal feed(ArrayList<Animal> neighbour) {
		return null; //ʲôҲ����
	}
	
	protected void longerLife(int inc) {
		ageLimit += inc;
	}
	
}
