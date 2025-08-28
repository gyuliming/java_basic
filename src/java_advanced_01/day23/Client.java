package java_advanced_01.day23;

import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
//            socket.getRemoteSocketAddress();
            System.out.println("서버 접속 성공");
            socket.close();
            System.out.println("접속 해제");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



    }
}
