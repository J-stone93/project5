package instance.quiz;

public class Book {
		
		String tille;
		
		int price;
		 
		String publisher;
		
		int page;
		
		public void showBookInfo() {
			System.out.println("제목: " + tille + " 가격: " + price + " 출판사: " + publisher + " 페이지수: " + page);
		}
	
}
