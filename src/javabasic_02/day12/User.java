package javabasic_02.day12;

public class User {

    public static void main(String[] args) {
        RemoteControl rc ;
        rc = new Television();
        rc.turnOn();
        rc.setVolume(10);
        rc.setVolume(11);
        rc.setMute(true);
        rc.setMute(false);

        RemoteControl.changeBattery(); // 정적 메소드 수행

//        RemoteControl rc2;
//        rc2 = new Cleaner();
//
//        rc2.turnOn();
//        ((Cleaner)rc2).clean();
//        rc2.turnOff();

        // public static final은 타입.상수명 (=정적 변수는 클래스로 직접 접근)
        // TV의 최대 볼륨 확인
        System.out.println(RemoteControl.MAX_VOLUME);
        // TV의 최소 볼륨 확인
        System.out.println(RemoteControl.MIN_VOLUME);

    }

}
