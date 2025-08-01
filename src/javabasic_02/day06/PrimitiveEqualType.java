package javabasic_02.day06;

// --, != 연산자는 변수의 값이 같은지, 아닌지를 조사
// 참조 타입 변수의 값은 객체의 주소(번지)이므로
// 참조 타입 변수의 ==, != 비교는 주소값을 비교하는 것

public class PrimitiveEqualType {

    public static void main(String[] args) {
        // 정수형 배열 arr1, arr2, arr3 선언
        int[] arr1;
        int[] arr2;
        int[] arr3;

        // 정수형 배열 arr1, arr2, arr3의 메모리 생성
        arr1 = new int[3];
        arr2 = new int[3];
        arr3 = new int[3];

        // 배열의 길이 출력
        System.out.println(arr1.length);
        System.out.println(arr2.length);
        System.out.println(arr3.length);

        arr1[0] = 1;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        // arr3에 차례차례 1, 2, 3을 할당하고, 결과 확인
        arr3[1] = 2;
        arr3[0] = 1;
        arr3[2] = 3;

        System.out.println("=================");
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println("=================");

        // for문을 통해 처리 (itar : 자동완성)
        for (int i = 0; i < arr3.length; i++) {
            int i1 = arr3[i];
            System.out.print(i1 + " ");
        }

        System.out.println();
        System.out.println("=================");

        // 향상된 for문(iter)
        for (int i : arr3) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("=================");

        // arr3에 값을 차례로 itar, iter 방식을 통해서 5, 6, 7 값을 할당하고, 할당한 값을 iter, itar 방식으로 확인
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = 5 + i;
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        System.out.println();

        for (int i : arr3) {
            System.out.print(i + " ");
        }

        // 주소값 확인 및 비교
        System.out.println("=================");
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);
        System.out.println("=================");
        System.out.println(arr1 == arr2);
        System.out.println(arr2 == arr3);
        System.out.println(arr3 == arr1);

        System.out.println("======= 주소값 복사하여 다른 참조변수에 할당 =======");
        arr2 = arr3;
        System.out.println("======= 주소값 비교 =======");
        System.out.println(arr2 == arr3); // true

        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println("\n=================");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }


    }
}
