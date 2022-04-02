
public class MoodAnalyzer {
	private String message;

	public MoodAnalyzer(String message) {
		super();
		this.message = message;
	}

	public String analyseMood() {
		if (message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";

	}
}
