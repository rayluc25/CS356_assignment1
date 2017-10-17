import java.util.HashMap;
import java.util.Set;

public class IVoteService {
	
	private final Question question;
	
	protected final HashMap<String, Set<Integer>> studentAnswers;
	
	public IVoteService(Question question) {
		this.question = question;
		studentAnswers = new HashMap<>();
	}
	
	public void receiveVote(String studentId, Set<Integer> answers) {
		//SingleChoiceQuestion only allows one answer to be submitted
		if (question.getLimit() == 1) {
			//if student selects more than one answer, do not count
			if (answers != null && answers.size() > 1) {
				return;
			}
			else {
				studentAnswers.put(studentId, answers);
			}
		}
		//MultiChoiceQuestion can have any number of answers
		if (question.getLimit() == 0) {
			studentAnswers.put(studentId, answers);
		}
	}
	
	public void displayResults() {
		//Retrieve number of possible answers for the given question
		int numberOfAnswers = question.getAllAnswers().size();
		//Keep tally of each time an answer was selected by a student
		int [] answerStatistics = new int[numberOfAnswers];
		//Count number of votes for each possible answer
		for (String key : studentAnswers.keySet()) {
			for (Integer i : studentAnswers.get(key)) {
				answerStatistics[i]++;
			}
		}
		
		//Display the answer statistics on console
		StringBuilder storage = new StringBuilder();
		
		String separator = "";
		
		int counter = 0;
		
		for (String answer : question.getAllAnswers()) {
			storage.append(separator + answer);
			storage.append(" : ");
			separator = ", ";
			storage.append(answerStatistics[counter]);
			counter++;
		}
		
		System.out.println(storage);

		
	}

}
