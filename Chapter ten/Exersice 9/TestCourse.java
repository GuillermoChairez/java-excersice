public class TestCourse{
	public static void main(String[] args) {
		Course c = new Course();

		for(int i = 0; i < 25; i++){
			c.addStudent(Integer.toString(i));
		}

		while(!c.empty()){
			System.out.println(c.dropStudent());
		}
	}
}