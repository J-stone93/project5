package constructor.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		
		Book book1 = new Book("스프링부트", 30000, "한빛출판사", 200);
		
		Book book2 = new Book("자바프로그래밍", 10000, "금빛출판사", 300);

	}

}
class Book {
	String title;
	int price;
	String publisher;
	int page;
	
	public Book() {
		super();
	}

	public Book(String title, int price, String publisher, int page) {
		super();
		this.title = title;
		this.price = price;
		this.publisher = publisher;
		this.page = page;
	}
	
	
	
}