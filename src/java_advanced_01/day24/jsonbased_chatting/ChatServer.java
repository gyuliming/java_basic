//package java_advanced_01.day24.jsonbased_chatting;
//
//import org.json.*;
//
//import java.io.IOException;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class ChatServer {
//    ServerSocket serverSocket; // 클라이언트의 연결 요청 수락
//    // 100개의 클라이언트가 동시에 채팅할 수 있도록 스레드 풀을 만들어서 운영 : 재사용성
//    ExecutorService threadPool = Executors.newFixedThreadPool(100);
//    // 통신용 SocketClient 를 관리하는 동기화된 Map 컬렉션
//    Map<String, SocketClient> chatRoom = new ConcurrentHashMap<>(new HashMap<>()) {
//    };
//
//    // 메소드 : 서버 시작, 채팅 서버가 시작할 때 가장 먼저 호출되는 메소드
//    // 50001번 Port 에 바인딩하는 ServerSocket 을 생성하고 작업 스레드가 처리할 Runnable 을 람다식 () -> {...} 제공
//    public void start() throws IOException {
//        serverSocket = new ServerSocket(50001);
//        System.out.println("서버 시작");
//
//        Thread thread = new Thread(() -> {
//            try {
//                while (true) { // 람다식이 하는 일을 개발자가 지정
//                    Socket socket = serverSocket.accept(); // 1. accept() 로 연결을 수락
//                    SocketClient client = new SocketClient(this, socket); // 2. 통신용 SocketClient 를 반복해서 생성
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            } catch (Exception e) {
//                e.getMessage();
//            }
//        });
//        thread.start();
//    }
//
//    // 메소드 : 클라이언트 연결 시 SocketClient 을 생성하고 Map 에 추가 하는 기능
//    public void addSocketClient(SocketClient socketClient) {
//        String key = socketClient.chatName + "@" + socketClient.clientIp; // 클라이언트 정보를 이용하여 고유 key 생성
//        chatRoom.put(key, socketClient);
//        System.out.println("입장> " + key);
//        System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
//    }
//
//    // 메소드 : 클라이언트 연결 종료 시 SocketClient 제거
//    public void removeSocketClient(SocketClient socketClient) {
//        String key = socketClient.chatName + "@" + socketClient.clientIp;
//        chatRoom.remove(key);
//        System.out.println("퇴장> " + key);
//        System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
//    }
//
//    // 메시지 브로드캐스트 기능 : JSON 메시지를 생성하여 채팅방에 있는 모든 클라이언트에게 보내는 기능 구현
//    public void sendToAll(SocketClient sender, String message) {
//        JSONObject root = new JSONObject();
//        root.put("clientIp", sender.clientIp);
//        root.put("chatName", sender.chatName);
//        root.put("message", message);
//        String json = root.toString(); // { "clientIp": "xxx.xxx.xx.11"
//                                        // "chatName": "gyulim",
//                                        // "message" : "hello hi" }
//        // Collections<SocketClient> 얻은 후 모든 SocketClient 로 하여금
//        // send() 로 JSON 메시지를 보내게 한다.
//        Collections<SocketClient> clients = chatRoom.values();
//        for(SocketClient client : clients) {
//            if (client == sender) continue;
//            client.send(json);
//        }
//    }
//
//    // 서버종료 : stop()
//    public void stop() {
//        try {
//            serverSocket.close();
//            threadPool.shutdown();
//            chatRoom.clear();
//            System.out.println("서버 종료");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
////    public static void main(String[] args) {
////
////
////        try (ServerSocket serverSocket = new ServerSocket(50001)) {
////            while (true) {
////                Socket socket = serverSocket.accept();
////
////            }
////
////        } catch (IOException e) {
////            System.out.println(e.getMessage());
////        }
////    }
//}
