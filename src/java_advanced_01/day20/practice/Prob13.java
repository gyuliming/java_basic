package java_advanced_01.day20.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//문제 : 정수 100, 실수 3.14, 문자열 "Java" , 불리언 true 를 data.dat에 저장하고 다시 읽어 콘솔에 출력하세요
public class Prob13 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("data.dat");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(100);
        dos.writeDouble(3.14);
        dos.writeUTF("Java");
        dos.writeBoolean(true);

        dos.flush();
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("data.dat");
        DataInputStream dis = new DataInputStream(fis);

        int num1 = dis.readInt();
        double num2 = dis.readDouble();
        String str = dis.readUTF();
        boolean b = dis.readBoolean();

        System.out.println(num1 + " " + num2 + " " + str + " " + b);
    }
}
