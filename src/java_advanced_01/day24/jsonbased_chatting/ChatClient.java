//package java_advanced_01.day24.jsonbased_chatting;
//
//import java.io.IOException;
//import java.net.Socket;
//
//// 클라이언트가 Socket 객체를 생성하면서 서버의 IP 주소와 포트번호로 연결을 요청한다.
//// 서버가 해당 포트에서 대기 중이면 ServerSocket 이 accept() 로 연결을 수락한다.
//
//public class ChatClient {
//
//    public static void main(String[] args) {
//        try (Socket socket = new Socket("localhost", 50001)) {
//
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
