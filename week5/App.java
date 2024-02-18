package week5;

public class App {

	public static void main(String[] args) {
		AsteriskLogger asterisk = new AsteriskLogger();
		SpacedLogger spaced  = new SpacedLogger();
		
		asterisk.log("Logging with asterisks!");
		asterisk.error("Error with asterisks!");
		
		spaced.log("Logging with spaces!");
		spaced.error("Error with spaces!");
	}

}
