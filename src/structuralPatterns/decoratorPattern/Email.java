package structuralPatterns.decoratorPattern;

public class Email implements EmailBody{

	@Override
	public void loadBody() {
		System.out.println("Loading email body.");
	}
	
}
