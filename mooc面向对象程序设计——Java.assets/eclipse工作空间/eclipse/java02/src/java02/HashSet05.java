package java02;

import java.util.HashSet;
import java.util.Iterator;

// HashSet����
public class HashSet05 {

	public static void main(String[] args) {
		// ����HashSet����
		HashSet hs = new HashSet();
		// ��HashSet���������Ԫ�أ����а����ظ�Ԫ��
		hs.add("abc2");
		hs.add("abc2");
		hs.add("abc1");
		hs.add("abc4");
		hs.add("abc4");
		hs.add("abc3");
		// ���������Ԫ�صĸ���
		System.out.println("������Ԫ�صĸ�����"+hs.size());
		// ���������ÿһ��Ԫ��
		System.out.println("���������ÿһ��Ԫ�أ�");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

		

	}

}
