package java06;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;

//���Ͷ� 
public class Sender {

	public static void main(String[] args) throws IOException {
		// 1.����socket���ӡ��������Ͷ˵�Socket���� DatagramSocket��
		DatagramSocket socket = new DatagramSocket();
		DatagramPacket packet;
		Scanner in = new Scanner(System.in);
		// 2.����Ҫ���͵����ݡ��������ݣ��������ݴ����
		String s;
		do { // 5.ʵ��ѭ������
			System.out.print("Say:");
			s = in.nextLine();
			packet = new DatagramPacket(s.getBytes(), 0, s.getBytes().length, new InetSocketAddress("127.0.0.1", 9957));
			// 3.���÷������͡�  ����DatagramSocket����ķ����������ݡ�
			socket.send(packet);
		} while (s.compareTo("exit") != 0);
		// 4.�ر���Դ���رշ��Ͷˡ�
		socket.close();
	}

}
