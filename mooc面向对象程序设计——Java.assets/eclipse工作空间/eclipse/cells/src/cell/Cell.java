package cell;

import java.awt.Graphics;
 
public class Cell {
	private boolean alive = false; //��һ��alive�ı����������Լ��ǲ��ǻ��ŵġ�
	
	public void die() { alive = false; } //die -> alive��Ϊfalse��
	public void reborn() { alive = true; } //reborn -> alive��Ϊtrue��
	public boolean isAlive() { return alive; }
	
	public void draw(Graphics g, int x, int y, int size) {
		g.drawRect(x, y, size, size); //�Ȼ�������
		if ( alive ) {	//����ǻ��ŵ�
			g.fillRect(x, y, size, size); //���������Ҫ�������ġ�
		}
	}
}
