package java0203;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

// �ֽ������ת��Ϊ�ַ������
public class File05 {
	public static void main(String[] args) throws Exception {
		try {
			//���������
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Adam\\eclipse\\java-2021-06\\eclipse\\java02\\files\\test.txt");
			OutputStreamWriter os = new OutputStreamWriter(fos);
			BufferedWriter bos = new BufferedWriter(os);
			
			//д����������
			char[] buf = new char[3];
			buf[0] = 'a';
			buf[1] = 'b';
			buf[2] = '|';
			bos.write(buf);
			
			//�ر������
			bos.close();
			os.close();
			fos.close();
		} catch (IOException e) {
			
		}

	}

}
