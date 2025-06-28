package java02;

import java.util.HashSet;
import java.util.Iterator;

// HashSet集合
public class HashSet06 {
	public static void main(String[] args) {
		// 创建HashSet集合
		HashSet hs = new HashSet();
		// 将Person对象存入集合
		hs.add(new HashSet06Person("lisa", 21));
		hs.add(new HashSet06Person("lisa1", 22));
		hs.add(new HashSet06Person("lisa2", 23));
		hs.add(new HashSet06Person("lisa3", 24));
		hs.add(new HashSet06Person("lisa4", 25));
		hs.add(new HashSet06Person("lisa5", 26));
		// 遍历集合中的元素
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			HashSet06Person p = (HashSet06Person) it.next();
			System.out.println(p);
		}
	}

}
