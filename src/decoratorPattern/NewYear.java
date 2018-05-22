package decoratorPattern;

public class NewYear extends EmailBodyDecorator{
	
	private String message;
	
	public NewYear(EmailBody body) {
		super(body);
	}

	public void loadBody() {
		super.loadBody();
		this.message = "Happy new Year!";
		System.out.println("This is extra content for new year.");
	}
	
}
