package java0203;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

// 字符流读写 
public class File04 {
	// BufferedWrite类是Writer类的子类，效率比OutputStreamWrite类高
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("C:\\Users\\Adam\\eclipse\\java-2021-06\\eclipse\\java02\\files\\char02.txt");
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		//FileWriter类是OutputStreamWriter类的子类，OutputStreamWriter类是Writer类的子类
		//Writer writer = new FileWriter("E:/e.txt", true);
		//创建BufferedWriter类对象
		BufferedWriter bw = new BufferedWriter(writer);
		bw.write("qwertyu1");
		bw.write("asdfgh");
		bw.newLine();//换行
		bw.write("存放");
		System.out.println("文件写入完毕");
		bw.close();
	}

}
