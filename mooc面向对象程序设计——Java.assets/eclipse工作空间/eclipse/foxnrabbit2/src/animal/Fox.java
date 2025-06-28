package animal;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import cell.Cell;

//��һ��˵��Fox�������Animal�����ࡢͬʱ��Ҳʵ����Cell��
//����Fox��һ��Animal��������Ϊ��ʵ����Cell�����Fox���Ա��ŵ�Field��ͷȥ��
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
		//���isBreedable����Ϊ����һ���������⣬��Animal�е����������
		//�����ǰ��������ڵ���breedableAge(������baby������)����ô���ǿ�����baby�ġ���
		if ( isBreedable() && Math.random() < 0.05 ) { //��������ǿ������Ĳ��ҷ���һ���ĸ��ʡ�
			ret = new Fox(); //��ô����һ���µĳ���
		} //����Ļ�����null����ʼֵ��
		return ret;
	}

	@Override
	public String toString() {
		return "Fox:"+super.toString();
	}

	@Override
	public Animal feed(ArrayList<Animal> neighbour) {
		Animal ret = null;
		if ( Math.random() < 0.2 ) { //����ﵽһ���ļ���
			//�����������Χ�ھӵ����ӵ�����һ�����ӣ������Ե�
			ret = neighbour.get((int)(Math.random()*neighbour.size()));
			//�Ե�֮����Լ���longerLife��Ҳ����ageLimit����2�����������ͱ䳤��
			longerLife(2); 
		}
		return ret;
	}
}
