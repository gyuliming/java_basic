package Team_mission_v1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class StudentOutput {
    private HashMap<String, Student> studentInfo = new HashMap<>();
    private List<Student> datas = new ArrayList<>();

    public StudentOutput() {
        loadObjectFromFile();
        rearrangeData();
        printInfo();
    }

    // 1. student.dat 역직렬화 로드
    private void loadObjectFromFile() {
        File file = new File("C:/Temp/student.dat");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            studentInfo = (HashMap<String, Student>) ois.readObject();
            if (studentInfo.isEmpty()) {
                System.out.println("student.dat 파일에 데이터가 존재하지 않습니다.");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("파일 로드 중 오류 발생 : " + e.getMessage());
        }
    }

    // 2. 평균 기준 정렬(오름차순)
    private void rearrangeData() {
        if (studentInfo.isEmpty()) {
            System.out.println("student.dat 파일에 데이터가 존재하지 않습니다.");
            return;
        }
        datas.addAll(studentInfo.values());
        datas.sort(Comparator.comparingDouble(Student::getAverage));
    }

    // 3. 정렬 결과를 화면에 출력(이름/과목별 점수/총점/평균/학점)
    private void printInfo() {
        if (datas.isEmpty()) {
            System.out.println("저장된 데이터가 존재하지 않습니다.");
            return;
        }
        System.out.println("\n[평균 오름차순 성적표]\n");
        int count = 1;
        for (Student student : datas) {
            System.out.printf("%d) %s\n", count++, student.getName());
            System.out.printf("    점수: %s\n", student.getRecord());
            System.out.printf("    총점: %d, 평균: %.1f, 학점: %s\n\n", student.getTotal(), student.getAverage(), student.getGrade());
        }
    }

    public static void main(String[] args) {
        new StudentOutput();
    }
}
