package demo;

import java.util.Scanner;

class OpenException extends Exception {} //让opex继承自Exception

class  extends OpenException {} //让close继承自open（虽然这可能不太合理。

class NewException extends Exception {}

public class ArrayIndex {
	// 虽然在构造了里抛异常这是一个不好的事情，但这是可以的。
	public ArrayIndex() throws OpenException {}//构造器
	//它不用做事情，只是说明有这么一个函数
	public void f() throws OpenException {} 
	public static void main(String[] args) {
	}
}

class NewClass extends ArrayIndex {
	public NewClass() throws OpenException {}
//	public void f() {} //保证这个f函数不会抛出任何异常
//	public void f() throws CloseException{} //会抛出Close。这也是ok的，因为close是open的子类
//	public void f() throws NewException{} //这不行
	public void f() throws OpenException{}
	public static void main(String[] args) {
		try {
		//有一个父类的变量p = new一个子类的变量出来。这是可以的，这就是一种我们叫做up cast，
		//即：向上造型（Upcast）。
		ArrayIndex p  = new NewClass(); //ArrayIndex的对象里所管理/指向的其实是它的子类的变量。	
			p.f();
		} catch (OpenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



//	public static int open() {
////		int[] a = new int[10];
////		a[10] = 10;
//		return -1;
//	}
//	public static void readFile() throws OpenException, CloseException {
//		if ( open() == -1 ) {
//			throw new CloseException();
//		}
//	}
//	
//	public static void main(String[] args) {
//		try {
//			readFile();
//		} catch (NullPointerException e) {
//			// TODO Auto-generated catch block
//		} catch (CloseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("Close");
//		} catch (OpenException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("Open");
//		} 
//				
//	}
//}




//public static void f() {
//	int[] a = new int[10];
//	a[10] = 10;
//}

//int[] a = new int[10];	//一个0~9的数组
////因为数组的下标是从0开始排的，所以我们能用到的最大的下标其实是a[9]不是a[10]
//int idx;
//Scanner in = new Scanner(System.in); //一个输入
//idx = in.nextInt();
//try {
//	a[idx] = 10; //可能越界
//	System.out.println("hello");
//} catch (ArrayIndexOutOfBoundsException e) {
//	System.out.println("Caught"); //说捉到了
//}