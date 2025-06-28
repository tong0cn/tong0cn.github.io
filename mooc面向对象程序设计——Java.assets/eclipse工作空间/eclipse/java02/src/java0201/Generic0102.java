package java0201;
//泛型方法的使用
public class Generic0102 {
	//定义泛型方法
	 public static <T> void printArray(T[] inputArray) {
	    for (T element : inputArray) {
	         System.out.printf("%s ", element);
	    }
	    System.out.println();
	}
	//调用泛型方法
	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3, 4, 5};
		String[] strArray = {"Hello", "World"};
		Generic0102.<Integer>printArray(intArray); // 输出: 1 2 3 4 5 
		Generic0102.<String>printArray(strArray);  // 输出: Hello World 

	}

}
