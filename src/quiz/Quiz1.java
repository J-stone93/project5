package quiz;

public class Quiz1 {

	public static void add(int num1, int num2) {
		
		System.out.println(num1 + "+" + num2 + "=" +(num1 + num2));
		System.out.println(num1 + "-" + num2 + "=" +(num1 - num2));
		System.out.println(num1 + "*" + num2 + "=" +(num1 * num2));
		System.out.println(num1 + "/" + num2 + "=" +(num1 / num2));
		System.out.println(num1 + "%" + num2 + "=" +(num1 % num2));
		
	}
	public static void main(String[] args) {
		
		add(10,5);
	}

}
