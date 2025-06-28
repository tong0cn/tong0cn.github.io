package demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main2 {
	public static void main(String[] args) {
		//留着这个可以告诉我们这个程序跑起来了。因为有的时候都不知道是不是跑起来该输入东西了。
		System.out.println("hello world"); 
		// 构造一个字节数组
		byte[] buf = new byte[10];
		for ( int i=0; i<buf.length; i++ ) { //遍历一下字节数组
			buf[i] = (byte)i; //放i自己
		} //这样做完之后数组里放的就是0~9这样的数据
		try {
//			//用一个FileOutputStream的对象 去构造了一`DataOutputStream。
//			//也就是说在FileOutputStream的后面去套了一节过滤器。
//			DataOutputStream out = new DataOutputStream(
//					new BufferedOutputStream( //过滤器，在流的输出过程中加一个缓冲
			//我们最终所要的是一个PrintWriter，所以就不需要之前的那个DataOutput了
			PrintWriter out = new PrintWriter(
					new BufferedWriter( //还是可以再加一个reader/writer机制的缓冲
						//因为PrintWriter是处理Unicode，我们不希望这样，所以中间要加一个过渡：
							new OutputStreamWriter(
							new FileOutputStream("a.txt")))); //因为现在要写文本了
			//一个十六进制的数组，虽然看上去都是英文字母，但这都是16进制合法的英文字母。
//			int i = 0xcafebabe;
			int i = 123456;
//			out.write(buf); //让out去write。把整个buffer数组都写出去。
//			out.writeInt(i); //不再是简单的write了，是write一个int
			out.println(i);
			out.close();
//			DataInputStream in = new DataInputStream(
//					new BufferedInputStream(
//							new FileInputStream("a.dat")));
//			int j = in.readInt();
//			System.out.println(j); 
			BufferedReader in = new BufferedReader(
					new InputStreamReader(
					//我们就不让它打开a.txt`，那太简单了。这其实就是我们现在的这个源代码文件
							new FileInputStream("src/demo/Main2.java")));
			//readLine会返回一个String。也就是说它读了一行，然后把这一整行的内容，
			//变成一个String返回回来。而且呢，如果读到了流的末尾，会返回一个null
			//所以说常见的如果说想要把整个文件都读出来，我们经常会这么干：
			String line;
			// 每次读一整行进来，如果没有遇到文件末尾：line管着的就是新的那一行
			while ( (line=in.readLine() )!= null ) {
				System.out.println(line);
			} //如果是null那就说明读到了文件的末尾。
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
}
