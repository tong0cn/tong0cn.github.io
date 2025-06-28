package notebook;

import java.util.ArrayList; //����������һ���࣬���������java.util�����������������������ֽ���ArrayList���������������־���ArrayList��

class Value {
	private int i;
	public void set(int i) { this.i = i; }
	public int get() (return i;)
}

public class Notebook {
	private ArrayList<String> notes = new ArrayList<String>();//������Ҫ:��һ����Ա���������ֽ���notes���������ͽ�ʲô�أ�ArrayList
	// �����ArrayList<String>��ArrayList of String���������String��һ��ArrayList�������������࣬��һ��������
	
	
	// ���������
	public void add(String s) {
		notes.add(s); //ArrayList��һ����������add������һ��String����add��ȥ�ˡ�
		
	}
	
	public void add(String s, int location) { //����Ԫ�ء��ڶ���add����String�ӵ�ĳ��λ��/����Ԫ�ص�ǰ��ȥ
		notes.add(location, s);
	}
	
	public int getSize() {
		return notes.size(); //����������һ����������size�����Լ���֪������ͷ���˶��ٶ�����ȥ�����Զ����Ա����size��Ȼ��add��ʱ��size++��������return size��һ�����취��
	}
	
	public String getNote(int index) {
		return notes.get(index); //�����������±���index��ͷ�Ķ���
	}

	public void removeNote(int index) { //boolean��ʾ������û�а���ɾ�ɹ�
		notes.remove(index); //���濴��ȥreturn notes.remove(index);���ɣ����ⲻ��һ����Ҫreturn�Ķ�����
	}
	
	public String[] list() {//�����е�note�г����Ķ�����������������ƣ�1.������ֵ��ֱ��������System.out�����2.����һ��String�����飬�����е����ݷ���һ��String�����ﷵ�ػ�ȥ��String[]��ô������һ��������������ֻ�������ݱ���
		String[] a = new String[notes.size()]; //����Ҫ��һ��String[]��notes.size�����������Ҫ���
//		for ( int i=0; i<notes.size(); i++ ) {
//			a[i] = notes.get(i);
//		}
		notes.toArray(a); //�����滻�������forѭ������a��toArray����������ǰ�a������
		return a;
	}
	
	public static void main(String[] args) {
		//add,getSize���������
		String[] a = new String[2];
		a[0] = "first";
		a[1] = "second";
		Notebook nb = new Notebook();
		nb.add("first");
		nb.add("second");
		nb.add("third", 1);
		System.out.println(nb.getSize());
		//getNote���������
		System.out.println(nb.getNote(0));
		System.out.println(a[0]);
//		System.out.println(nb.getNote(10)); //�ᱨ��
		//add(String s, int location)������� nb.add("third", 1);
		System.out.println(nb.getNote(1));
		//removeNote()����
		nb.removeNote(1);
		String[] aa = nb.list();
		for ( String s : aa) {
			System.out.println(s);
		}
		
//		Value[] a = new Value[10];
//		for ( int i=0; i<a.length; i++ ) { //��ʼ��
//			a[i] = new Value();
//			a[i].set(i);
//		}
//		for ( Value v : a ) {
//			System.out.println(v.get());
//		}
		
//		ArrayList<String> a = new ArrayList<String>();
//		a.add("first");
//		a.add("second");
//		for ( String s : a ) {
//			System.out.println(s);
//		}
	}
}
