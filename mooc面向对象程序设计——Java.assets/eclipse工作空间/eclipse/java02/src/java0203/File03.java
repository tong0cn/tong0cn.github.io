package java0203;

import java.io.FileInputStream;
import java.io.IOException;
// 字节流读写
public class File03 {
	public static void main(String[] args) throws IOException{
		// 1.创建字节输入流对象
		FileInputStream fis = new FileInputStream("C:\\Users\\Adam\\eclipse\\java-2021-06\\eclipse\\java02\\files\\char01.txt");
		// 2.循环读取文件中的数据
		int i;
		// 2.1 左循环中不断地调用read方法，并将读取到的数据给i复制，只要没有读到-1，说明没有读到文件末尾。
		while (true) {
			try {
				if (!((i = fis.read())!=-1)) break;
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			System.out.println((char)i);
		}
		// 3.关闭流释放资源
		fis.close();

	}

}
