package java0203;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// �ֽ�������ת��Ϊ�ַ�������
public class File06 {
	public static void main(String[] args) {
		try {
			//����������
			FileInputStream fis = new FileInputStream("C:\\Users\\Adam\\eclipse\\java-2021-06\\eclipse\\java02\\files\\test.txt");
			InputStreamReader is = new InputStreamReader(fis);
			BufferedReader bis = new BufferedReader(is);
			//����������ȡ����
			while (bis.ready()) {
				int c = bis.read();
				System.out.print((char)c);
			}
			//�ر�������
			bis.close();
			is.close();
			fis.close();
		} catch (IOException e) {
			
		}
		

	}

}
