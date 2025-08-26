package java_advanced_01.day21.serialize;

// 자바는 메모리에 생성된 객체를 파일 또는 네트워크로 출력할 수 있다.
// ObjectInputStream(바이트 스트림과 연결되어 객체로 복원하는 역직렬화)
// ObjectOutputStream(바이트 스트림과 연결되어 객체를 직렬화)

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.Arrays;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private transient int age; // transient 키워드는 직렬화 대상에서 필드를 제외한다.
    public static int counter = 0; // static 필드는 직렬화 대상에서 제외
}

@NoArgsConstructor
@AllArgsConstructor
@Data
class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private String pname;
    private int price;
}

public class ObjectInOutEx {

    public static void main(String[] args) throws Exception {
        // 1. C:Temp/object.dat 의 파일객체에 파일입력 스트림 객체 생성
        FileOutputStream fos = new FileOutputStream("C:/study/java_basic/src/java_advanced_01/day21/serialize/object.dat");

        // 2. 생성된 파일입력 스트림 객체에 객체출력 스트림 객체를 끼우기
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 3. 객체 생성
        User user = new User("신세계", 20);
        Product product = new Product("노트북", 1500000);
        int[] arr1 = {10, 20, 30};
        List<Product> productList = Arrays.asList(product);

        // 4. 위 4개의 객체를 object.dat 파일에 저장
        oos.writeObject(productList);
        oos.writeObject(product);
        oos.writeObject(user);
        oos.writeObject(arr1);

        // 5. 버퍼 비우고 닫기
        oos.flush();
        oos.close();
        fos.flush();
        fos.close();

        // 역직렬화
        // try-catch-resources : close() 필요 X, 자동으로 자원을 반환해줌
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/study/java_basic/src/java_advanced_01/day21/serialize/object.dat"))) {
            while (true) {
                Object obj = ois.readObject();
                System.out.println(obj);
            }
        } catch (EOFException e) {
            System.out.println("파일의 끝");
        }

    }
}
