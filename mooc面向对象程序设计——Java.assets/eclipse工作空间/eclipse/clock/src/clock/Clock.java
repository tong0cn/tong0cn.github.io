package clock;

public class Clock {
//	private Display hour;
//	private Display minute;
	//注意：要特别小心的是，当我们把代码写成上面这个样子，hour是一个成员变量、Display是它的类型。这个时候Display这个对象是没有的。——对象变量是对象的管理者而非所有者。
	//所以我们需要在这里new一个display：
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	//这样才是真正说：我们一旦制造出一个Clock的对象来，我们就会去制造出两个Display的对象。
	
	public void start() {//一旦start起来这个钟就要去走了。
		while ( true ) {
			minute.increase();
			if (minute.getValue() == 0 ) {
				hour.increase();
			}
			System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue()); 
			//printf表示说带格式的输出。"%02d:%02d\n"中的【:】是它固定要输出的内容；【%02d】表示这个位置要输出一个整数，这个整数是一定占据两个字符的位置的，如果它只有个位数，要用这个0来填充。
		}
	}
	
	//这是我们整个程序真正的那个main函数。
	public static void main(String[] args) {
		Clock clock =new Clock();
		clock.start();
	}

}
