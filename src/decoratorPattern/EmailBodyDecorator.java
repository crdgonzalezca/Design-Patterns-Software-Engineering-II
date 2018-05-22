package decoratorPattern;

public abstract class EmailBodyDecorator implements EmailBody{

	private EmailBody body;
	
	public EmailBodyDecorator(EmailBody body) {
		this.body = body;
	}
	
	@Override
	public void loadBody() {
		body.loadBody();
	}
}
