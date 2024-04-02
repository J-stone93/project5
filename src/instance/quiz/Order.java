package instance.quiz;


public class Order {

	
	int orderNum = 1111;
	
	String date = "2018년 3월 12일";
	
	String name = "장원석";
	
	String address = "서울시 영등포구 여의도동 20번지";
	
	public void showOrderInfo() {
		System.out.println("주문번호: " + orderNum + " 주문날짜: " + date + " 주문자: " + name + " 배송지: " + address);
	}
	
	

}
