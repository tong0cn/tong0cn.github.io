package java06;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

//接收端
public class Receiver {

	public static void main(String[] args) throws IOException {
		// 1.建立socket连接。 创建接收端的Socket对象 DatagramSocket。
		DatagramSocket socket = new DatagramSocket(9957);
		// 2.创建数据。创建一个数据包，用于接收数据。
		DatagramPacket packet;
		byte[] bufferd = new byte[1024];
		while (true) {
			packet = new DatagramPacket(bufferd, 0, bufferd.length);
			// 3.调用方法接收数据。
			socket.receive(packet);
			// 4.解析数据包
			System.out.println(new String(packet.getData(), 0, packet.getLength()));
		} // 5.由于持久监听，就不需关闭资源。

	}

}
