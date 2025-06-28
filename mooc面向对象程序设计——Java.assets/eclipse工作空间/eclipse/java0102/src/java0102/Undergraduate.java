package java0102;

public class Undergraduate extends Student{
	private String degree = " ";
	
	public Undergraduate(String name, int age, String degree) {
		super(name, age);
		this.degree = degree;
	}
	
	@Override
	public void show() {
		System.out.println("name: "+name+"\t age:"+age+"\t degree:"+degree);
	}
	
	public static void main(String[] args) {
		Undergraduate un = new Undergraduate("李四", 19, "本科");
		un.show();
	}

}
