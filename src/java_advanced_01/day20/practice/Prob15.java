package java_advanced_01.day20.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//문제 : 학생 이름 "신세계" 나이 25 학점 3.8 을 student.dat파일에 저장하고 다시 읽어 콘솔에 출력하세요
public class Prob15 {
    public static void main(String[] args) throws Exception {
        String fileName = "student.dat";
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeUTF("신세계");
            dos.writeInt(25);
            dos.writeDouble(3.8);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            String name = dis.readUTF();
            int age = dis.readInt();
            double grade = dis.readDouble();

            System.out.printf("이름 : %s, 나이 : %d, 학점 : %.1f", name, age, grade);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
