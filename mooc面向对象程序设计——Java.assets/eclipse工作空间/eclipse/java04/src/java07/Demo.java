package java07;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;

public class Demo {
        public static void main(String[] args) {
           ExecutorService pool = new ThreadPoolExecutor(4, 8, 2, TimeUnit.MINUTES, new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());
           Scanner in = new Scanner(System.in);
            System.out.println("���ý��ն˿ڣ�");
           int port = in.nextInt();
           System.out.println("Ŀ��IP��");
           String toIP = in.next();
            System.out.println("Ŀ��˿ڣ�");
         int toPort = in.nextInt();
        System.out.println("�����ǳƣ�");
         String name = in.next();
        pool.execute(new TalkReceive(port));
         pool.execute(new TalkSend(toIP, toPort, name));
    }

}