package java_advanced_01.day21.practice;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.*;

@ToString
@AllArgsConstructor
class Product implements Serializable {
    private String name;
    private int price;
}

@ToString
@AllArgsConstructor
class Order implements Serializable {
    private int orderId;
    private Product product;
}

public class Prob5 {
    public static void main(String[] args) {
        Product product = new Product("마우스", 20000);
        Order order = new Order(12345, product);

        String fileName = "C:/study/java_basic/src/java_advanced_01/day21/practice/order.dat";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(order);
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
