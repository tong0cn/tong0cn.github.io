package java02;

import java.util.ArrayList;
import java.util.Collection;
// Collection�ӿڶԼ��ϵĲ���
public class Collection01 {
	public static void main(String[] args) {
		// ������������col1��col2����col1����ӡ�123abc����123��34.121
		Collection col1 = new ArrayList();
		Collection col2 = new ArrayList();
		col1.add("123abc");
		col1.add(123);
		col1.add(34.121);
		// �ֱ��ж����������Ƿ�Ϊ�ղ�������
		System.out.println("col1 = "+col1);
		System.out.println("col2 = "+col2);
		// ������col1�е�Ԫ����ӵ�col2�в�������
		col2.addAll(col1);
		// ��ȡ�������ϵĽ���
		boolean c = col1.retainAll(col2);
		System.out.println("col1��col2�Ƿ��н�����" + c);
		// �������col2�е�Ԫ��
		col2.clear();
		System.out.println("�������col2�е�Ԫ�أ�col2 = "+col2);
		// ��ȡ������Ԫ�صĸ���
		System.out.println("������col1��Ԫ�صĸ�����"+col1.size());
	}

}
