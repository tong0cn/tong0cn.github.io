package java0102;

public  class Student {
	String name = "";
	int age = 0;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void show() { //abstract
		 System.out.println("name��" + name + "\t age��" + age);
	}
	
	public static void main(String[] args) {
		Student stu = new Student("����", 18);
		stu.show();
	}

}

