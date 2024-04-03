package reference.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		
		Book book1 = new Book("자바프로그래밍", 30000, "한빛소프트", 200);
		Book book2 = new Book("스프링", 20000, "한빛소프트", 300);
		Book book3 = new Book("바닐라스크립트", 15000, "한빛소프트", 300);
		
		Member member1 = new Member(1001, "장원석", book1, book2, book3);
		
	}

}

class Book {
	
	String title;
	int price;
	String publisher;
	int page;
	
	public Book(String title, int price, String publisher, int page) {
		super();
		this.title = title;
		this.price = price;
		this.publisher = publisher;
		this.page = page;
	}
	
}
class Member {
	
	int memberID;
	String memberName;
	Book book1;
	Book book2;
	Book book3;
	
	public Member(int memberID, String memberName, Book book1, Book book2, Book book3) {
		super();
		this.memberID = memberID;
		this.memberName = memberName;
		this.book1 = book1;
		this.book2 = book2;
		this.book3 = book3;
	}
	
	
	
	
}





