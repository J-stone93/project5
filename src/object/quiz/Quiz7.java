package object.quiz;

public class Quiz7 {

//	public static void add(int n1) {
//		int sum1 = 0;
//		sum1 = n1 / 100;
//		System.out.println(sum1);
//		int sum2 = n1 - (sum1 * 100);
//		sum2 = sum1 / 10;
//		System.out.println(sum2);
//	}
	
	public static void hap(int num) {
		
		int sum = 0;
		// 1의 자리
		sum = sum + (num%10);
		
		// 10의 자리
		num = num/10;
		sum = sum + (num%10);
		
		// 100의 자리
		num = num/10;
		sum = sum + num;
		
		System.out.println(num);
	}
	
	
	public static void main(String[] args) {
		
		hap(932);
	}
	
}
