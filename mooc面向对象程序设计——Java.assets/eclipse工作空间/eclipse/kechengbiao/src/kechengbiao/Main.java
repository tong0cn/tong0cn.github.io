package kechengbiao;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Main {

	public static void main(String[] args) {
		//我们知道JFrame是一个容器，在这个容器中加点东西它就能怎么怎么样
		JFrame frame = new JFrame(); //我们想要出一个图形的东西需要有一个JFrame
		//表格。因为JTable只是表格的表现，所以new JTable的时候要给它数据的位置。
		JTable table = new JTable(new Kechengbiao()); //做一个table出来
		JScrollPane panel = new JScrollPane(table);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.add(table); //把这个table add到这个frame里面->这是不行的，table只是表现，还需要数据。这样会显示一个空窗口。
		frame.add(panel);
//		frame.pack(); //自己把自己的大小计算一下
		frame.setSize(400, 400);
		frame.setVisible(true); //让frame显示出来
	}
}
