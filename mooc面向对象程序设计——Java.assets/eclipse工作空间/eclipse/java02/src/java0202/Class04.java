package java0202;

import java.lang.reflect.Constructor;

// ͨ��getConstructors()����ȡ��ȫ�����췽��
public class Class04 {
	public static void main(String[] args) {
		Class<?> c1 = null; // ����class����
		try {
			c1 = Class.forName("Text3.Person"); // ʵ��������
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Constructor<?> con[] = c1.getConstructors(); // ȡ��һ�����췽��
		for (int i=0; i<con.length; i++) {
			System.out.println("���췽����" + con[i]); //����ӿ�
		}
	}
}
