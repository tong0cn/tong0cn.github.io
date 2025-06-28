package java04;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

//�ͻ��� ��Ϊ��C/S�ܹ�������Ҫ��һ���ͻ��˺�һ������ˡ�
public class Client { 
	public static void main(String[] args) {
		try {
			// ����Ҫ��һ��Ŀ�꣬����һ������˷�����Ϣ
			InetSocketAddress serverIP = new InetSocketAddress("127.0.0.1", 8888);
			// ����Ŀ�������󣬾Ϳ��Խ�������
			Socket socket = new Socket();
			socket.connect(serverIP);
			//�Ѿ��������ˣ��Ϳ��Է������ݣ�����I/O��
			OutputStream os = socket.getOutputStream();
			PrintStream ps = new PrintStream(os);
			Scanner in = new Scanner(System.in);
			while (true) {
				System.out.println("��������Ϣ��");
				ps.println(in.nextLine());
				ps.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
