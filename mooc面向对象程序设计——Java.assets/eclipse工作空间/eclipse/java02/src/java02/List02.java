package java02;

import java.util.List;
import java.util.ArrayList;
// List接口的特有方法
public class List02 {
	public static void main(String[] args) {
		// 在类中定义list集合，并向其中添加数据“abc1”、“abc2”、“abc3”、“abc4”
		List list = new ArrayList();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		System.out.println("list = "+list);
		// 定义newlist集合，用subList()方法获取list集合的前两个元素，输出newlist
		List newlist = new ArrayList();
		newlist = list.subList(0, 2);
		System.out.println("newlist = "+newlist);
		// set方法修改list集合的第1个位置元素值为haha，输出list
		list.set(0, "haha");
		System.out.println("set()方法修改list集合的第1个位置元素值为haha：" + list);
		// add方法在list集合的第1个位置前增加一个元素QQ，输出list
		list.add(0, "QQ");
		System.out.println("add()方法在list集合的第1个位置前增加一个元素QQ：" + list);

	}

}