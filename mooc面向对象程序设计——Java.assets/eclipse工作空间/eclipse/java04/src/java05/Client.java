package java05;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;

//客户端
public class Client {

	public static void main(String[] args) {
		try {
			// 首先要有一个目标，向哪一个服务端发送消息
			InetSocketAddress serverIP = new InetSocketAddress("127.0.0.1", 9957);
			// 1.建立连接
			Socket socket = new Socket();
			socket.connect(serverIP);
			// 2.传文件
			FileInputStream fos = new FileInputStream("地址");
			// 3.要有字节流，传输数据给服务器
			BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
			byte[] buffer = new byte[1024];
			int len;
			
			// 4.发送文件
			while ((len = fos.read(buffer)) != -1) {
				bos.write(buffer, 0, len);
			}
			// 5.获取服务端响应
			socket.shutdownInput();  // 关闭输出通道
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println(bufferedReader.readLine());
			// 6. 关闭通道
			fos.close();
			bos.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
