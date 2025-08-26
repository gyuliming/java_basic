package java_advanced_01.day21.practice;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.*;

@ToString
@AllArgsConstructor
class Account implements Serializable {
    private String owner;
    private transient int balance;

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeInt(balance);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        this.balance = ois.readInt();
    }
}

public class Prob4 {
    public static void main(String[] args) {
        Account account = new Account("철수", 10000);
        String fileName = "C:/study/java_basic/src/java_advanced_01/day21/practice/Account.dat";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(account);
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
