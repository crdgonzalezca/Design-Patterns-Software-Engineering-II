package structuralPatterns.proxyPattern;

public class ProxyCar implements Car{
	private String color;
	private Car car;
	
	public ProxyCar(String color){
		this.color = color;
	}

	@Override
	public void startCar() {
		if(car == null){
			car = new RealCar(color);
		}
		car.startCar();
	}
	
}
