package basics;

public class Student {
	int id;
	String name;
	boolean isMale;
	float stipend;
	static String COLLEGE_NAME="SRM";
	
	Student(){
		System.out.println("Akshat I'm about to Construct the box");
		id=0;
		name="XYZ";
	}
	Student(int i,String nam){
		id=i;
		name=nam;
	}
	void display() {
		System.out.println("name is "+name+" stipend is"+stipend);
	}
	static int calculateAggregate(int a, int b) {
		return a+b/2;
	}

}
