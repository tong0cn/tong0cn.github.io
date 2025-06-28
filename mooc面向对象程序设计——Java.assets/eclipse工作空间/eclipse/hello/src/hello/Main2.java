package hello;

import java.util.Scanner;

public class Main2 {
	//求素数
	
	public static boolean isPrime(int i)	//一个叫做isPrime的函数，它需要一个int的i作为输入
	{
		boolean isPrime = true;
		for ( int k=2; k<i; k++)
		{
			if ( i % k == 0)
			{
				isPrime = false;
				break;
			}
		}
		return isPrime;	//在函数里面对i做计算，然后判断它是不是素数。
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);S
		int m = in.nextInt();
		int n = in.nextInt();
		if ( m==1 ) m=2;
		int cnt = 0;
		int sum = 0;
		for (int i=m; i<=n; i++)
		{
			//原：判断素数
			
			//原：做决定/计算
//			if ( isPrime )
			if ( isPrime(i) )//把i交给isPrime函数，然后让它进行计算，如果返回true，if继续下去；如果返回false，则再去看下一个
			{
				cnt++;
				sum+=i;
			}
		}
		System.out.println("在"+m+"和"+n+"之间有"+cnt+"个素数，总和为"+sum);


	}

}