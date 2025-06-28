package coins;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
	private HashMap<Integer, String> coinnames = new HashMap<Integer, String>();
	// 这是一个hash表，是一种数据结构，这里面所有的东西是以一对值放进去的，一个叫做key就是它的键，一个叫做value就是它的值。
	
	// 构造器。用来初始化数据
	public Coin() {
		coinnames.put(1, "penny");
		// 1不必带有引号""，因为一个包裹类型的变量可以直接接收它所对应的基础类型的变量。
		coinnames.put(10, "dime");
		coinnames.put(25, "quarter");
		coinnames.put(50, "half-dolar");
		coinnames.put(50, "五毛");
		System.out.println(coinnames.keySet().size()); //结果会是4
		System.out.println(coinnames); //我们前面的容器都是可以直接输出的，这个也是一样。
		// 遍历hash表
		for ( Integer k : coinnames.keySet() ) { //让它自己列出所有的key，然后我遍历所有的key
			String s = coinnames.get(k); //把每一个key让hash表拿出它的value
			System.out.println(s);	//输出
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
