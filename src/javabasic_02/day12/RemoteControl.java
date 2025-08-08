package javabasic_02.day12;

public interface RemoteControl {
    // 최대 볼륨은 30이다.
    public static final int MAX_VOLUME = 30;

    // 최소 볼륨은 0이다.
    public static final int MIN_VOLUME = 0;

    public void turnOn(); // 전원 켜기

    public void turnOff(); // 전원 끄기

    public void setVolume(int volume); // 볼륨 조정 기능

    public void setMute(boolean mute);

    // 디폴트 인스턴스 메소드
//    default void setMute(boolean mute) {
//        if (mute) {
//            System.out.println("무음");
//            setVolume(MIN_VOLUME);
//        } else {
//            System.out.println("무음 해제");
//        }
//        coolDown();
//    }

    // 정적 메소드
    static void changeBattery() {
        System.out.println("리모콘 건전지를 교환합니다.");
        // 정적 필드, private static method 호출 및 접근 가능
        System.out.println(RemoteControl.MIN_VOLUME);
        // setMute(true); 인스턴스 메소드, 디폴트 메소드, private 메소드 호출 불가
    }

    private void coolDown() {}

}
