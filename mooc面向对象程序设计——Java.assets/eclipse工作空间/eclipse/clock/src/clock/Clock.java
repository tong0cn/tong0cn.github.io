package clock;

public class Clock {
//	private Display hour;
//	private Display minute;
	//ע�⣺Ҫ�ر�С�ĵ��ǣ������ǰѴ���д������������ӣ�hour��һ����Ա������Display���������͡����ʱ��Display���������û�еġ�������������Ƕ���Ĺ����߶��������ߡ�
	//����������Ҫ������newһ��display��
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	//������������˵������һ�������һ��Clock�Ķ����������Ǿͻ�ȥ���������Display�Ķ���
	
	public void start() {//һ��start��������Ӿ�Ҫȥ���ˡ�
		while ( true ) {
			minute.increase();
			if (minute.getValue() == 0 ) {
				hour.increase();
			}
			System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue()); 
			//printf��ʾ˵����ʽ�������"%02d:%02d\n"�еġ�:�������̶�Ҫ��������ݣ���%02d����ʾ���λ��Ҫ���һ�����������������һ��ռ�������ַ���λ�õģ������ֻ�и�λ����Ҫ�����0����䡣
		}
	}
	
	//�����������������������Ǹ�main������
	public static void main(String[] args) {
		Clock clock =new Clock();
		clock.start();
	}

}
