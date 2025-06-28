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

//����� 
public class Server {

	public static void main(String[] args) {
		try {
			// 1.���ö˿ڣ��ÿͻ������ҵ�
			ServerSocket server = new ServerSocket(9957);
			// 2.�����ͻ��˵�����
			Socket socket = server.accept();
			// 3.�ļ���� Ҫ�ļ��� �������� Ҫ�ֽ���
			FileOutputStream fos = new FileOutputStream("��ַ");
			BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
			// 4.�ļ����
			byte[] buffer = new byte[1024];
			int len;
			while ((len = bis.read(buffer)) != -1) {
				fos.write(buffer, 0, len);
			}
			// 5.����ͻ��˻�Ӧ
			PrintStream ps = new PrintStream(socket.getOutputStream());
			ps.println("������ϣ�");
			// 6. �ر�ͨ��
			fos.close();
			bis.close();
			socket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
