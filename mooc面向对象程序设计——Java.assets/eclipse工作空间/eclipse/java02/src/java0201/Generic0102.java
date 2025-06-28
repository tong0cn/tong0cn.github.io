package java0201;
//���ͷ�����ʹ��
public class Generic0102 {
	//���巺�ͷ���
	 public static <T> void printArray(T[] inputArray) {
	    for (T element : inputArray) {
	         System.out.printf("%s ", element);
	    }
	    System.out.println();
	}
	//���÷��ͷ���
	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3, 4, 5};
		String[] strArray = {"Hello", "World"};
		Generic0102.<Integer>printArray(intArray); // ���: 1 2 3 4 5 
		Generic0102.<String>printArray(strArray);  // ���: Hello World 

	}

}
