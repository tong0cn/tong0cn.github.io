package java02;

import java.util.HashSet;
import java.util.Iterator;

// HashSet����
public class HashSet06 {
	public static void main(String[] args) {
		// ����HashSet����
		HashSet hs = new HashSet();
		// ��Person������뼯��
		hs.add(new HashSet06Person("lisa", 21));
		hs.add(new HashSet06Person("lisa1", 22));
		hs.add(new HashSet06Person("lisa2", 23));
		hs.add(new HashSet06Person("lisa3", 24));
		hs.add(new HashSet06Person("lisa4", 25));
		hs.add(new HashSet06Person("lisa5", 26));
		// ���������е�Ԫ��
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			HashSet06Person p = (HashSet06Person) it.next();
			System.out.println(p);
		}
	}

}
