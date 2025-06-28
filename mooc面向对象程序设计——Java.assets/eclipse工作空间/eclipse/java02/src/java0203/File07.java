package java0203;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// 使用字节缓冲流复制文件
public class File07 {
	public static void main(String[] args) throws Exception {
		BufferedInputStream input = new BufferedInputStream(new FileInputStream("C:\\Users\\Adam\\eclipse\\java-2021-06\\eclipse\\java02\\files\\study.txt"));
		BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Adam\\eclipse\\java-2021-06\\eclipse\\java02\\files\\study2.txt"));
		byte[] buffer = new byte[1024];
		int len = -1;
		while ((len=input.read(buffer))!=-1) {
			output.write(buffer, 0, len);
		}
		input.close();
		output.close();

	}

}
