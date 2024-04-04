package hiding;

public class Quiz1 {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		
		book1.setTitle("자바프로그래밍");
		book1.setPrice(20000);
		book1.setCompany("한빛컴퍼니");
		book1.setPage(300);
		
		System.out.println(book1.getTitle() +","+ book1.getPrice() +","+ book1.getCompany() +","+ book1.getPage());
		
		Book book2 = new Book();
		
		book2.setTitle("스프링");
		book2.setPrice(15000);
		book2.setCompany("한빛컴퍼니");
		book2.setPage(500);
		
		System.out.println(book2.getTitle() +","+ book2.getPrice() +","+ book2.getCompany() +","+ book2.getPage());
	}

}
class Book {
	
	private String title;
	
	private int price;
	
	private String company;
	
	private int page;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
	
	
	
}









