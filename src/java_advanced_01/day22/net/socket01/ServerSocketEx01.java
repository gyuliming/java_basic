import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketEx01 {
    private static ServerSocket serverSocket = null;

    // 멀티 스레드 : main, startServer
    public static void main(String[] args) {
        System.out.println("---------Starting server socket---------");
        System.out.println("서버를 종료하려면 q 또는 Q 를 입력하고 Enter 를 입력하세요.");
        System.out.println("-".repeat(40));

        // TCP 서버 시작
        startServer();

        // 키보드 입력
        Scanner sc = new Scanner(System.in);
        while (true) {
            String key = sc.nextLine();

            // q 또는 Q이면 종료
            if (key.toLowerCase().equals("q")) break;
        }

        // TCP 서버 종료
        stopServer();
    }

    // startServer() 메소드가 실행되면 Thread 부여
    public static void startServer() {
        // 스레드 Thread : 실행 단위
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    serverSocket = new ServerSocket(50001);
                    System.out.println("[서버 시작]");
                    while (true) {
                        System.out.println("\n[서버] 연결 요청을 기다립니다.\n");

                        // 연결 수락
                        Socket socket = serverSocket.accept();

                        // 연결된 클라이언트의 IP 정보 얻기
                        InetSocketAddress ia = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("[서버] " + ia.getAddress() + " : " + ia.getPort() + " 연결 수락");

                        // 연결 끊기
                        socket.close();
                        System.out.println("[서버] 연결 종료");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start(); // 스레드 업무 시작 -> run() 동작
    }

    public static void stopServer() {
        try {
            serverSocket.close();
            System.out.println("[서버 종료]");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
