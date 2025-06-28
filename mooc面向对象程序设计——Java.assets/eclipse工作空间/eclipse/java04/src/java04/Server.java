package java04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


//����� ��Ϊ��C/S�ܹ�������Ҫ��һ���ͻ��˺�һ������ˡ�
public class Server {

	public static void main(String[] args) {
		try {
			// Ҫ�ܱ��ͻ��������ӣ��˿ں�Ҫһ��
			ServerSocket server = new ServerSocket(8888);
			// ��������
			Socket socket = server.accept();
			// �����������Ժ󣬾Ϳ��Խ���������
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
