package Team_mission_v1;

import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class SortedStudent {
    private HashMap<String, Student> studentInfo = new HashMap<>();
    private TreeSet<Student> studentTreeSet;

    public SortedStudent() {
        loadObjectFromFile();
        createTreeSet();
        printResult();
        outputObject();
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

    // 2. Comparator 구현으로 TreeSet 구성/정렬(평균 오름차순, 평균 같으면 이름 등 보조 키)로 정렬
    private void createTreeSet() {
        Comparator<Student> comparator = Comparator
                .comparingDouble(Student::getAverage)
                .thenComparing(Student::getName);

        studentTreeSet = new TreeSet<>(comparator);
        studentTreeSet.addAll(studentInfo.values());
    }

    // 3. 정렬 결과 콘솔 확인(선택)
    private void printResult() {
        if (studentInfo.isEmpty()) {
            System.out.println("데이터가 존재하지 않습니다.");
            return;
        }
        System.out.println("[정렬 및 저장 : 평균 오름차순]");
        System.out.println("불러온 학생 수 : " + studentInfo.size());
        System.out.println("정렬 규칙: 평균 ASC, 평균 동률이면 이름 사전순 ASC\n");
        System.out.println("저장 대상(미리보기 상위 10명):");

        int count = 1;
        for (Student student : studentTreeSet) {
            if (count > 10) break; // 상위 10명까지만 출력
            System.out.printf("- %s (평균 %.1f)\n", student.getName(), student.getAverage());
            count++;
        }
    }

    // 4. orderByAvg.dat 저장
    private void outputObject() {
        File newFile = new File("C:/Temp/orderByAvg.dat");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(newFile))) {
            oos.writeObject(studentTreeSet);
            System.out.println("\n결과 파일: " + newFile.getPath()); // 위치 가져오기
            System.out.println("[완료] 정렬된 결과를 파일로 저장했습니다.");
        } catch (IOException e) {
            System.out.println("[오류] 파일 저장 실패 : " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        new SortedStudent();
    }
}
