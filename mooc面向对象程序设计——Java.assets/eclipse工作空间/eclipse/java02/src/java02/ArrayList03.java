package java02;

import java.util.ArrayList;

// ArrayList���ϵĴ�ȡ
public class ArrayList03 {
	public static void main(String[] args) {
		// �����ж���һ��ArrayList����array�����Ԫ�ء�list���ȵȣ����array
		ArrayList array = new ArrayList();
		array.add("list0");
		array.add("list1");
		array.add("list2");
		array.add("list3");
		array.add("list4");
		System.out.println("array ="+array);
		// ���array���ϵĵ�2��Ԫ��
		System.out.println("array���ϵĵ�2��Ԫ�أ�"+array.get(1));
	}

}
