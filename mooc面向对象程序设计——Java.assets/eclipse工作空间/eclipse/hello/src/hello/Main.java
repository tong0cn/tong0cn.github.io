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
			//要去连一个服务器，需要有一个类叫做socket。
			Socket socket = new Socket(InetAddress.getByName("localhost"), 12345); //建立一个socket的对象，建立这个对象的时候要给它一些东西，因为我们要去连一个服务器，我们要告诉他服务器的地址在哪，服务器上那个端口是多少。一共两个信息。
			//这样就建立好了一个链接。这个链接会连到本地的一个12345端口。如果链接成功建立了起来，那么这个socket就得到了这个对象，如果链接不能够建立起来，那么在这个new的过程当中它就会抛异常，那么后面就会有exception有catch的异常机制来接管了。
		
			//发送：我们要写文本，需要有一个PrintWriter
			PrintWriter out = new PrintWriter( 
					new BufferedWriter(		// PrintWriter建筑在一个BufferedWriter基础上
							new OutputStreamWriter(		// BufferedWriter建筑在一个OutputStreamWriter的基础上
									socket.getOutputStream())));// 对于OutputStreamWriter，之前我们做的是说我们要有个fileoutofthedream（打开一个文件往里面写东西），但现在我们不是要写文件，是要让它写到远端的服务器去。所以用socket.getOutputStream()
									// 用socket的getOutputStream去得到一个stream。也就是说，在这里实际上是我们的socket和服务端连上以后，我们去通过这个函数得到了一个虚拟的流。这个流并不是在任何文件上的，这个流表达的是我的这个程序和服务端那个程序之间的那种网络链接。
			
			//在上面的网络链接的基础上，我们就构建了一个right，于是我们就可以送东西过去了
			out.println("Hello");//发送hello
			out.flush();
			
			//接收：需要有一个BufferedReader
			BufferedReader in = new BufferedReader( 
					new InputStreamReader( //BufferedReader建筑在InputStreamReader的基础上
							socket.getInputStream())); //InputStream是在socket的一个getInputStream的基础上建立起来的。
			String line;//读一个line进来
			line = in.readLine();
			System.out.println(line);
			
			out.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
