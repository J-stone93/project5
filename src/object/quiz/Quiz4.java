package object.quiz;

public class Quiz4 {

	public static int add(int n1, int n2) {
		int sum = 0;
		if (n1 < n2) {
			sum = -999;
			System.out.println(sum);
		} else { 
			System.out.println(n1 - n2);
		}
		return sum;
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		int result = add(1, 999);
	}
	
}
