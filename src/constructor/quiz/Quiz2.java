package constructor.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		
		Car car1 = new Car("현대", "쏘나타", "흰색", 200);
		
		Car car2 = new Car("기아", "레이", "검은색", 150);
		
		Car car3 = new Car();
		car3.brand = "벤츠";
		car3.modelName = "E클래스";
		car3.color = "빨간색";
		car3.maxSpeed = 200;
		
	}

}
class Car {
	
	String brand;
	String modelName;
	String color;
	int maxSpeed;
	
	public Car() {
		super();
	}

	public Car(String brand, String modelName, String color, int maxSpeed) {
		super();
		this.brand = brand;
		this.modelName = modelName;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
	
}