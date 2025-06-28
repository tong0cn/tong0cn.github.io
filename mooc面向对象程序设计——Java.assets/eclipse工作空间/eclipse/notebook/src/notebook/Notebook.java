package notebook;

import java.util.ArrayList; //现在引入了一个类，这个类属于java.util这个包，这个包里这个类的名字叫做ArrayList。所以这个类的名字就是ArrayList。

class Value {
	private int i;
	public void set(int i) { this.i = i; }
	public int get() (return i;)
}

public class Notebook {
	private ArrayList<String> notes = new ArrayList<String>();//容器需要:有一个成员变量，名字叫做notes。它的类型叫什么呢？ArrayList
	// 上面的ArrayList<String>：ArrayList of String，用来存放String的一个ArrayList————泛型类，是一种容器。
	
	
	// 先来定义接
	public void add(String s) {
		notes.add(s); //ArrayList有一个函数叫做add，给它一个String它就add进去了。
		
	}
	
	public void add(String s, int location) { //插入元素。第二种add，把String加到某个位置/现有元素的前面去
		notes.add(location, s);
	}
	
	public int getSize() {
		return notes.size(); //容器本身有一个函数叫做size，它自己会知道它里头放了多少东西进去。所以定义成员变量size，然后add的时候size++，这里再return size是一个蠢办法。
	}
	
	public String getNote(int index) {
		return notes.get(index); //返回容器里下标是index里头的东西
	}

	public void removeNote(int index) { //boolean表示到底有没有把它删成功
		notes.remove(index); //表面看上去return notes.remove(index);即可，但这不是一个需要return的东西。
	}
	
	public String[] list() {//把所有的note列出来的东西。这里有两种设计：1.不返回值，直接在这里System.out输出。2.返回一个String的数组，把所有的数据放在一个String数组里返回回去。String[]怎么用让上一层程序决定，本层只关心数据本身。
		String[] a = new String[notes.size()]; //首先要有一个String[]，notes.size会告诉我们需要多大。
//		for ( int i=0; i<notes.size(); i++ ) {
//			a[i] = notes.get(i);
//		}
		notes.toArray(a); //可以替换调上面的for循环：把a给toArray，它会帮我们把a填起来
		return a;
	}
	
	public static void main(String[] args) {
		//add,getSize的输出测试
		String[] a = new String[2];
		a[0] = "first";
		a[1] = "second";
		Notebook nb = new Notebook();
		nb.add("first");
		nb.add("second");
		nb.add("third", 1);
		System.out.println(nb.getSize());
		//getNote的输出测试
		System.out.println(nb.getNote(0));
		System.out.println(a[0]);
//		System.out.println(nb.getNote(10)); //会报错
		//add(String s, int location)输出测试 nb.add("third", 1);
		System.out.println(nb.getNote(1));
		//removeNote()测试
		nb.removeNote(1);
		String[] aa = nb.list();
		for ( String s : aa) {
			System.out.println(s);
		}
		
//		Value[] a = new Value[10];
//		for ( int i=0; i<a.length; i++ ) { //初始化
//			a[i] = new Value();
//			a[i].set(i);
//		}
//		for ( Value v : a ) {
//			System.out.println(v.get());
//		}
		
//		ArrayList<String> a = new ArrayList<String>();
//		a.add("first");
//		a.add("second");
//		for ( String s : a ) {
//			System.out.println(s);
//		}
	}
}
