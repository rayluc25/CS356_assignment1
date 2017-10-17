import java.util.ArrayList;

public class SingleChoiceQuestion extends Question {

	public SingleChoiceQuestion(String question, ArrayList<String> answers) {
		super(question, answers);
	}

	@Override
	protected int getLimit() {
		return 1;
	}

}
