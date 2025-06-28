package hello;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Main {

	public static void main(String[] args) {
		try {
			//Ҫȥ��һ������������Ҫ��һ�������socket��
			Socket socket = new Socket(InetAddress.getByName("localhost"), 12345); //����һ��socket�Ķ��󣬽�����������ʱ��Ҫ����һЩ��������Ϊ����Ҫȥ��һ��������������Ҫ�������������ĵ�ַ���ģ����������Ǹ��˿��Ƕ��١�һ��������Ϣ��
			//�����ͽ�������һ�����ӡ�������ӻ��������ص�һ��12345�˿ڡ�������ӳɹ���������������ô���socket�͵õ����������������Ӳ��ܹ�������������ô�����new�Ĺ��̵������ͻ����쳣����ô����ͻ���exception��catch���쳣�������ӹ��ˡ�
		
			//���ͣ�����Ҫд�ı�����Ҫ��һ��PrintWriter
			PrintWriter out = new PrintWriter( 
					new BufferedWriter(		// PrintWriter������һ��BufferedWriter������
							new OutputStreamWriter(		// BufferedWriter������һ��OutputStreamWriter�Ļ�����
									socket.getOutputStream())));// ����OutputStreamWriter��֮ǰ����������˵����Ҫ�и�fileoutofthedream����һ���ļ�������д�����������������ǲ���Ҫд�ļ�����Ҫ����д��Զ�˵ķ�����ȥ��������socket.getOutputStream()
									// ��socket��getOutputStreamȥ�õ�һ��stream��Ҳ����˵��������ʵ���������ǵ�socket�ͷ���������Ժ�����ȥͨ����������õ���һ�������������������������κ��ļ��ϵģ�������������ҵ��������ͷ�����Ǹ�����֮��������������ӡ�
			
			//��������������ӵĻ����ϣ����Ǿ͹�����һ��right���������ǾͿ����Ͷ�����ȥ��
			out.println("Hello");//����hello
			out.flush();
			
			//���գ���Ҫ��һ��BufferedReader
			BufferedReader in = new BufferedReader( 
					new InputStreamReader( //BufferedReader������InputStreamReader�Ļ�����
							socket.getInputStream())); //InputStream����socket��һ��getInputStream�Ļ����Ͻ��������ġ�
			String line;//��һ��line����
			line = in.readLine();
			System.out.println(line);
			
			out.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
