package java02;

import java.util.List;
import java.util.ArrayList;
// List�ӿڵ����з���
public class List02 {
	public static void main(String[] args) {
		// �����ж���list���ϣ���������������ݡ�abc1������abc2������abc3������abc4��
		List list = new ArrayList();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		System.out.println("list = "+list);
		// ����newlist���ϣ���subList()������ȡlist���ϵ�ǰ����Ԫ�أ����newlist
		List newlist = new ArrayList();
		newlist = list.subList(0, 2);
		System.out.println("newlist = "+newlist);
		// set�����޸�list���ϵĵ�1��λ��Ԫ��ֵΪhaha�����list
		list.set(0, "haha");
		System.out.println("set()�����޸�list���ϵĵ�1��λ��Ԫ��ֵΪhaha��" + list);
		// add������list���ϵĵ�1��λ��ǰ����һ��Ԫ��QQ�����list
		list.add(0, "QQ");
		System.out.println("add()������list���ϵĵ�1��λ��ǰ����һ��Ԫ��QQ��" + list);

	}

}