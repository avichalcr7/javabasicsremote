package basics;

public class Classroom {
	public static void main(String[] args) {
		System.out.println("students are from "+ Student.COLLEGE_NAME);
		int agr=Student.calculateAggregate(10, 30);
		Student Avichal= new Student();
		Student bStudent =new Student(1,"Pathak");
		Employee someEmployee =new Employee();
		System.out.println(Avichal.id);
		bStudent.display();
	}

}
