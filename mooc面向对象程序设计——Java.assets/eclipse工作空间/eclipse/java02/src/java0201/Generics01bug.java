package java0201;

import java.util.ArrayList;
import java.util.Iterator;

// ��֤�����ࡢ���ͽӿڵĶ����ʹ��
public class Generics01bug {
	public static void main(String[] args) {
		// ��ArrayList�洢�ַ���������
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add(new Integer(10));
		System.out.println("array ="+array);
		// ���array���ϵĵ�2��Ԫ��
		System.out.println("array���ϵĵ�2��Ԫ�أ�"+array.get(1));
		
		Iterator it = list.iterator();
		// whileѭ������Ԫ��
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

	}

}
