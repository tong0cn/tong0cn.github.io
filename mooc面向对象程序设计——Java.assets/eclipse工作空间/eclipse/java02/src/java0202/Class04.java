package java0202;

import java.lang.reflect.Constructor;

// 通过getConstructors()方法取得全部构造方法
public class Class04 {
	public static void main(String[] args) {
		Class<?> c1 = null; // 声明class对象
		try {
			c1 = Class.forName("Text3.Person"); // 实例化对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Constructor<?> con[] = c1.getConstructors(); // 取得一个构造方法
		for (int i=0; i<con.length; i++) {
			System.out.println("构造方法：" + con[i]); //输出接口
		}
	}
}
