package hello;

import java.util.Scanner;

public class Main2 {
	//������
	
	public static boolean isPrime(int i)	//һ������isPrime�ĺ���������Ҫһ��int��i��Ϊ����
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
		return isPrime;	//�ں��������i�����㣬Ȼ���ж����ǲ���������
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
			//ԭ���ж�����
			
			//ԭ��������/����
//			if ( isPrime )
			if ( isPrime(i) )//��i����isPrime������Ȼ���������м��㣬�������true��if������ȥ���������false������ȥ����һ��
			{
				cnt++;
				sum+=i;
			}
		}
		System.out.println("��"+m+"��"+n+"֮����"+cnt+"���������ܺ�Ϊ"+sum);


	}

}