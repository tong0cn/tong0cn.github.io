package java02;

public class HashSet06Person {
	private String name;
	private int age;
	
	public HashSet06Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// 重写hashcode方法，返回name属性的哈希值
	public int hashCode() {
		return name.hashCode();
	}
	// 重写equals方法
	public boolean equals(Object obj) {
		if(this == obj) return false;
		else return false;
	}
	// 重写toString方法
	public String toString() {
		return "Person " + name + age;
	}
}
