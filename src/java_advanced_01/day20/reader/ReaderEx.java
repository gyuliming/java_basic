package java_advanced_01.day20.reader;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx {

    public static void main(String[] args) throws Exception {
        Reader reader = null;

        // 1. 문자 하나씩 읽기
        reader = new FileReader("C:/study/java_basic/src/java_advanced_01/day20/testChar.txt");
        while (true) {
            int data = reader.read();
            if (data == -1) break;

            System.out.print((char) data);
        }

        reader.close();
        System.out.println();

        // 2. 문자 배열로 읽기
        reader = new FileReader("C:/study/java_basic/src/java_advanced_01/day20/testChar.txt");
        char[] array = new char[100];

        while (true) {
            int numRead = reader.read(array);
            if (numRead == -1) break;

            for (int i = 0; i < numRead; i++) {
                System.out.print(array[i] + " ");
            }
        }
        reader.close();




    }
}
