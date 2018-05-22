package structuralPatterns.decoratorPattern;

public class Christmas extends EmailBodyDecorator{

	private String card;
	
	public Christmas(EmailBody body) {
		super(body);
	}
	
	public void loadBody(){
		super.loadBody();
		this.card = "Merry Christmas!";
		System.out.println(this.card);
	}
	
}
