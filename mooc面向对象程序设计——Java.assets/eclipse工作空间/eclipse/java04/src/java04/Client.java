package java04;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

//客户端 因为是C/S架构，所以要有一个客户端和一个服务端。
public class Client { 
	public static void main(String[] args) {
		try {
			// 首先要有一个目标，向哪一个服务端发送消息
			InetSocketAddress serverIP = new InetSocketAddress("127.0.0.1", 8888);
			// 有了目标主机后，就可以建立连接
			Socket socket = new Socket();
			socket.connect(serverIP);
			//已经连接上了，就可以发送数据，利用I/O流
			OutputStream os = socket.getOutputStream();
			PrintStream ps = new PrintStream(os);
			Scanner in = new Scanner(System.in);
			while (true) {
				System.out.println("请输入消息：");
				ps.println(in.nextLine());
				ps.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
