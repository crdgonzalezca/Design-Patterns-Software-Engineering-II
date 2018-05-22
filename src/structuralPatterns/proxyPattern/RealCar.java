package structuralPatterns.proxyPattern;

public class RealCar implements Car{
	private String color;
	
	public RealCar(String color){
		this.color = color;
		turnOnLights();
	}

	@Override
	public void startCar() {
		System.out.println("Starting Car with color: " + this.color);
	}
	
	public void turnOnLights(){
		System.out.println("Turning on lights.");
	}
	
}
