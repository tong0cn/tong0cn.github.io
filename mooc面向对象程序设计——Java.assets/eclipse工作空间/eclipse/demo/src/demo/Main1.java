package demo;

import java.io.IOException;

public class Main1 {
	public static void main(String[] args) {
		//����������Ը���������������������ˡ���Ϊ�е�ʱ�򶼲�֪���ǲ��������������붫���ˡ�
		System.out.println("hello world"); 
		byte[] buffer = new byte[1024]; //һ���ֽڵ�����buffer����1k�ֽ���ô��
		try {
			//��һ�ε���Ҫ�����ٶ�������System.inȥ��һ��read��read��buffer��ͷȥ��
			//����ȥ��
			int len = System.in.read(buffer);
			//ȥ�������������buffer����Ĵ�0��ʼ��len���ֽ�������һ��String��
			String s = new String(buffer, 0 ,len);
			System.out.println("������"+len+"�ֽ�"); //��������˶����ֽ�
			System.out.println(s); //����������ַ���
			System.out.println("s�ĳ����ǣ�"+s.length()); //���s�ĳ���
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}
