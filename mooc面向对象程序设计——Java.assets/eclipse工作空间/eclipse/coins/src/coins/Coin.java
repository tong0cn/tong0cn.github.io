package coins;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
	private HashMap<Integer, String> coinnames = new HashMap<Integer, String>();
	// ����һ��hash����һ�����ݽṹ�����������еĶ�������һ��ֵ�Ž�ȥ�ģ�һ������key�������ļ���һ������value��������ֵ��
	
	// ��������������ʼ������
	public Coin() {
		coinnames.put(1, "penny");
		// 1���ش�������""����Ϊһ���������͵ı�������ֱ�ӽ���������Ӧ�Ļ������͵ı�����
		coinnames.put(10, "dime");
		coinnames.put(25, "quarter");
		coinnames.put(50, "half-dolar");
		coinnames.put(50, "��ë");
		System.out.println(coinnames.keySet().size()); //�������4
		System.out.println(coinnames); //����ǰ����������ǿ���ֱ������ģ����Ҳ��һ����
		// ����hash��
		for ( Integer k : coinnames.keySet() ) { //�����Լ��г����е�key��Ȼ���ұ������е�key
			String s = coinnames.get(k); //��ÿһ��key��hash���ó�����value
			System.out.println(s);	//���
		}
	}
	public String getName(int amount) {
//		switch (amount) {
//		case 10: return "dime";
//		}
		if ( coinnames.containsKey(amount) ) {
			return coinnames.get(amount);
		} else
			return "NOT FOUND";
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		Coin coin = new Coin();
		String name = coin.getName(amount);
		System.out.println(name);

	}

}
