package java02;

public class HashSet06Person {
	private String name;
	private int age;
	
	public HashSet06Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// ��дhashcode����������name���ԵĹ�ϣֵ
	public int hashCode() {
		return name.hashCode();
	}
	// ��дequals����
	public boolean equals(Object obj) {
		if(this == obj) return false;
		else return false;
	}
	// ��дtoString����
	public String toString() {
		return "Person " + name + age;
	}
}
