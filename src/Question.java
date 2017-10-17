import java.util.ArrayList;

abstract class Question {
	// Question object has unmodifiable question and answers members
	private final String question;
	
	private final ArrayList<String> answers;
	
	//abstract method getLimit allows subclass questions to set the upper limit
	//of possible answers
	protected abstract int getLimit();
	
	// Constructor sets question and answers
	protected Question(String question, ArrayList<String> answers) {
		this.question = question;
		this.answers = answers;
	}

	// Getter methods for question and answers
	protected String getQuestion() {
		return question;
	}
	
	protected ArrayList<String> getAllAnswers() {
		return answers;
	}

}
