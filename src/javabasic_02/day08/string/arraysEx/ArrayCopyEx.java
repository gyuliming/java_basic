package javabasic_02.day08.string.arraysEx;

import java.util.Arrays;

public class ArrayCopyEx {

    public static void main(String[] args) {
        int[] oldArray = {10, 20, 30, 40, 50};
        int[] newArray = new int[oldArray.length * 10];

        // for 문을 이용한 배열 복사
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }

        for (int i : newArray) {
            System.out.print(i + " ");
        }

        int[] systemArray1 = new int[oldArray.length * 2];

        // System.arraycopy() 복사
        System.arraycopy(oldArray, 0, systemArray1, 0, oldArray.length);
        System.out.println();

        for (int i : systemArray1) {
            System.out.print(i + " ");
        }

        int[] ArrayscopyOf = new int[oldArray.length * 2];

        ArrayscopyOf = Arrays.copyOf(oldArray, ArrayscopyOf.length);
        System.out.println(Arrays.toString(ArrayscopyOf));
    }
}
