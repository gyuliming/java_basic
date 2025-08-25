package java_advanced_01.day20.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//문제 : 3명의 학생 (김철수,21,3.5), (이영희,22,3.9) (박민수, 20,3.2) 학생 정보를 students.dat파일에 저장하고 다시 읽어 출력 ex)
// 반 총점 = 10.6  반 평균 = 3.5 (소수 첫째자리 표현)을 출력하고 학생정보를 나이순으로 콘솔에 출력하세요
//학생정보
// 박민수 , 20세
// 김철수 , 21세
// 이영희 , 22세
public class Prob16 {
    public static void main(String[] args) throws Exception {
        String fileName = "students.dat";

        List<Student> students = Arrays.asList(
                createStudent("김철수", 21, 3.5),
                createStudent("이영희", 22, 3.9),
                createStudent("박민수", 20, 3.2)
        );

        int size = students.size();

        double total = 0.0;
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            for (int i = 0; i < size; i++) {
                dos.writeUTF(students.get(i).getName());
                dos.writeInt(students.get(i).getAge());
                dos.writeDouble(students.get(i).getScore());
                total += students.get(i).getScore();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        double avg = total / size;

        List<Student> studentList = new ArrayList<>();

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            for (int i = 0; i < size; i++) {
                    String name = dis.readUTF();
                    int age = dis.readInt();
                    double score = dis.readDouble();
                    studentList.add(new Student(name, age, score));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.printf("총점 : %.1f, 평균 : %.1f\n", total, avg);
        studentList.stream()
                .sorted()
                .forEach(s -> System.out.println(s.getName() + ", " + s.getAge()));
    }

    public static Student createStudent(String name, int age, double score) {
        return Student.builder()
                .name(name)
                .age(age)
                .score(score)
                .build();
    }
}
