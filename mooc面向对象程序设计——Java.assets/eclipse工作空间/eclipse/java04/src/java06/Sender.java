package java06;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;

//发送端 
public class Sender {

	public static void main(String[] args) throws IOException {
		// 1.建立socket连接。创建发送端的Socket对象 DatagramSocket。
		DatagramSocket socket = new DatagramSocket();
		DatagramPacket packet;
		Scanner in = new Scanner(System.in);
		// 2.创建要发送的数据。创建数据，并将数据打包。
		String s;
		do { // 5.实现循环输入
			System.out.print("Say:");
			s = in.nextLine();
			packet = new DatagramPacket(s.getBytes(), 0, s.getBytes().length, new InetSocketAddress("127.0.0.1", 9957));
			// 3.调用方法发送。  调用DatagramSocket对象的方法发送数据。
			socket.send(packet);
		} while (s.compareTo("exit") != 0);
		// 4.关闭资源。关闭发送端。
		socket.close();
	}

}
