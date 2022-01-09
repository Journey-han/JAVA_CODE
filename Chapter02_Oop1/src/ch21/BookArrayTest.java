package ch21;

public class BookArrayTest {
    public static void main(String[] args) {

        // 책이 5개 잡혀있는 것이 아니다.
        Book[] library = new Book[5];

        // new로 객체 선언하면 초기화가 된다. 정수는 0, 실수는 0.0, 객체는 null로 초기화.

//		for(int i=0; i<library.length; i++) {
//			System.out.println(library[i]);
//		}

        library[0] = new Book("해리포터:마법사의 돌", "J.K.롤링");
        library[1] = new Book("해리포터:비밀의 방", "J.K.롤링");
        library[2] = new Book("해리포터:아즈카반의 죄수", "J.K.롤링");
        library[3] = new Book("해리포터:불의 잔", "J.K.롤링");
        library[4] = new Book("해리포터:불사조 기사단", "J.K.롤링");

        for (Book book : library) {
            System.out.println(book);
            book.showBookInfo();
        }
    }
}
