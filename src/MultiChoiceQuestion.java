import java.util.ArrayList;

class MultiChoiceQuestion extends Question {

	protected MultiChoiceQuestion(String question, ArrayList<String> answers) {
		super(question, answers);
		
	}

	@Override
	protected int getLimit() {
		return 0;
	}

	

}
