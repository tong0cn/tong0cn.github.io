package java07;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;

public class Demo {
        public static void main(String[] args) {
           ExecutorService pool = new ThreadPoolExecutor(4, 8, 2, TimeUnit.MINUTES, new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());
           Scanner in = new Scanner(System.in);
            System.out.println("设置接收端口：");
           int port = in.nextInt();
           System.out.println("目标IP：");
           String toIP = in.next();
            System.out.println("目标端口：");
         int toPort = in.nextInt();
        System.out.println("您的昵称：");
         String name = in.next();
        pool.execute(new TalkReceive(port));
         pool.execute(new TalkSend(toIP, toPort, name));
    }

}