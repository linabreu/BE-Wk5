package week5;

public class AsteriskLogger implements Logger {
	
	public void log(String logString)
	{
		System.out.println("***" + logString + "***");
	};
	public void error(String logError)
	{
		System.out.println("****************");
		System.out.println("***ERROR: " + logError+ " ***");
		System.out.println("****************");
	};

}
