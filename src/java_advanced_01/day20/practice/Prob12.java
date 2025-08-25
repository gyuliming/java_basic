package java_advanced_01.day20.practice;

import java.io.*;

//문제 : 10,20,30 을 numbers.dat 파일에 저장하고 다시 읽어 콘솔에 출력하세요
public class Prob12 {
    public static void main(String[] args) throws IOException {
        // numbers.bat 파일에 정수 데이터를 써야 하므로 FileOutputStream fos 객체 생성
        FileOutputStream fos = new FileOutputStream("numbers.dat");
        // 성능을 높이기 위해서 보조 스트림 DataOutputStream 사용
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(10);
        dos.writeInt(20);
        dos.writeInt(30);

        dos.flush();
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("numbers.dat");
        DataInputStream dis = new DataInputStream(fis);

        for (int i = 0; i < 3; i++) System.out.println(dis.readInt());

        dis.close();
        fis.close();
    }
}
