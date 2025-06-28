package clock;

//�������displayֻ�Ǳ�������ӵ��е���ôһ��С����������������Ȼ����Ϊ����һ��main���������Ǻ�����Կ�����ǳ����ã���Ϊ����������һ��display������ʵ��ϣ�������display�������ܹ���һ�����ԡ�
public class Display {
	//Display��������Ա��һ����value��һ����limit
	private int value = 0;
	private int limit = 0;
	//֮ǰ�����ᵽ��Java�����еĶ����ڹ�������ʱ��ÿһ����Ա��������õ�Ĭ�ϵ���ֵ�����Բ�д���0û��ϵ��������һ�ֺ�ϰ�ߣ����Լ���һ��ǿ��ǿ����ϰ�ߡ�

	private static int step = 1;
	
	//Display��Ҫһ�����캯������Ҫ�ڹ������Display��ʱ�����һ��limit��ÿһ��Display�����Լ���ͬ��limit�������ӵ��Ǹ���60�����Сʱ���Ǹ���24
	public Display(int limit) {//����limit�Ĺ��캯��
		this.limit = limit;
	}
	
	public void increase() {//������һ��
		value++;
		if ( value == limit ) {
			value = 0;
			
		}
	}
	
	public int getValue() {
		return value;//�������ڵ�valueֵ
	}
	
	public static void f() {
		
	}
	
	public static void main(String[] args) {
		//���ԣ�
//		Display d = new Display(24);
//		for ( ;; ) { //��һ������ѭ��
//			d.increase();
//			System.out.println(d.getValue());
//		}
		
		Display d1 = new Display(10);
		d1.step = 2;
		System.out.println(d1.step);
		Display d2 = new Display(20);
		System.out.println(d2.step);
		d1.increase();
//		increase(); //����
		f();
		d1.f();
		System.out.println(d1.getValue());
		System.out.println(d2.getValue());
		System.out.println(d1.step);
		System.out.println(d2.step);
		d1.step = 2;
		System.out.println(d1.step);
		System.out.println(d2.step);
		Display.step = 3;
		System.out.println(d1.step);
		System.out.println(d2.step);	
		
		
	}

}
