package java_advanced_01.day21.jsonEx;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateJsonEx {

    public static void main(String[] args) {
        // 1. JSON 객체 생성
        JSONObject root = new JSONObject();

        // 2. 속성 추가
        root.put("id", "sgl");
        root.put("name", "송규림");
        root.put("pw", "1234");

        // 3. 복합 속성 추가
        JSONObject tel = new JSONObject();
        tel.put("home", "010-1111-2222");
        tel.put("mobile", "010-1234-5678");
        root.put("tel", tel);

        JSONArray skill = new JSONArray();
        skill.put("JAVA");
        skill.put("HTML");
        skill.put("JPA");
        root.put("skill", skill);

        // 4. JSON 얻기
        String json = root.toString();

        // 5. 콘솔에 출력
        System.out.println(json);

        // 6. 파일에 출력

        Path path = Paths.get("C:/study/java_basic/src/java_advanced_01/day21/JsonEx/sgl.json");
        try (Writer writer = new FileWriter(String.valueOf(path), Charset.forName("UTF-8"))) {
            writer.write(json);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
