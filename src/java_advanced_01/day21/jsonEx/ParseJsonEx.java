package java_advanced_01.day21.jsonEx;

// JSON 에서 속성 순서는 중요하지 않아서 추가한 순서대로 작성하지 않아도 상관없다.
// 그리고 줄바꿈 처리도 되지 않는다. -> 장점이 됨 : 네트워크의 전송량을 줄여줌
// .json 파일을 파싱하는 방법

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ParseJsonEx {

    public static void main(String[] args) {
        Path path = Paths.get("C:/study/java_basic/src/java_advanced_01/day21/JsonEx/sgl.json");
        // 파일로부터 JSON 읽어오기
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(path), Charset.forName("UTF-8")))) {
            String json = bufferedReader.readLine();
            JSONObject root = new JSONObject(json);

            // 속성 정보 읽기
            System.out.println("아이디 : " + root.getString("id"));
            System.out.println("이름 : " + root.getString("name"));
            System.out.println("비밀번호 : " + root.getInt("pw"));
            JSONObject obj = root.getJSONObject("tel");
            System.out.println("home-tel : " + obj.getString("home"));
            System.out.println("mobile-tel : " + obj.getString("mobile"));

            JSONArray skill = new JSONArray("skill");
            for (Object o : skill) {
                System.out.println(o + " ");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
