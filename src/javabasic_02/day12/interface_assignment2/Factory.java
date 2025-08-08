package javabasic_02.day12.interface_assignment2;

public abstract class Factory {
    String name;
    int openHour; // 공장가동시각 h
    int closeHour; // 공장종료시각 h

    Factory(String name, int openHour, int closeHour) {
        this.name = name;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }

    String getFactoryName() {
        return name;
    }

    int getWorkingTime() {
        return closeHour - openHour; // 공장 운행 시간
    }

    abstract int makeProducts(char skill);

}
