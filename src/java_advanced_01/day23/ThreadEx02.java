package java_advanced_01.day23;

class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    // 동기화 메소드
    public synchronized void setMemory1(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000); // 2초간 일시 정지
        } catch (InterruptedException e) {}
            System.out.println(Thread.currentThread().getName() + " Interrupted " + this.memory);

    }

    // 동기화 블록을 포함하는 메소드
    public void setMemory2(int memory) {
        synchronized (this) {
            this.memory = memory;
            try {
                Thread.sleep(2000); // 2초간 일시 정지
            } catch (InterruptedException e) {}
            System.out.println(Thread.currentThread().getName() + " Interrupted " + this.memory);
        }
    }
}

class User1 extends Thread {
    private Calculator calculator;

    public User1() {
        setName("User1의 Thread"); // 스레드 이름변경
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory1(100); // 동기화 메소드 호출
    }
}

class User2 extends Thread {
    private Calculator calculator;

    public User2() {
        setName("User2의 Thread"); // 스레드 이름변경
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory2(50); // 동기화 메소드 호출
    }
}

// Calculator 를 생성해서 User1 과 User2 에서 사용하도록 setCalculator() 메소드를 호출하고,
// 두 스레드를 시작시키면 알아서 움직인다.

public class ThreadEx02 {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        User1 user1 = new User1();
        User2 user2 = new User2();

        user1.setCalculator(calculator);
        user2.setCalculator(calculator);

        user1.start();
        user2.start();

    }
}
