package java04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


//服务端 因为是C/S架构，所以要有一个客户端和一个服务端。
public class Server {

	public static void main(String[] args) {
		try {
			// 要能被客户端所链接，端口号要一致
			ServerSocket server = new ServerSocket(8888);
			// 建立链接
			Socket socket = server.accept();
			// 建立好链接以后，就可以接受数据了
			InputStream is = socket.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			String s;
			while ((s = rd.readLine()) != null) {
				System.out.println(new Date() + "\n" + s);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
