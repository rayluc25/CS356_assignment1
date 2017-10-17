import java.util.ArrayList;

class SingleChoiceQuestion extends Question {

	// SingleChoiceQuestion allows for one possible answer to be submitted
	
	protected SingleChoiceQuestion(String question, ArrayList<String> answers) {
		super(question, answers);
	}

	//Upper limit of answers possible is 1
	@Override
	protected int getLimit() {
		return 1;
	}

}
