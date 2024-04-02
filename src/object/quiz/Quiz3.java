package object.quiz;

public class Quiz3 {

	public static int add(int n1, int n2) {
		int sum = 0;
		for(int i = n1; i <= n2; i++) {
		 sum = sum + i;
		}	
		return sum;
	}

	public static void main(String[] args) {
		
		int result1 = add(5, 10);
		System.out.println(result1);
	}
	
}
