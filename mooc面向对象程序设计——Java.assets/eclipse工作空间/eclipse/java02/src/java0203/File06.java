package java0203;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// 字节输入流转换为字符输入流
public class File06 {
	public static void main(String[] args) {
		try {
			//创建输入流
			FileInputStream fis = new FileInputStream("C:\\Users\\Adam\\eclipse\\java-2021-06\\eclipse\\java02\\files\\test.txt");
			InputStreamReader is = new InputStreamReader(fis);
			BufferedReader bis = new BufferedReader(is);
			//从输入流读取数据
			while (bis.ready()) {
				int c = bis.read();
				System.out.print((char)c);
			}
			//关闭输入流
			bis.close();
			is.close();
			fis.close();
		} catch (IOException e) {
			
		}
		

	}

}
