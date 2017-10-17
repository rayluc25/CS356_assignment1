import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

class SimulationDriver {

	public static void main(String[] args) {

		// Generate a single choice question and answers, "First Question"
		String[] firstAnswer = { "2", "3", "4" };
		ArrayList<String> firstAnswers = new ArrayList<>(Arrays.asList(firstAnswer));
		Question firstQuestion = new SingleChoiceQuestion("1 + 1 = ?", firstAnswers);

		// Configure IVoteService for "First Question"
		IVoteService firstService = new IVoteService(firstQuestion);

		// Randomly generate students into ArrayList
		// Average class sizes range from 25 to 35
		int randomClassSize = ThreadLocalRandom.current().nextInt(25, 35 + 1);
		ArrayList<Student> students = new ArrayList<Student>();
		// Use UUID to create unique IDs for creating students
		for (int i = 0; i < randomClassSize; i++) {
			String uniqueID = UUID.randomUUID().toString();
			students.add(new Student(uniqueID));
		}

		// Randomly generate students answers for "First Question" and submit to
		// IVoteService
		for (Student student : students) {
			Set<Integer> selectedAnswer = new HashSet<Integer>();
			int randomAnswer = ThreadLocalRandom.current().nextInt(0, 2 + 1);
			selectedAnswer.add(randomAnswer);
			firstService.receiveVote(student.getId(), selectedAnswer);
		}

		// Call the output function for "First Question"
		firstService.displayResults();

		// Generate a multiple choice question and answers, "Second Question"
		String[] secondAnswer = { "Pepperoni", "Cheese", "Sausage" };
		ArrayList<String> secondAnswers = new ArrayList<>(Arrays.asList(secondAnswer));
		Question secondQuestion = new MultiChoiceQuestion("What is your favorite topping(s)?", secondAnswers);

		// Configure IVoteService for "Second Question"
		IVoteService secondService = new IVoteService(secondQuestion);

		// Randomly generate students into ArrayList
		// Average class sizes range from 25 to 35
		randomClassSize = ThreadLocalRandom.current().nextInt(25, 35 + 1);
		ArrayList<Student> moreStudents = new ArrayList<Student>();
		// Use UUID to create unique IDs for these next set of students as well
		for (int i = 0; i < randomClassSize; i++) {
			String uniqueID = UUID.randomUUID().toString();
			moreStudents.add(new Student(uniqueID));
		}

		// Randomly generate students answers for "Second Question" and submit to
		// IVoteService
		for (Student student : moreStudents) {
			// create a random number to decide how many times student will randomly select
			// answer
			// from no choices up to all choices
			int numberOfChoices = ThreadLocalRandom.current().nextInt(0, secondAnswers.size());
			Set<Integer> selectedAnswer = new HashSet<Integer>();
			for (int i = 0; i < numberOfChoices; i++) {
				int randomAnswer = ThreadLocalRandom.current().nextInt(0, secondAnswers.size());
				selectedAnswer.add(randomAnswer);

			}
			secondService.receiveVote(student.getId(), selectedAnswer);
		}

		// Call the output function for "Second Question"
		secondService.displayResults();
	}

}
