package demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main2 {
	public static void main(String[] args) {
		//����������Ը���������������������ˡ���Ϊ�е�ʱ�򶼲�֪���ǲ��������������붫���ˡ�
		System.out.println("hello world"); 
		// ����һ���ֽ�����
		byte[] buf = new byte[10];
		for ( int i=0; i<buf.length; i++ ) { //����һ���ֽ�����
			buf[i] = (byte)i; //��i�Լ�
		} //��������֮��������ŵľ���0~9����������
		try {
//			//��һ��FileOutputStream�Ķ��� ȥ������һ`DataOutputStream��
//			//Ҳ����˵��FileOutputStream�ĺ���ȥ����һ�ڹ�������
//			DataOutputStream out = new DataOutputStream(
//					new BufferedOutputStream( //����������������������м�һ������
			//����������Ҫ����һ��PrintWriter�����ԾͲ���Ҫ֮ǰ���Ǹ�DataOutput��
			PrintWriter out = new PrintWriter(
					new BufferedWriter( //���ǿ����ټ�һ��reader/writer���ƵĻ���
						//��ΪPrintWriter�Ǵ���Unicode�����ǲ�ϣ�������������м�Ҫ��һ�����ɣ�
							new OutputStreamWriter(
							new FileOutputStream("a.txt")))); //��Ϊ����Ҫд�ı���
			//һ��ʮ�����Ƶ����飬��Ȼ����ȥ����Ӣ����ĸ�����ⶼ��16���ƺϷ���Ӣ����ĸ��
//			int i = 0xcafebabe;
			int i = 123456;
//			out.write(buf); //��outȥwrite��������buffer���鶼д��ȥ��
//			out.writeInt(i); //�����Ǽ򵥵�write�ˣ���writeһ��int
			out.println(i);
			out.close();
//			DataInputStream in = new DataInputStream(
//					new BufferedInputStream(
//							new FileInputStream("a.dat")));
//			int j = in.readInt();
//			System.out.println(j); 
			BufferedReader in = new BufferedReader(
					new InputStreamReader(
					//���ǾͲ�������a.txt`����̫���ˡ�����ʵ�����������ڵ����Դ�����ļ�
							new FileInputStream("src/demo/Main2.java")));
			//readLine�᷵��һ��String��Ҳ����˵������һ�У�Ȼ�����һ���е����ݣ�
			//���һ��String���ػ����������أ��������������ĩβ���᷵��һ��null
			//����˵���������˵��Ҫ�������ļ��������������Ǿ�������ô�ɣ�
			String line;
			// ÿ�ζ�һ���н��������û�������ļ�ĩβ��line���ŵľ����µ���һ��
			while ( (line=in.readLine() )!= null ) {
				System.out.println(line);
			} //�����null�Ǿ�˵���������ļ���ĩβ��
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
}
