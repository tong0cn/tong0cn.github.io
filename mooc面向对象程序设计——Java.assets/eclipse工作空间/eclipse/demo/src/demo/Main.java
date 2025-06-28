package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 一个类
class Student implements Serializable{ //表达学生的
	// 私有的属性
	private String name;
	private int age;
	private int grade; //打分情况
	
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
			Student s1 = new Student("John", 18, 5); //做一个Student的对象
			System.out.println(s1);
			//ObjectOutputStream：直接把对象给写进文件里，但它需要建立在另外一个实体的流的基础上
			ObjectOutputStream out = new ObjectOutputStream(
					//实体的流：比如说有一个FileOutputStream
					new FileOutputStream("obj.dot"));
			// 有了这个流之后，就可以在这个流上面做一个叫做writeObject的函数
			out.writeObject(s1); //写s1进去
			out.close(); //写完了之后要close掉
			// 读出来
			ObjectInputStream in = new ObjectInputStream(
					//也是建立在一个FileInputStream的基础上
					new FileInputStream("obj.dot"));
			// in可以readObject。我们想要读到一个Student，可是readObject返回的类型是Object,
			// 当然我们现在非常确定的知道：，我们写道那个obj.dot里面去的一定是一个Student,
			// 所以我们可以直接做一个cast说我要把你转成Student。
			Student s2 = (Student)in.readObject();
			System.out.println(s2); //输出一下看看是不是那个John
			in.close(); //把in给close掉
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
