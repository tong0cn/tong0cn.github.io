package java0203;

import java.io.File;
// File��ĳ��÷���
public class File02 {
	public static void main(String[] args) {
		File file = new File("b.txt");
		System.out.println("absolutepath="+file.getAbsolutePath());
		System.out.println("path="+file.getPath());
		System.out.println("filename="+file.getName());
		System.out.println("size="+file.length());
	}

}
