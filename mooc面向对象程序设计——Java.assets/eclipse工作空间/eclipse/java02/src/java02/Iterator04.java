package java02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// ����Iterator��������ʹ��
public class Iterator04 {
	public static void main(String[] args) {
		// ����һ��List����list����������������ݡ�abc1������abc2������abc3������abc4��
		List list = new ArrayList();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		// ����List���ϵ�iterator������ȡ����������
		Iterator it = list.iterator();
		// whileѭ������Ԫ��
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
