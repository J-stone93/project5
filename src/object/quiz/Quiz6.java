package object.quiz;

public class Quiz6 {

	public static void add(int n1, int n2, char n3) {
		int sum = 0;
		if (n3 == '+') {
			sum = n1 + n2;
			System.out.println(sum);
		} else if (n3 == '-') {
			sum = n1 - n2;
			System.out.println(sum);
		} else if (n3 == '*') {
			sum = n1 * n2;
			System.out.println(sum);
		} else {
			sum = n1 / n2;
			System.out.println(sum);
		}
	}
	
	
	public static void main(String[] args) {
		
		add(10, 2, '/');
	}
	
}
