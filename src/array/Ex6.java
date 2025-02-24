package array;

public class Ex6 {

	public static void main(String[] args) {
		// 클래스의 인스턴스도 배열로 사용할 수 있음
		Book[] book = new Book[3];

		for (int i = 0; i < 3; i++) {
			System.out.print(book[i] + " ");
		}
		System.out.println();
		
		//아무것도 안 넣은 채 사용하면 null값이라 사용할 수 없다는 예외가 뜸
		//객체 배열은 바로 사용할 수 없고 인스턴스를 생성해서 지정해야한다.
//		book[0].showInfo();
		
		book[0] = new Book("1984", "조지 오웰");
		book[1] = new Book("태백산맥", "조정래");
		book[2] = new Book("인간 실격", "다자이 오사무");
		
		for (int i = 0; i < 3; i++) {
			System.out.print(book[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i<book.length;i++) {
			book[i].showInfo();
		}
	}

}

class Book {
	String title;
	String author;

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public void showInfo() {
		System.out.println("책의 제목 :" + title + "  지은이 : " + author);
	}
}