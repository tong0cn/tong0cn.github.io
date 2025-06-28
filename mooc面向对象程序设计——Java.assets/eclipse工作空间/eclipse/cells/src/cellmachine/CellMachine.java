package cellmachine;

import javax.swing.JFrame;

import cell.Cell;
import field.Field;
import field.View;

public class CellMachine {

	public static void main(String[] args) {
		Field field = new Field(30,30); //��ſ��Բµ�����һ��30x30������
		// һ������ѭ�������ȥ����������Field
		for ( int row = 0; row<field.getHeight(); row++ ) { //�д�0������height
			for ( int col = 0; col<field.getWidth(); col++ ) {	//�д�0������width
				field.place(row, col, new Cell());
			}
		}
		//��ȥ����һ��Field�ı�����
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				//��field��get���ó�row��colλ���ϵ�һ��Cell������
				Cell cell = field.get(row, col); 
				if ( Math.random() < 0.2 ) { //�ж���������С��0.2
				//Math.random()�����᷵��0~1֮����������С��0.2��������1/5��
					cell.reborn(); //��������1/5��ϸ�������
				}
			}
		}
		View view = new View(field); //����һ��View������ʱ���������Ӧ��field
		JFrame frame = new JFrame(); //Java��ͼ�δ���
		//��һ��Ĭ�ϵĹرղ���EXIT_ON_CLOSE����֤������ͼ�δ�������Ĳ���ܹ������������������
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		//����һ������
		frame.setResizable(false); //�����Ըı��С
		frame.setTitle("Cells"); //����title��Cells
		frame.add(view); //�����frame����Ѹղŵ��Ǹ�view���ӽ�ȥ
		frame.pack(); //�����Լ�����һ�´�С
		frame.setVisible(true); //������ͼ�δ�����ʾ����
		
		for ( int i=0; i<1000; i++ ) { //����һǧ����Ҫ��ʼ�仯�ˣ�
			//ÿһ�α���ͬ��������ѭ������������Field
			for ( int row = 0; row<field.getHeight(); row++ ) {
				for ( int col = 0; col<field.getWidth(); col++ ) {
					Cell cell = field.get(row, col); //�ҵ����Field����ÿһ����Ԫȡ����
					//��Field����ȥ�ҵ������Ԫ���е��ھӣ����������Χ����8����
					Cell[] neighbour = field.getNeighbour(row, col);
					//����6�У�֪���Լ���Χ�ж��ٸ����ŵ��ھ�
					int numOfLive = 0;
					for ( Cell c : neighbour ) { //�������е��ھ�
						if ( c.isAlive() ) { //�������ھ��ǻ��ŵ�
							numOfLive++; //���ŵ��ھ�����++
						}
					}
					System.out.print("["+row+"]["+col+"]:");
					System.out.print(cell.isAlive()?"live":"dead");
					System.out.print(":"+numOfLive+"-->");
					if ( cell.isAlive() ) { //������Լ��ǻ��ŵ�
						//����ǰ��˵�Ĺ�������ھ�������С��2�����ߴ���3���ģ����Լ���Ҫ����
						if ( numOfLive <2 || numOfLive >3 ) {
							cell.die();
							System.out.print("die");
						}
					} else if ( numOfLive == 3 ) { //������Լ��������ģ������ھ���3��
						cell.reborn(); //��Ҫ����
						System.out.print("reborn");
					}
					System.out.println();
				}
			}
			System.out.println("UPDATE");
			frame.repaint();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
