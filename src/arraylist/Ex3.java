package arraylist;

import java.util.ArrayList;
public class Ex3 {

	public static void main(String[] args) {
		
		ArrayList<Book> list = new ArrayList<Book>();
		
		Book book = new Book("태백산맥", "조정래");
		list.add(book);
		book.showInformation();
		// 인자 : 도서타입의 참조변수
		// 인스턴스르 생성하면서 바로 추가
		list.add(new Book("데르만", "헤르만 해세"));
		list.add(new Book("어떻게 살 것인가", "유시민"));
		book.showInformation();
		
		// 리스트의 요소 꺼내기
		// get메소드의 매개변수 : index, 리턴값 : book
		Book book2 = list.get(0);
		Book book3 = list.get(1);
		Book book4 = list.get(2);
		
		for(int i = 0;i < 3; i ++) {
			Book getBook = list.get(i);
			getBook.showInformation();
		}
		
		for(Book b : list) {
			b.showInformation();
		}
		
	}
}

class Book {
	String bookName;
	String author;
	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}
	
	public void showInformation() {
		System.out.println(bookName + "," + author);
	}
}