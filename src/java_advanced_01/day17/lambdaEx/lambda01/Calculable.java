package java_advanced_01.day17.lambdaEx.lambda01;

// 함수형 인터페이스임을 보장(선택사항, 컴파일 과정에서 추상 메소드가 하나인지를 검사하기 때문에 정확한 함수형 인터페이스를 작성하는데 도와줌)
@FunctionalInterface
public interface Calculable {
    void calculate(int num1, int num2);
}
