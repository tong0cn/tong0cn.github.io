package java0202;
// ͨ��getInterfaces()����ȡ������ʵ�ֵĽӿ�
public class Class02 {
	public static void main(String[] args) {
		Class<?> c1 = null; // ����class����
		try {
			c1 = Class.forName("Text3.Person"); // ʵ��������
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class<?> c[] = c1.getInterfaces(); // ���������ʽ����ʵ�ֵ�ȫ���ӿ�
		for (int i=0; i<c.length; i++) {
			System.out.println("ʵ�ֵĽӿ��У�" + c[i].getName()); //����ӿ�
		}
	}

}
