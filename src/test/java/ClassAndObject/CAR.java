package ClassAndObject;

public class CAR {

	String car_Color;
	int car_Speed;
	String car_Number;

	public String getCarDetails() {

		return ("CAR color is --->" + car_Color + "Car speed is -->" + car_Speed + "Car number is " + car_Number);

	}

	public static void main(String[] args) {

		CAR c = new CAR();

		c.car_Color = "RED";
		c.car_Number = "MH 12 1111";
		c.car_Speed = 100;

		CAR c1 = new CAR();

		c1.car_Color = "White";
		c1.car_Number = "MH 22 2222";
		c1.car_Speed = 90;

		System.out.println("Car information is -->" + c.getCarDetails());
		System.out.println("Car information is -->" + c1.getCarDetails());

	}

}
