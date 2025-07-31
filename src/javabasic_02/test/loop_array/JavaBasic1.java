package javabasic_02.test.loop_array;

public class JavaBasic1 {
    public static void main(String[] args) {
        String grade = "B";

        int result = 100 - 20;

        int score1 = 0;
        switch (grade) {
            case "A" -> score1 = 100;
            case "B" -> score1 = result;
            default -> score1 = 60;
        }
        System.out.println(score1);
    }
}
