package java0202;
//��ṹ�Ļ�ȡ-����
public class Class01 implements Class0101NA{
	private String name;
	private int age;
	// �޲ι��췽��
	public Class01() { }
	
	public Class01(String name) {
		this.name = name; //����name����
	}
	
	public Class01(String name, int age) {
		this(name);
		this.age = age;
	}
	
	//��д���෽��
	public void sayChina() {
		System.out.println("���ߣ�" + AUTHOR + ". ���ʣ�" + NATIONAL);
	}
	public String sayHello(String name, int age) {
		return name + ". ��ã��ҽ��꣺" + age + "���ˣ�";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
	public static void main(String[] args) { 
		Class01 cl = new Class01();
		cl.sayChina();
		cl.sayHello("�", 10);
		Class01 cl01 = new Class01("����", 11);
		cl01.sayChina();
		
	}
	

}
