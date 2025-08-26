package java_advanced_01.day21.practice;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@ToString
@AllArgsConstructor
class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 1;
    private String name;
    private transient int age;
}

public class Prob1 {

    public static void main(String[] args) {
        Person person = new Person("홍길동", 30);

        Path path = Paths.get("C:/study/java_basic/src/java_advanced_01/day21/practice/person.dat");
        // 직렬화
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(person);
        } catch (FileNotFoundException e) {
            System.out.println("경로를 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("입출력 오류발생");
        } catch (Exception e) {
            System.out.println("예외 발생");
        }

        // 역직렬화
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) {
                System.out.println(ois.readObject().toString());
            }
        } catch (EOFException e) {
            System.out.println("파일의 끝 입니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
