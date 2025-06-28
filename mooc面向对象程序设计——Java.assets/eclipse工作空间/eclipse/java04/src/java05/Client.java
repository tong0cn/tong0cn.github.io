package java05;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;

//�ͻ���
public class Client {

	public static void main(String[] args) {
		try {
			// ����Ҫ��һ��Ŀ�꣬����һ������˷�����Ϣ
			InetSocketAddress serverIP = new InetSocketAddress("127.0.0.1", 9957);
			// 1.��������
			Socket socket = new Socket();
			socket.connect(serverIP);
			// 2.���ļ�
			FileInputStream fos = new FileInputStream("��ַ");
			// 3.Ҫ���ֽ������������ݸ�������
			BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
			byte[] buffer = new byte[1024];
			int len;
			
			// 4.�����ļ�
			while ((len = fos.read(buffer)) != -1) {
				bos.write(buffer, 0, len);
			}
			// 5.��ȡ�������Ӧ
			socket.shutdownInput();  // �ر����ͨ��
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println(bufferedReader.readLine());
			// 6. �ر�ͨ��
			fos.close();
			bos.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
