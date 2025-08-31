package Team_mission_v1;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class StudentInput {
    // 경로 정보
    private final File file  = new File("C:/Temp/student.dat");
    // Key : 학생 이름, Value : Student 객체
    private HashMap<String, Student> studentInfo = new HashMap<>();

    public StudentInput() {
        loadCheck();
        printUsage();
        checkKeyAndInputData();
        saveData();
    }

    // 1. 기존 student.dat 유무 확인 및 로드 (없으면 신규 생성)
    private void loadCheck() {
        // 파일이 존재하면 로드
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                studentInfo = (HashMap<String, Student>) ois.readObject();
            } catch (ClassNotFoundException | IOException e) {
                System.out.println("파일 불러오기 중 오류 발생 : " + e.getMessage());
            }
            // 파일이 존재하지 않으면 생성
        } else try (FileOutputStream fos = new FileOutputStream(file)) {
            System.out.println("student.dat 파일이 없어서 새로 생성합니다.\n");
        } catch (IOException e) {
            System.out.println("파일 생성 중 오류 발생 : " + e.getMessage());
        }
    }

    // 2. 사용법/입력 안내 출력
    private void printUsage() {
        System.out.println("""
                [학생 성적 입력 프로그램]
                - 종료하려면 이름에 ^^ 를 입력하세요.
                - 점수는 0~100 사이의 정수만 허용됩니다.
                """);
    }

    // 3. 중복 이름 검사, 점수 유효성(0~100) 검사, total/average/grade 산출 후 맵에 담기
    private void checkKeyAndInputData() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.print("이름: "); String name = br.readLine().trim();

                // 이름에 숫자만 있는 경우 다시 입력받아오게 하기
                if (name.matches("\\d+")) {
                    System.out.println("이름은 문자열로 입력해주세요.\n");
                    continue;
                }

                // 이름에 ^^를 입력하면 종료
                if (name.equals("^^")) {
                    System.out.println("exit");
                    System.out.println("입력을 종료합니다.");
                    System.out.printf("[완료] %d명의 정보가 student.dat 에 저장되었습니다.\n", studentInfo.size());
                    break;
                }

                List<Integer> scores = new ArrayList<>();
                String[] subjects = {"국어", "영어", "수학", "과학"};
                boolean check = true;

                for (String subject : subjects) {
                    int score;
                    System.out.print(subject + ": ");
                    try {
                        score = Integer.parseInt(br.readLine());
                    } catch (NumberFormatException e) {
                        System.out.println("[오류] 숫자만 입력하세요.\n");
                        check = false;
                        break;
                    }
                    if (score < 0 || score > 100) {
                        System.out.println("[오류] 점수는 0~100만 입력해주세요.\n");
                        check = false;
                        break;
                    }
                    scores.add(score);
                }

                if (!check) continue;

                // 이름 중복 확인
                if (studentInfo.containsKey(name)) {
                    System.out.println("[오류] 이미 존재하는 이름입니다. 다른 이름을 입력하세요.\n");
                    continue;
                }

                Student student = new Student(name, scores);
                studentInfo.put(name, student);
                System.out.println(student.toString());
            }
        } catch (IOException e) {
            System.out.println("입력 중 오류 발생 : " + e.getMessage());
        }
    }

    // 4. ObjectOutputStream으로 studentInfo 직렬화 저장하기
    private void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(studentInfo);
        } catch (IOException e) {
            System.out.println("파일 저장 중 오류 발생 : " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new StudentInput();
    }
}
