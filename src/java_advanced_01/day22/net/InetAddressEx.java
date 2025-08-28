package java_advanced_01.day22.net;

// 자신의 컴퓨터의 IP 주소를 얻어내는 방법

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

    public static void main(String[] args) {
        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getLocalHost();
            System.out.println("나의 IP 주소값 : " + inetAddress);
            InetAddress[] iaAdress = InetAddress.getAllByName("www.naver.com");
            for (InetAddress adress : iaAdress) {
                System.out.println(adress);
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
