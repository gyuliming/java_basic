package java_advanced_01.day21.practice;

import lombok.Builder;
import lombok.ToString;

import java.io.*;

@ToString
@Builder
class Student implements Serializable {
    private String name;
    private int grade;
}

public class Prob3 {
    public static Student createStudent(String name, int grade) {
        return Student.builder()
                .name(name)
                .grade(grade)
                .build();
    }

    public static void main(String[] args) {
        Student st1 = createStudent("학생1", 100);
        Student st2 = createStudent("학생2", 80);

        String fileName = "C:/study/java_basic/src/java_advanced_01/day21/practice/students.dat";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(st1);
            oos.writeObject(st2);
        } catch (FileNotFoundException e) {
            System.out.println("경로를 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("입출력 오류발생");
        } catch (Exception e) {
            System.out.println("예외 발생");
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
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
