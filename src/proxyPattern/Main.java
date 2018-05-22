package proxyPattern;

public class Main {
	public static void main(String[] args) {
		Car car = new ProxyCar("Red");
		
		car.startCar();
		System.out.println("");
		
		car.startCar();
	}
}
