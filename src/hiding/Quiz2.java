package hiding;

public class Quiz2 {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.setBrand("현대");
		car1.setModelNu("소나타");
		car1.setColor("흰색");
		car1.setMaxSpeed(200);
		
		System.out.println("제조사:" + car1.getBrand() + " 모델명:" + car1.getModelNu() + " 색상:" + car1.getColor() + " 최고속도:" + car1.getMaxSpeed());
		
	}

}
class Car {
	
	private String brand;
	private String modelNu;
	private String color;
	private int maxSpeed;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModelNu() {
		return modelNu;
	}
	public void setModelNu(String modelNu) {
		this.modelNu = modelNu;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
	
}
