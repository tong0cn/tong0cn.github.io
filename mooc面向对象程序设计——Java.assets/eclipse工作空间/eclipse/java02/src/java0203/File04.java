package java0203;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

// �ַ�����д 
public class File04 {
	// BufferedWrite����Writer������࣬Ч�ʱ�OutputStreamWrite���
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("C:\\Users\\Adam\\eclipse\\java-2021-06\\eclipse\\java02\\files\\char02.txt");
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		//FileWriter����OutputStreamWriter������࣬OutputStreamWriter����Writer�������
		//Writer writer = new FileWriter("E:/e.txt", true);
		//����BufferedWriter�����
		BufferedWriter bw = new BufferedWriter(writer);
		bw.write("qwertyu1");
		bw.write("asdfgh");
		bw.newLine();//����
		bw.write("���");
		System.out.println("�ļ�д�����");
		bw.close();
	}

}
