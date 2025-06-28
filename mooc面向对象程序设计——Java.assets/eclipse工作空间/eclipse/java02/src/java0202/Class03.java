package java0202;
// 通过getSuperclass()取得父类
public class Class03 {
	public static void main(String[] args) {
		Class<?> c1 = null; // 声明class对象
		try {
			c1 = Class.forName("org.w3c.dom.Text3.Person"); // 实例化对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class<?> c2 = c1.getSuperclass(); // 取得父类
		System.out.println("父类名称：" + c2.getName()); //输出接口
	}
}
