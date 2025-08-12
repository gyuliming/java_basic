package javabasic_02.day12.interface_assignment2;

public abstract class Factory {
    private String name;
    private int openHour; // 공장가동시각 h
    private int closeHour; // 공장종료시각 h

    Factory() {}

    Factory(String name, int openHour, int closeHour) {
        this.name = name;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }

    String getFactoryName() {
        return this.name;
    }

    int getWorkingTime() {
        return this.closeHour - this.openHour; // 공장 운행 시간
    }

    abstract int makeProducts(char skill);

}
