package java05;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

//服务端 
public class Server {

	public static void main(String[] args) {
		try {
			// 1.设置端口，让客户端能找到
			ServerSocket server = new ServerSocket(9957);
			// 2.监听客户端的连接
			Socket socket = server.accept();
			// 3.文件输出 要文件流 接收数据 要字节流
			FileOutputStream fos = new FileOutputStream("地址");
			BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
			// 4.文件输出
			byte[] buffer = new byte[1024];
			int len;
			while ((len = bis.read(buffer)) != -1) {
				fos.write(buffer, 0, len);
			}
			// 5.给予客户端回应
			PrintStream ps = new PrintStream(socket.getOutputStream());
			ps.println("接收完毕！");
			// 6. 关闭通道
			fos.close();
			bis.close();
			socket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
