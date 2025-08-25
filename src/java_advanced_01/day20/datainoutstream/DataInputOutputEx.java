package java_advanced_01.day20.datainoutstream;

import java.io.*;

public class DataInputOutputEx {

    public static void main(String[] args) throws Exception {
        // 데이터 입출력 객체 생성
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        fos = new FileOutputStream("primitive.db");
        dos = new DataOutputStream(fos);

        dos.writeUTF("송규림");
        dos.writeInt(10);
        dos.writeDouble(1.1);
        dos.writeBoolean(true);

        dos.flush();
        dos.close();
        fos.close();

        // DataInputStream 객체 생성
        FileInputStream fis = null;
        DataInputStream dis = null;

        fis = new FileInputStream("primitive.db");
        dis = new DataInputStream(fis);

        String name = dis.readUTF();
        int num1 = dis.readInt();
        double num2 = dis.readDouble();
        boolean b = dis.readBoolean();
        System.out.println(name + " " + num1 + " " + num2 + " " + b);

        dis.close();
        fis.close();
    }
}
