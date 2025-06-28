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
		//两重的循环，去往里面填东西，然后根据可能性往里面放狐狸或者兔子到田里头去
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
		//做了一堆设置
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false); //不可以改变大小
		frame.setTitle("Cells"); //它的title是Cells
		frame.add(theView); //在这个frame里面把刚才的那个view给加进去
		//加一个按钮，然后加到frame里去
		JButton btnStep = new JButton("单步");
		frame.add(btnStep, BorderLayout.NORTH);
		//让这个buttonStepadd一个ActionListener。
		//这个函数要的是一个ActionListener的对象，所以我们就制造一个给它。
		btnStep.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("按下啦！");	
				step();
				frame.repaint();
			}
		});
		frame.pack(); //让它自己决定一下大小
		frame.setVisible(true); //把整个图形窗口显示出来
	}
	
	public void start(int steps) {
		//做了一定的步数
		for ( int i=0; i<steps; i++ ) {
			step(); //每一次做一步
			theView.repaint(); //然后让整个窗口去repaint
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
	
	public void step() {
		//遍历整个Field拿到每一个细胞/格子。
		for ( int row = 0; row<theField.getHeight(); row++) {
			for ( int col = 0; col<theField.getWidth(); col++) {
				Cell cell = theField.get(row, col);
				if ( cell != null ) { 
					//因为我们放进去的是一个Animal，所以我们可以把它cast成为一个Animal造型
					Animal animal = (Animal)cell; 
					animal.grow(); // 让这个Animal去grow。
					//判断是不是活着的
					if ( animal.isAlive() ) { //是活着的
						//	move（移动）
						//让这个Field（theField）去枚举出当前这个兔子或者狐狸周边空的位置
						//然后把这个位置/地方去交给animal去move
						Location loc = animal.move(theField.getFreeNeighbour(row, col));
						if ( loc != null ) { //如果那个Animal决定要移动
							theField.move(row, col, loc); //让田(Field)去帮我们做这个移动的事情。
						}
						//	eat 吃
						//邻居的数组。得到了所有的邻居存到邻居的数组里。
						Cell[] neighbour = theField.getNeighbour(row, col);
						ArrayList<Animal> listRabbit = new ArrayList<Animal>();
						for ( Cell an : neighbour ) { //在邻居的数组里遍历一下
						//得到当前这个邻居周围所有的兔子：
							//每一种邻居判断它是不是一种Rabbit的一个对象。
							if ( an instanceof Rabbit ) {
								//如果是就加到Rabbit的数组里头去
								listRabbit.add((Rabbit)an);
							}
						}
						//如果这个周围有兔子：
						if ( !listRabbit.isEmpty() ) { 
							//我们就让animal去feed，如果决定吃就返回吃了哪一个
							Animal fed = animal.feed(listRabbit);  
							if ( fed != null ) { 
							theField.remove((Cell)fed); //让Field把吃了的那个移走（从整个Field里面）
							}
						}
						// breed 生小baby
						Animal baby = animal.breed(); //每一次：让Animal去breed的动作
						if ( baby != null ) { //如果它觉得要breed，那么它就会给我一个baby。
							//如果给了我一个baby，就随机的把它放在邻居的空的位置（周围九宫格的八个位置）里头。
							theField.placeRandomAdj(row, col, (Cell)baby);
						}
						} else { //如果不活着了
						theField.remove(row, col); //把这个地方的东西给remove掉。
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
