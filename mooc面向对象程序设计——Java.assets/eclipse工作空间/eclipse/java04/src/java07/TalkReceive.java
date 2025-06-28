package java07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

//���ն�Receiver: TalkReceive
public class TalkReceive implements Runnable {
	//UDP����������Ҫsocket����packet
	private DatagramSocket socket;
	private DatagramPacket packet;
	//���ܵĶ˿�
	private int myPort;
	
	//��ʼ��
	public TalkReceive(int myPort) {
		this.myPort = myPort;
		try {
			socket = new DatagramSocket(myPort);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//���߳�run����
	@Override
	public void run() {
		// ��ѭ������������Ϣ
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