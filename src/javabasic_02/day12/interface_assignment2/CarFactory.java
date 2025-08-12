package javabasic_02.day12.interface_assignment2;

public class CarFactory extends Factory implements IWorkingTogether {
    CarFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return ((CarFactory) partner).makeProducts('B');
    }

    @Override
    int makeProducts(char skill) {
        return switch (skill) {
            case 'A' -> getWorkingTime() * 3;
            case 'B' -> getWorkingTime() * 2;
            case 'C' -> getWorkingTime() * 1;
            default -> 0;
        };
    }

}
