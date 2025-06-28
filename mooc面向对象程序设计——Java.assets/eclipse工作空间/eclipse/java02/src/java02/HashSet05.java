package java02;

import java.util.HashSet;
import java.util.Iterator;

// HashSet集合
public class HashSet05 {

	public static void main(String[] args) {
		// 创建HashSet集合
		HashSet hs = new HashSet();
		// 向HashSet集合中添加元素，其中包括重复元素
		hs.add("abc2");
		hs.add("abc2");
		hs.add("abc1");
		hs.add("abc4");
		hs.add("abc4");
		hs.add("abc3");
		// 输出集合中元素的个数
		System.out.println("集合中元素的个数："+hs.size());
		// 输出集合中每一个元素
		System.out.println("输出集合中每一个元素：");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

		

	}

}
