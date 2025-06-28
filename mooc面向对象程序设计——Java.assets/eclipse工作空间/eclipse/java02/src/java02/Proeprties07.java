package java02;

import java.util.Properties;

// Proeprties集合
public class Proeprties07 {
	public static void main(String[] args) {
		// 创建集合对象
		Properties prop = new Properties();
		// 添加元素
		prop.setProperty("张三"， "吃西瓜");
		prop.setProperty("李四"， "睡大觉");
		prop.setProperty("王五"， "打豆豆");
		// 遍历Proeprties集合中的元素
		System.getProperties().list(System.out);
	}

}
