package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// һ����
class Student implements Serializable{ //���ѧ����
	// ˽�е�����
	private String name;
	private int age;
	private int grade; //������
	
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public String toString() {
		return name+" "+age+" "+grade;
	}
}

public class Main {
	public static void main(String[] args) {
		try {
			Student s1 = new Student("John", 18, 5); //��һ��Student�Ķ���
			System.out.println(s1);
			//ObjectOutputStream��ֱ�ӰѶ����д���ļ��������Ҫ����������һ��ʵ������Ļ�����
			ObjectOutputStream out = new ObjectOutputStream(
					//ʵ�����������˵��һ��FileOutputStream
					new FileOutputStream("obj.dot"));
			// ���������֮�󣬾Ϳ����������������һ������writeObject�ĺ���
			out.writeObject(s1); //дs1��ȥ
			out.close(); //д����֮��Ҫclose��
			// ������
			ObjectInputStream in = new ObjectInputStream(
					//Ҳ�ǽ�����һ��FileInputStream�Ļ�����
					new FileInputStream("obj.dot"));
			// in����readObject��������Ҫ����һ��Student������readObject���ص�������Object,
			// ��Ȼ�������ڷǳ�ȷ����֪����������д���Ǹ�obj.dot����ȥ��һ����һ��Student,
			// �������ǿ���ֱ����һ��cast˵��Ҫ����ת��Student��
			Student s2 = (Student)in.readObject();
			System.out.println(s2); //���һ�¿����ǲ����Ǹ�John
			in.close(); //��in��close��
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
