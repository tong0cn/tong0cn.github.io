package java0202;
//类结构的获取-子类
public class Class01 implements Class0101NA{
	private String name;
	private int age;
	// 无参构造方法
	public Class01() { }
	
	public Class01(String name) {
		this.name = name; //设置name属性
	}
	
	public Class01(String name, int age) {
		this(name);
		this.age = age;
	}
	
	//重写父类方法
	public void sayChina() {
		System.out.println("作者：" + AUTHOR + ". 国际：" + NATIONAL);
	}
	public String sayHello(String name, int age) {
		return name + ". 你好！我今年：" + age + "岁了！";
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
		cl.sayHello("李华", 10);
		Class01 cl01 = new Class01("李四", 11);
		cl01.sayChina();
		
	}
	

}
