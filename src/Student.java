
class Student {

	// Students have a unique, unmodifiable id

	private final String id;

	// Constructor sets student id
	protected Student(String id) {
		this.id = id;
	}

	// Getter method to retrieve id
	protected String getId() {
		return id;
	}

}
