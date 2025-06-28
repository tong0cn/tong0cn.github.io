package foxnrabbit;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import animal.Animal;
import animal.Fox;
import animal.Rabbit;
import cell.Cell;
import field.Field;
import field.Location;
import field.View;

public class FoxAndRabbit {
	private Field theField;
	private View theView;
	private JFrame frame;
	
	public FoxAndRabbit(int size) {
		theField = new Field(size, size);
		//���ص�ѭ����ȥ�����������Ȼ����ݿ�����������ź���������ӵ�����ͷȥ
		for ( int row = 0; row<theField.getHeight(); row++) {
			for ( int col = 0; col<theField.getWidth(); col++) {
				double probablility = Math.random();
				if ( probablility < 0.05 ) {
					theField.place(row, col, new Fox());
				} else if ( probablility < 0.15) {
					theField.place(row, col, new Rabbit());
				}
			}
		}
		theView = new View(theField);
		frame = new JFrame();
		//����һ������
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false); //�����Ըı��С
		frame.setTitle("Cells"); //����title��Cells
		frame.add(theView); //�����frame����Ѹղŵ��Ǹ�view���ӽ�ȥ
		//��һ����ť��Ȼ��ӵ�frame��ȥ
		JButton btnStep = new JButton("����");
		frame.add(btnStep, BorderLayout.NORTH);
		//�����buttonStepaddһ��ActionListener��
		//�������Ҫ����һ��ActionListener�Ķ����������Ǿ�����һ��������
		btnStep.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��������");	
				step();
				frame.repaint();
			}
		});
		frame.pack(); //�����Լ�����һ�´�С
		frame.setVisible(true); //������ͼ�δ�����ʾ����
	}
	
	public void start(int steps) {
		//����һ���Ĳ���
		for ( int i=0; i<steps; i++ ) {
			step(); //ÿһ����һ��
			theView.repaint(); //Ȼ������������ȥrepaint
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
	
	public void step() {
		//��������Field�õ�ÿһ��ϸ��/���ӡ�
		for ( int row = 0; row<theField.getHeight(); row++) {
			for ( int col = 0; col<theField.getWidth(); col++) {
				Cell cell = theField.get(row, col);
				if ( cell != null ) { 
					//��Ϊ���ǷŽ�ȥ����һ��Animal���������ǿ��԰���cast��Ϊһ��Animal����
					Animal animal = (Animal)cell; 
					animal.grow(); // �����Animalȥgrow��
					//�ж��ǲ��ǻ��ŵ�
					if ( animal.isAlive() ) { //�ǻ��ŵ�
						//	move���ƶ���
						//�����Field��theField��ȥö�ٳ���ǰ������ӻ��ߺ����ܱ߿յ�λ��
						//Ȼ������λ��/�ط�ȥ����animalȥmove
						Location loc = animal.move(theField.getFreeNeighbour(row, col));
						if ( loc != null ) { //����Ǹ�Animal����Ҫ�ƶ�
							theField.move(row, col, loc); //����(Field)ȥ������������ƶ������顣
						}
						//	eat ��
						//�ھӵ����顣�õ������е��ھӴ浽�ھӵ������
						Cell[] neighbour = theField.getNeighbour(row, col);
						ArrayList<Animal> listRabbit = new ArrayList<Animal>();
						for ( Cell an : neighbour ) { //���ھӵ����������һ��
						//�õ���ǰ����ھ���Χ���е����ӣ�
							//ÿһ���ھ��ж����ǲ���һ��Rabbit��һ������
							if ( an instanceof Rabbit ) {
								//����Ǿͼӵ�Rabbit��������ͷȥ
								listRabbit.add((Rabbit)an);
							}
						}
						//��������Χ�����ӣ�
						if ( !listRabbit.isEmpty() ) { 
							//���Ǿ���animalȥfeed����������Ծͷ��س�����һ��
							Animal fed = animal.feed(listRabbit);  
							if ( fed != null ) { 
							theField.remove((Cell)fed); //��Field�ѳ��˵��Ǹ����ߣ�������Field���棩
							}
						}
						// breed ��Сbaby
						Animal baby = animal.breed(); //ÿһ�Σ���Animalȥbreed�Ķ���
						if ( baby != null ) { //���������Ҫbreed����ô���ͻ����һ��baby��
							//���������һ��baby��������İ��������ھӵĿյ�λ�ã���Χ�Ź���İ˸�λ�ã���ͷ��
							theField.placeRandomAdj(row, col, (Cell)baby);
						}
						} else { //�����������
						theField.remove(row, col); //������ط��Ķ�����remove����
						}
				}
			}
		}
	}
	public static void main(String[] args) {
        FoxAndRabbit fnr = new FoxAndRabbit(30);
//        fnr.start(1000);
    }
}
