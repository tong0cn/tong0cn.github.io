package java02;

import java.util.ArrayList;
import java.util.Collection;
// Collection接口对集合的操作
public class Collection01 {
	public static void main(String[] args) {
		// 定义两个集合col1和col2，在col1中添加“123abc”、123、34.121
		Collection col1 = new ArrayList();
		Collection col2 = new ArrayList();
		col1.add("123abc");
		col1.add(123);
		col1.add(34.121);
		// 分别判断两个集合是否为空并输出结果
		System.out.println("col1 = "+col1);
		System.out.println("col2 = "+col2);
		// 将集合col1中的元素添加到col2中并输出结果
		col2.addAll(col1);
		// 获取两个集合的交集
		boolean c = col1.retainAll(col2);
		System.out.println("col1和col2是否有交集：" + c);
		// 清除集合col2中的元素
		col2.clear();
		System.out.println("清除集合col2中的元素：col2 = "+col2);
		// 获取集合中元素的个数
		System.out.println("集合中col1中元素的个数："+col1.size());
	}

}
