package java0203;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// 序列化
public class File08 {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("stu.object");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		File0801 stu = new File0801("张三", 23);
		oos.writeObject(stu);
		oos.close();
	}

}
