public class Course{
	private String[] students;
	private int numberOfStudents = 0;
	
	Course(){
		this.students = new String[10];
	}

	String[] getStudents(){
		return this.students;
	}
	void addStudent(String student){
		if(this.students.length <= numberOfStudents){
			String[] temp = new String[numberOfStudents*2];
			System.arraycopy(students, 0, temp, 0, students.length);
      		this.students = temp;
		}
		this.students[numberOfStudents] = student;
			numberOfStudents++;
	}

	String dropStudent(){
		numberOfStudents--;
		return this.students[numberOfStudents + 1];
	}

	void clear(){
		numberOfStudents = -1;
	}

	boolean empty(){
		return numberOfStudents == -1;
	}
}