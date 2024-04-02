package instance.quiz;

public class Booktest {

	public static void main(String[] args) {

		Book book1 = new Book();

		book1.tille = "자바 스크립트";
		book1.price = 20000;
		book1.publisher = "한빛소프트";
		book1.page = 300;
		book1.showBookInfo();
		System.out.println("인스턴스 주소:" + book1);
		
		System.out.println();
		
		Book book2 = new Book();

		book2.tille = "스프링";
		book2.price = 15000;
		book2.publisher = "한빛소프트";
		book2.page = 250;
		book2.showBookInfo();
		System.out.println("인스턴스 주소:" + book2);
	}

}
