package java0203;

import java.io.File;
// 通过构造函数创建File对象
public class File01 {
	public static void main(String[] args) {
		File filel = new File("D:\\eclipse-workspace\\a.txt");
		System.out.println(filel);
		File file2 = new File("D:\\eclipse-workspace", "a.txt");
		System.out.println(file2);
		File dir = new File("D:\\eclipse-workspace");
		File file4 = new File(dir, "a.txt");
		System.out.println(file4);

	}

}
