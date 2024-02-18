package week5;

public class SpacedLogger implements Logger {
	
	public void log(String logString)
	{
		String spacedString = "";
		for(int i =0; i < logString.length(); i++)
		{
			spacedString+= (logString.charAt(i) + " ");
		}
		System.out.println(spacedString);
	};
	public void error(String logError)
	{
		String spacedString = "";
		for(int i =0; i < logError.length(); i++)
		{
			spacedString+= (logError.charAt(i) + " ");
		}
		System.out.println("ERROR: " + spacedString);
		
	};

}
