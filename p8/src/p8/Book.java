package p8; //4장 ppt28 this()
/*
같은 클래스의 다른 생성자 호출
생성자 내에서만 사용 가능
생성자 코드의 제일 처음에 있어야 함
 */
public class Book {
	String title;
	String author;
	void show() { System.out.println(title + "\t" + author); }

	public Book() {
		this("no_title", "no_author");
		System.out.println("인수없는 생성자 호출됨");
	}

	public Book(String title) { 
		this(title, "작자미상");
		//Book(title, "작자미상"); //error
		System.out.println("인수 1개의 생성자!");
	}
	//JAVA는 default 매개변수값 설정은 x
	public Book(String title, String author) {
		this.title = title; this.author = author;
		System.out.println("인수 2개의 생성자!");
	}

	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		Book emptyBook = new Book();
		littlePrince.show();
		loveStory.show();
		emptyBook.show();
	}

}
