import java.util.ArrayList;

abstract class Question {
	
	private final String question;
	
	private final ArrayList<String> answers;
	
	protected abstract int getLimit();
	
	public Question(String question, ArrayList<String> answers) {
		this.question = question;
		this.answers = answers;
	}

	
	public String getQuestion() {
		return question;
	}
	
	public ArrayList<String> getAllAnswers() {
		return answers;
	}

}
