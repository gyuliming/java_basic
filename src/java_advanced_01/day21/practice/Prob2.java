package java_advanced_01.day21.practice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

import java.io.*;
import java.util.Arrays;
import java.util.List;

@ToString
@AllArgsConstructor
@Builder
class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    private String title;
    private int price;

}

public class Prob2 {
    public static Book createBook(String title, int price) {
        return Book.builder()
                .title(title)
                .price(price)
                .build();
    }

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                createBook("자료구조", 20000),
                createBook("알고리즘", 30000),
                createBook("네트워크", 15000)
        );

        String FileName = "C:/study/java_basic/src/java_advanced_01/day21/practice/books.dat";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FileName))) {
            for (Book book : books) {
                oos.writeObject(book);
            }
        } catch (FileNotFoundException e) {
            System.out.println("경로를 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("입출력 오류발생");
        } catch (Exception e) {
            System.out.println("예외 발생");
        }


        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FileName))) {
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
