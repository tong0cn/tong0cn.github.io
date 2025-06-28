package clock;

//我们这个display只是表达整个钟当中的那么一个小部件，但是我们依然可以为它做一个main出来。我们后面可以看到这非常有用，因为我们做了这一个display我们其实就希望对这个display单独的能够有一个测试。
public class Display {
	//Display有两个成员：一个是value、一个是limit
	private int value = 0;
	private int limit = 0;
	//之前我们提到过Java的所有的对象在构造它的时候，每一个成员变量都会得到默认的零值，所以不写这个0没关系，但这是一种好习惯，对自己的一种强化强调的习惯。

	private static int step = 1;
	
	//Display需要一个构造函数：需要在构造这个Display的时候给它一个limit，每一个Display会有自己不同的limit，表达分钟的那个是60，表达小时的那个是24
	public Display(int limit) {//接收limit的构造函数
		this.limit = limit;
	}
	
	public void increase() {//让钟跳一步
		value++;
		if ( value == limit ) {
			value = 0;
			
		}
	}
	
	public int getValue() {
		return value;//返回现在的value值
	}
	
	public static void f() {
		
	}
	
	public static void main(String[] args) {
		//测试：
//		Display d = new Display(24);
//		for ( ;; ) { //做一个无限循环
//			d.increase();
//			System.out.println(d.getValue());
//		}
		
		Display d1 = new Display(10);
		d1.step = 2;
		System.out.println(d1.step);
		Display d2 = new Display(20);
		System.out.println(d2.step);
		d1.increase();
//		increase(); //不行
		f();
		d1.f();
		System.out.println(d1.getValue());
		System.out.println(d2.getValue());
		System.out.println(d1.step);
		System.out.println(d2.step);
		d1.step = 2;
		System.out.println(d1.step);
		System.out.println(d2.step);
		Display.step = 3;
		System.out.println(d1.step);
		System.out.println(d2.step);	
		
		
	}

}
