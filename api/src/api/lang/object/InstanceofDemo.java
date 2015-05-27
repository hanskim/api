package api.lang.object;

/* ���������� �����ϰ� �ִ� �ν��Ͻ��� ����Ÿ�� �˾ƺ��� ���� instanceof ������ ���
 * �������� ���δ� true , false �ϳ��� ���� 
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
		System.out.println("������ ");
	}

	void stop() {
		System.out.println("���� !! ");
	}

}

class FireCar extends Car {
	void ShootWater() {
		System.out.println("�� ���� ");
	}
}

class Ambulance extends Car {
	void Siren() {
		System.out.println("���̷� �︮�鼭 ����");
	}
}
