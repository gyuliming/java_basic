package java_advanced_01.day13.exception_assignment3;

public class CellPhone {
    String model;
    double battery;

    CellPhone(String model) {
        this.model = model;
    }

    void call(int time) {
        this.battery -= time * 0.5;
        if (this.battery <= 0) this.battery = 0;
        else if (time < 0) throw new IllegalArgumentException("통화시간입력오류");
        System.out.printf("통화 시간 : %d분\n", time);
    }

    void charge(int time) {
        this.battery += time * 3;
        if (this.battery >= 100) this.battery = 100;
        else if (time < 0) throw new IllegalArgumentException("충전시간입력오류");
        System.out.printf("충전 시간 : %d분\n", time);
    }

    void printBattery() {
        System.out.printf("남은 배터리 양 : %.1f\n", this.battery);
    }
}
