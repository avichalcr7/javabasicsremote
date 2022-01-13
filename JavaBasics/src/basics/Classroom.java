package basics;

public class Classroom {
	public static void main(String[] args) {
		Student Avichal= new Student();
		Student bStudent =new Student(1,"Pathak");
		Employee someEmployee =new Employee();
		System.out.println(Avichal.id);
		bStudent.display();
	}

}
