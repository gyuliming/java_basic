package javabasic_02.test.loop_array;

public class JavaBasic3 {

    public static void main(String[] args) {

        while (true) {
            int dice1 = (int)(Math.random() * 6) + 1;
            int dice2 = (int)(Math.random() * 6) + 1;

            System.out.printf("주사위 : (%d, %d)\n", dice1, dice2);

            if (dice1 + dice2 == 5) break;
        }

    }
}
