package java06;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

//���ն�
public class Receiver {

	public static void main(String[] args) throws IOException {
		// 1.����socket���ӡ� �������ն˵�Socket���� DatagramSocket��
		DatagramSocket socket = new DatagramSocket(9957);
		// 2.�������ݡ�����һ�����ݰ������ڽ������ݡ�
		DatagramPacket packet;
		byte[] bufferd = new byte[1024];
		while (true) {
			packet = new DatagramPacket(bufferd, 0, bufferd.length);
			// 3.���÷����������ݡ�
			socket.receive(packet);
			// 4.�������ݰ�
			System.out.println(new String(packet.getData(), 0, packet.getLength()));
		} // 5.���ڳ־ü������Ͳ���ر���Դ��

	}

}
