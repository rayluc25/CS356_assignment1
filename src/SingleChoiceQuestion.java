import java.util.ArrayList;

class SingleChoiceQuestion extends Question {

	protected SingleChoiceQuestion(String question, ArrayList<String> answers) {
		super(question, answers);
	}

	@Override
	protected int getLimit() {
		return 1;
	}

}
