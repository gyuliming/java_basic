package javabasic_02.day12.interface_assignment2;

public class TVFactory extends Factory implements IWorkingTogether {

    TVFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return ((TVFactory) partner).makeProducts('C');
    }

    @Override
    int makeProducts(char skill) {
        return switch (skill) {
            case 'A' -> getWorkingTime() * 8;
            case 'B' -> getWorkingTime() * 5;
            case 'C' -> getWorkingTime() * 3;
            default -> getWorkingTime() * 1;
        };
    }
}
