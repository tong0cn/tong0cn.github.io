package java0202;
// ͨ��getSuperclass()ȡ�ø���
public class Class03 {
	public static void main(String[] args) {
		Class<?> c1 = null; // ����class����
		try {
			c1 = Class.forName("org.w3c.dom.Text3.Person"); // ʵ��������
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class<?> c2 = c1.getSuperclass(); // ȡ�ø���
		System.out.println("�������ƣ�" + c2.getName()); //����ӿ�
	}
}
