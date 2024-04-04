package hiding;

public class Quiz3 {

	public static void main(String[] args) {
	
		MyDate3 myDate = new MyDate3();
		
		myDate.setMonth(13);
		myDate.setDay(30);
		System.out.println(myDate.getMonth() + "월" + myDate.getDay() + "일 입니다.");

	}

}
class MyDate3 {
	
	private int month;
	
	private int day;

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		
		if(month < 1 || month > 12) {
			System.out.println("잘못된 월입니다.");
			return;
		}
		
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	
}