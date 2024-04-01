package quiz;

public class Quiz2 {

	public static int add(int n1, int n2) {

		if (n1 > n2) {
			return n1;
		} else if (n1 == n2) {
			return n1;
		} else {
			return n2;
		}

	}

	public static void main(String[] args) {
		
		int result1 = add(1,2);
		int result2 = add(1,4);
		int result3 = add(6,6);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
