package java0201;
// �������ʹ��
public class Generics0101 {
	public static void main(String[] args) {
		GenericBox<Integer> intBox = new GenericBox<Integer>();
		intBox.set(10);
		System.out.println(intBox.get());
	}

}
