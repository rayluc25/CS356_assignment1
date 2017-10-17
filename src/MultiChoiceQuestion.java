import java.util.ArrayList;

public class MultiChoiceQuestion extends Question {

	public MultiChoiceQuestion(String question, ArrayList<String> answers) {
		super(question, answers);
		
	}

	@Override
	protected int getLimit() {
		return 0;
	}

	

}
