package java07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

//���Ͷ�Sender: TalkSend
//��Ϊ��Ҫ���̣߳�������Ҫʵ��Runnable�ӿ�
public class TalkSend  implements Runnable{
	// UDP�������ݱ�Ҫ��socket�����Լ�packet��һ���ַ���������ȡ��Ϣ
	private DatagramSocket socket;
	private DatagramPacket packet;
	private BufferedReader reader;
	//����Ŀ��IP��port�Լ��Լ����û���
	private String toIP;
	private int toPort;
	private String name;
	
	//��ʼ��
	public TalkSend(String toIP, int toPort, String name) {
		this.toIP = toIP;
		this.toPort = toPort;
		this.name = name;
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			socket = new DatagramSocket();
			socket.connect(new InetSocketAddress(toIP, toPort));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//���߳�run����
	@Override
	public void run() {
		// ��ѭ��������ȡ��������������������
		String s;
		while (true) {
			try {
				s = name + ": " + reader.readLine();
				packet = new DatagramPacket(s.getBytes(), 0, s.getBytes().length);
				socket.send(packet);
				if (s.endsWith(": bye")) {
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		socket.close();
	}
	

}