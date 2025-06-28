package java07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

//发送端Sender: TalkSend
//因为需要多线程，所以需要实现Runnable接口
public class TalkSend  implements Runnable{
	// UDP发送数据必要的socket连接以及packet和一个字符缓冲流读取消息
	private DatagramSocket socket;
	private DatagramPacket packet;
	private BufferedReader reader;
	//设置目标IP，port以及自己的用户名
	private String toIP;
	private int toPort;
	private String name;
	
	//初始化
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
	
	//多线程run方法
	@Override
	public void run() {
		// 死循环持续读取键盘输入流，持续发送
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