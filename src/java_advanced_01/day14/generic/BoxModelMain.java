package java_advanced_01.day14.generic;

import java.util.ArrayList;

public class BoxModelMain {

    public static void main(String[] args) {
        // 로켓 프레시 라인, 철호가 "배추", "무", "상추", "삼겹살"를 구매 후 box에 담았다. box에 담긴 내용을 출력
        ArrayList<String> boxModel = new ArrayList<>();
        boxModel.add("배추");
        boxModel.add("무");
        boxModel.add("상추");
        boxModel.add("삼겹살");

        // 데이터 추출 후 출력
        for (String s : boxModel) {
            System.out.println(s);
        }

        BoxModel<String> box = new BoxModel<String>();
//      BoxModel<String> box = new BoxModel<>();
        box.content = new String[] {"배추", "무", "상추", "삼겹살"};

    }
}
