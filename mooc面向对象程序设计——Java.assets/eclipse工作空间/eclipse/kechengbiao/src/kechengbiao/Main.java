package kechengbiao;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Main {

	public static void main(String[] args) {
		//����֪��JFrame��һ������������������мӵ㶫����������ô��ô��
		JFrame frame = new JFrame(); //������Ҫ��һ��ͼ�εĶ�����Ҫ��һ��JFrame
		//�����ΪJTableֻ�Ǳ��ı��֣�����new JTable��ʱ��Ҫ�������ݵ�λ�á�
		JTable table = new JTable(new Kechengbiao()); //��һ��table����
		JScrollPane panel = new JScrollPane(table);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.add(table); //�����table add�����frame����->���ǲ��еģ�tableֻ�Ǳ��֣�����Ҫ���ݡ���������ʾһ���մ��ڡ�
		frame.add(panel);
//		frame.pack(); //�Լ����Լ��Ĵ�С����һ��
		frame.setSize(400, 400);
		frame.setVisible(true); //��frame��ʾ����
	}
}
