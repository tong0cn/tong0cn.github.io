package demo;

import java.util.Scanner;

class OpenException extends Exception {} //��opex�̳���Exception

class  extends OpenException {} //��close�̳���open����Ȼ����ܲ�̫����

class NewException extends Exception {}

public class ArrayIndex {
	// ��Ȼ�ڹ����������쳣����һ�����õ����飬�����ǿ��Եġ�
	public ArrayIndex() throws OpenException {}//������
	//�����������飬ֻ��˵������ôһ������
	public void f() throws OpenException {} 
	public static void main(String[] args) {
	}
}

class NewClass extends ArrayIndex {
	public NewClass() throws OpenException {}
//	public void f() {} //��֤���f���������׳��κ��쳣
//	public void f() throws CloseException{} //���׳�Close����Ҳ��ok�ģ���Ϊclose��open������
//	public void f() throws NewException{} //�ⲻ��
	public void f() throws OpenException{}
	public static void main(String[] args) {
		try {
		//��һ������ı���p = newһ������ı������������ǿ��Եģ������һ�����ǽ���up cast��
		//�����������ͣ�Upcast����
		ArrayIndex p  = new NewClass(); //ArrayIndex�Ķ�����������/ָ�����ʵ����������ı�����	
			p.f();
		} catch (OpenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



//	public static int open() {
////		int[] a = new int[10];
////		a[10] = 10;
//		return -1;
//	}
//	public static void readFile() throws OpenException, CloseException {
//		if ( open() == -1 ) {
//			throw new CloseException();
//		}
//	}
//	
//	public static void main(String[] args) {
//		try {
//			readFile();
//		} catch (NullPointerException e) {
//			// TODO Auto-generated catch block
//		} catch (CloseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("Close");
//		} catch (OpenException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("Open");
//		} 
//				
//	}
//}




//public static void f() {
//	int[] a = new int[10];
//	a[10] = 10;
//}

//int[] a = new int[10];	//һ��0~9������
////��Ϊ������±��Ǵ�0��ʼ�ŵģ������������õ��������±���ʵ��a[9]����a[10]
//int idx;
//Scanner in = new Scanner(System.in); //һ������
//idx = in.nextInt();
//try {
//	a[idx] = 10; //����Խ��
//	System.out.println("hello");
//} catch (ArrayIndexOutOfBoundsException e) {
//	System.out.println("Caught"); //˵׽����
//}