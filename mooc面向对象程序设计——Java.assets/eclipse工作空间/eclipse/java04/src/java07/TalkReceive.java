package java07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

//接收端Receiver: TalkReceive
public class TalkReceive implements Runnable {
	//UDP接收数据需要socket连接packet
	private DatagramSocket socket;
	private DatagramPacket packet;
	//接受的端口
	private int myPort;
	
	//初始化
	public TalkReceive(int myPort) {
		this.myPort = myPort;
		try {
			socket = new DatagramSocket(myPort);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//多线程run方法
	@Override
	public void run() {
		// 死循环持续监听消息
		String s;
		byte[] buffered = new byte[1024];
		while (true) {
			try {
				packet = new DatagramPacket(buffered, 0, buffered.length);
				socket.receive(packet);
			} catch (Exception e) {
				e.printStackTrace();
			}
			s = new String(packet.getData(), 0, packet.getLength());
			System.out.println(s);
			if (s.endsWith(": bye")) {
				break;
			}
		}

	}
}