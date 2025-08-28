package java_advanced_01.day23;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            serverSocket.accept();
            System.out.println("서버와 연결이 되었습니다.");
            serverSocket.close();
            System.out.println("서버와 연결 해제");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
