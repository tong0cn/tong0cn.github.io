package java02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 掌握Iterator迭代器的使用
public class Iterator04 {
	public static void main(String[] args) {
		// 定义一个List集合list，并向其中添加数据“abc1”、“abc2”、“abc3”、“abc4”
		List list = new ArrayList();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		// 调用List集合的iterator方法获取迭代器对象
		Iterator it = list.iterator();
		// while循环遍历元素
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
