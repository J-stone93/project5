package reference;

public class Ex1 {

	public static void main(String[] args) {
		
		Subject math = new Subject("수학", 85);
		
		Subject korean = new Subject("국어", 100);
		
		Student student1 = new Student(1001, "둘리", math, korean);
		
		
		
		
	}

}

class Subject {
	
	String subjectName; //과목
	
	int scorePoint; // 점수

	public Subject(String subjectName, int scorePoint) {
		super();
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}
	
}

class Student {
	
	int studentID;
	
	String studentName;
	
	Subject math; // 수학 과목
	
	Subject korean; // 국어 과목

	public Student(int studentID, String studentName, Subject math, Subject korean) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.math = math;
		this.korean = korean;
	}
	
}






