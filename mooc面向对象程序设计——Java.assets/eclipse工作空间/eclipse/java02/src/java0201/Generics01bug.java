package java0201;

import java.util.ArrayList;
import java.util.Iterator;

// 验证泛型类、泛型接口的定义和使用
public class Generics01bug {
	public static void main(String[] args) {
		// 用ArrayList存储字符串并遍历
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add(new Integer(10));
		System.out.println("array ="+array);
		// 输出array集合的第2个元素
		System.out.println("array集合的第2个元素："+array.get(1));
		
		Iterator it = list.iterator();
		// while循环遍历元素
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

	}

}
