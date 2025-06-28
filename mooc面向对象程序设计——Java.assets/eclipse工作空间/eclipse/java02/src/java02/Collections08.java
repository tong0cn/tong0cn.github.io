package java02;

import java.util.ArrayList;
import java.util.Collections;

// Collections������
public class Collections08 {
	public static void main(String[] args) {
		// ��ʾ��ɫ������
		String[] colors = { "����", "����", "÷��", "����" };
		// ��ʾ����������
		String[] numbers = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		// ��һ���ƺ�
		ArrayList<String> array = new ArrayList<String>();
		array.add("����");
		array.add("С��");
		// ѭ��װ��
		for (String c : colors) {
			for (String n : numbers) {
				array.add(c.concat(n));
			}
		}
		// ϴ��
		Collections.shuffle(array);
		// ����
		ArrayList<String> linString = new ArrayList<String>();
		ArrayList<String> zhouString = new ArrayList<String>();
		ArrayList<String> meString = new ArrayList<String>();
		// ����ͨ��for
		for (int x = 0; x < array.size() - 3; x++) {
			if (x % 3 == 0) {
				linString.add(array.get(x));
			} else if (x % 3 == 1) {
				zhouString.add(array.get(x));
			} else if (x % 3 == 2) {
				meString.add(array.get(x));
			}
		}
		// ����
		System.out.println("linString��" + linString);
		System.out.println("zhouString��" + zhouString);
		System.out.println("meString��" + meString);
		// ������
		System.out.println("���ŵ��ƣ�");
		for (int x = array.size() - 3; x < array.size(); x++) {
			System.out.print(array.get(x) + " ");
		}
		
	
	}	
}
