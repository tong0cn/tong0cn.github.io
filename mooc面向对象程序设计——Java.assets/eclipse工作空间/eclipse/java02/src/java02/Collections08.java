package java02;

import java.util.ArrayList;
import java.util.Collections;

// Collections工具类
public class Collections08 {
	public static void main(String[] args) {
		// 表示花色的数组
		String[] colors = { "黑桃", "红桃", "梅花", "方块" };
		// 表示点数的数组
		String[] numbers = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		// 找一个牌盒
		ArrayList<String> array = new ArrayList<String>();
		array.add("大王");
		array.add("小王");
		// 循环装牌
		for (String c : colors) {
			for (String n : numbers) {
				array.add(c.concat(n));
			}
		}
		// 洗牌
		Collections.shuffle(array);
		// 发牌
		ArrayList<String> linString = new ArrayList<String>();
		ArrayList<String> zhouString = new ArrayList<String>();
		ArrayList<String> meString = new ArrayList<String>();
		// 用普通的for
		for (int x = 0; x < array.size() - 3; x++) {
			if (x % 3 == 0) {
				linString.add(array.get(x));
			} else if (x % 3 == 1) {
				zhouString.add(array.get(x));
			} else if (x % 3 == 2) {
				meString.add(array.get(x));
			}
		}
		// 看牌
		System.out.println("linString：" + linString);
		System.out.println("zhouString：" + zhouString);
		System.out.println("meString：" + meString);
		// 看底牌
		System.out.println("三张底牌：");
		for (int x = array.size() - 3; x < array.size(); x++) {
			System.out.print(array.get(x) + " ");
		}
		
	
	}	
}
