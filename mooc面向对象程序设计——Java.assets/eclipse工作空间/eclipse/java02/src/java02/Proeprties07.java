package java02;

import java.util.Properties;

// Proeprties����
public class Proeprties07 {
	public static void main(String[] args) {
		// �������϶���
		Properties prop = new Properties();
		// ���Ԫ��
		prop.setProperty("����"�� "������");
		prop.setProperty("����"�� "˯���");
		prop.setProperty("����"�� "�򶹶�");
		// ����Proeprties�����е�Ԫ��
		System.getProperties().list(System.out);
	}

}
