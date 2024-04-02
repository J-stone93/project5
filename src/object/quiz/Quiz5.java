package object.quiz;

public class Quiz5 {

	public static void add(double n1, double n2) {
		double sum = 0;
		if (n2 == 0) {
			System.out.println("나누는 수는 0이 될 수 없습니다.");
			return;
		} else {
			sum = n1 / n2;
			System.out.println(sum);
		}
	}
	
	
	public static void main(String[] args) {
		
		add(5, 2);
	}
	
}
