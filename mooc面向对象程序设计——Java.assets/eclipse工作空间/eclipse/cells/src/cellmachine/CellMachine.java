package cellmachine;

import javax.swing.JFrame;

import cell.Cell;
import field.Field;
import field.View;

public class CellMachine {

	public static void main(String[] args) {
		Field field = new Field(30,30); //大概可以猜到这是一个30x30的网格
		// 一个两重循环，大概去遍历了整个Field
		for ( int row = 0; row<field.getHeight(); row++ ) { //行从0到它的height
			for ( int col = 0; col<field.getWidth(); col++ ) {	//列从0到它的width
				field.place(row, col, new Cell());
			}
		}
		//又去做了一边Field的遍历，
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				//做field的get：拿出row和col位置上的一个Cell出来。
				Cell cell = field.get(row, col); 
				if ( Math.random() < 0.2 ) { //判断如果随机数小于0.2
				//Math.random()函数会返回0~1之间的随机数。小于0.2，概率是1/5。
					cell.reborn(); //重生，让1/5的细胞活过来
				}
			}
		}
		View view = new View(field); //做了一个View，做的时候告诉它相应的field
		JFrame frame = new JFrame(); //Java的图形窗口
		//做一个默认的关闭操作EXIT_ON_CLOSE：保证将来点图形窗口上面的叉叉能够把整个程序给结束掉
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		//做了一堆设置
		frame.setResizable(false); //不可以改变大小
		frame.setTitle("Cells"); //它的title是Cells
		frame.add(view); //在这个frame里面把刚才的那个view给加进去
		frame.pack(); //让它自己决定一下大小
		frame.setVisible(true); //把整个图形窗口显示出来
		
		for ( int i=0; i<1000; i++ ) { //做了一千步（要开始变化了）
			//每一次遍历同样的两层循环：遍历整个Field
			for ( int row = 0; row<field.getHeight(); row++ ) {
				for ( int col = 0; col<field.getWidth(); col++ ) {
					Cell cell = field.get(row, col); //找到这个Field里面每一个单元取出来
					//让Field帮我去找到这个单元所有的邻居（这个格子周围的那8个）
					Cell[] neighbour = field.getNeighbour(row, col);
					//以下6行：知道自己周围有多少个活着的邻居
					int numOfLive = 0;
					for ( Cell c : neighbour ) { //遍历所有的邻居
						if ( c.isAlive() ) { //如果这个邻居是活着的
							numOfLive++; //活着的邻居数量++
						}
					}
					System.out.print("["+row+"]["+col+"]:");
					System.out.print(cell.isAlive()?"live":"dead");
					System.out.print(":"+numOfLive+"-->");
					if ( cell.isAlive() ) { //如果我自己是活着的
						//根据前面说的规则：如果邻居数量是小于2个或者大于3个的，我自己就要死掉
						if ( numOfLive <2 || numOfLive >3 ) {
							cell.die();
							System.out.print("die");
						}
					} else if ( numOfLive == 3 ) { //如果我自己是死掉的，并且邻居有3个
						cell.reborn(); //我要重生
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
