package api.lang.object;

/* 참조변수가 참조하고 있는 인스턴스의 실제타입 알아보기 위해 instanceof 연산자 사용
 * 연산자의 결고로는 true , false 하나를 리턴 
 */

public class InstanceofDemo {

	public static void main(String[] args) {

		FireCar fireCar = new FireCar();
		Ambulance ambulance = new Ambulance();

		InstanceofDemo test = new InstanceofDemo();
		test.doWork(fireCar);
		test.doWork(ambulance);
	}

public void doWork(Car c) {
		if (c instanceof FireCar) {
			FireCar f = (FireCar) c;

		} else if (c instanceof Ambulance) {
			Ambulance a = (Ambulance) c;
			a.driver();
			a.Siren();
			a.stop();
		}
	}
}

class Car{
	String color;
	int door;

	void driver() {
		System.out.println("운전중 ");
	}

	void stop() {
		System.out.println("스톱 !! ");
	}

}

class FireCar extends Car {
	void ShootWater() {
		System.out.println("물 살포 ");
	}
}

class Ambulance extends Car {
	void Siren() {
		System.out.println("싸이렌 울리면서 고고씽");
	}
}
