package field;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import cell.Cell;

public class View extends JPanel {
	private static final long serialVersionUID = -5258995676212660595L;
	private static final int GRID_SIZE = 16;
	private Field theField;
	
	public View(Field field) { //构造的时候记录了一个Field
		theField = field;
	}

	@Override
	public void paint(Graphics g) { //被调用时得到一个Graphics的对象（当前要画的对象）
		super.paint(g);
		//一个两重循环，
		for ( int row = 0; row<theField.getHeight(); row++ ) {
			for ( int col = 0; col<theField.getWidth(); col++ ) {
				Cell cell = theField.get(row, col); //从Field里面得到了每一个Cell
				if ( cell != null ) { //如果这个Cell是有的，那么就让这个Cell去draw
					cell.draw(g, col*GRID_SIZE, row*GRID_SIZE, GRID_SIZE);
				}
			}
		}
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(theField.getWidth()*GRID_SIZE+1, theField.getHeight()*GRID_SIZE+1);
	}

	public static void main(String[] args) {
		Field field = new Field(10,10);
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				field.place(row, col, new Cell());
			}
		}
		View view = new View(field);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Cells");
		frame.add(view);
		frame.pack();
		frame.setVisible(true);
	}

}
