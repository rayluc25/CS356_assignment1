import java.util.ArrayList;

class MultiChoiceQuestion extends Question {

	// MultiChoiceQuestion allows any number of answers to be submitted
	protected MultiChoiceQuestion(String question, ArrayList<String> answers) {
		super(question, answers);
		
	}

	// Upper limit of possible answers is 0, no limit
	@Override
	protected int getLimit() {
		return 0;
	}

	

}
