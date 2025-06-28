package java02;

import java.util.ArrayList;

// ArrayList集合的存取
public class ArrayList03 {
	public static void main(String[] args) {
		// 在类中定义一个ArrayList集合array，添加元素“list”等等，输出array
		ArrayList array = new ArrayList();
		array.add("list0");
		array.add("list1");
		array.add("list2");
		array.add("list3");
		array.add("list4");
		System.out.println("array ="+array);
		// 输出array集合的第2个元素
		System.out.println("array集合的第2个元素："+array.get(1));
	}

}
