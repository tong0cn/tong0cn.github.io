package java0202;
// 通过getInterfaces()方法取得类所实现的接口
public class Class02 {
	public static void main(String[] args) {
		Class<?> c1 = null; // 声明class对象
		try {
			c1 = Class.forName("Text3.Person"); // 实例化对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class<?> c[] = c1.getInterfaces(); // 以数组的形式返回实现的全部接口
		for (int i=0; i<c.length; i++) {
			System.out.println("实现的接口有：" + c[i].getName()); //输出接口
		}
	}

}
