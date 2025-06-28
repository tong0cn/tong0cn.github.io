package java0203;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

// ∑¥–Ú¡–ªØ
public class File09 {
	public static void main(String[] args) throws Exception{
		FileInputStream input = new FileInputStream("stu.object");
		ObjectInputStream ois = new ObjectInputStream(input);
		File0801 stu = (File0801)ois.readObject();
		System.out.println(stu.toString());
		ois.close();
	}

}
