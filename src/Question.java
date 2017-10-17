import java.util.ArrayList;

abstract class Question {
	
	private final String question;
	
	private final ArrayList<String> answers;
	
	protected abstract int getLimit();
	
	protected Question(String question, ArrayList<String> answers) {
		this.question = question;
		this.answers = answers;
	}

	
	protected String getQuestion() {
		return question;
	}
	
	protected ArrayList<String> getAllAnswers() {
		return answers;
	}

}
