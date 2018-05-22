package decoratorPattern;

public class Main {
	public static void main(String[] args) {
		EmailBody email = new Christmas(new NewYear(new Email()));
		email.loadBody();
		
	}
}
