package javabasic_02.day12.interface_assignment1;

public abstract class AnimalTest {

	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		Chicken cheatableChicken = new Chicken(5);

		for (int i = 1; i < 4; i++) {
			System.out.printf("%d시간 후\n", i);
			dog.run(i);
			chicken.run(i);
			if (cheatableChicken instanceof Object) cheatableChicken.fly();
			else cheatableChicken.run(i);
			System.out.printf("개의 이동거리=%.1f\n", dog.getDistance());
			System.out.printf("닭의 이동거리=%.1f\n", chicken.getDistance());
			System.out.printf("날으는 닭의 이동거리=%.1f\n", cheatableChicken.getDistance());
		}

	}

}












