package java0203;

import java.io.FileInputStream;
import java.io.IOException;
// �ֽ�����д
public class File03 {
	public static void main(String[] args) throws IOException{
		// 1.�����ֽ�����������
		FileInputStream fis = new FileInputStream("C:\\Users\\Adam\\eclipse\\java-2021-06\\eclipse\\java02\\files\\char01.txt");
		// 2.ѭ����ȡ�ļ��е�����
		int i;
		// 2.1 ��ѭ���в��ϵص���read������������ȡ�������ݸ�i���ƣ�ֻҪû�ж���-1��˵��û�ж����ļ�ĩβ��
		while (true) {
			try {
				if (!((i = fis.read())!=-1)) break;
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			System.out.println((char)i);
		}
		// 3.�ر����ͷ���Դ
		fis.close();

	}

}
