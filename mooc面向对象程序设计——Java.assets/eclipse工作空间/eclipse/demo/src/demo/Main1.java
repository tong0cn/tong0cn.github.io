package demo;

import java.io.IOException;

public class Main1 {
	public static void main(String[] args) {
		//留着这个可以告诉我们这个程序跑起来了。因为有的时候都不知道是不是跑起来该输入东西了。
		System.out.println("hello world"); 
		byte[] buffer = new byte[1024]; //一个字节的数组buffer，有1k字节那么大。
		try {
			//这一次到底要读多少东西。让System.in去做一个read，read到buffer里头去。
			//试着去读
			int len = System.in.read(buffer);
			//去读：我们用这个buffer里面的从0开始的len个字节来构造一个String。
			String s = new String(buffer, 0 ,len);
			System.out.println("读到了"+len+"字节"); //输出读到了多少字节
			System.out.println(s); //输出读到的字符串
			System.out.println("s的长度是："+s.length()); //输出s的长度
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}
