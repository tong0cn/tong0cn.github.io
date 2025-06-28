package java0203;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

// 字节输出流转换为字符输出流
public class File05 {
	public static void main(String[] args) throws Exception {
		try {
			//创建输出流
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Adam\\eclipse\\java-2021-06\\eclipse\\java02\\files\\test.txt");
			OutputStreamWriter os = new OutputStreamWriter(fos);
			BufferedWriter bos = new BufferedWriter(os);
			
			//写入数据数组
			char[] buf = new char[3];
			buf[0] = 'a';
			buf[1] = 'b';
			buf[2] = '|';
			bos.write(buf);
			
			//关闭输出流
			bos.close();
			os.close();
			fos.close();
		} catch (IOException e) {
			
		}

	}

}
