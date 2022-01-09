package ch01;

class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + "," + author;
    }
}

public class BookTest {

    public static void main(String[] args) {

        Book book = new Book("데미안", "헤르만 헤세");

        System.out.println(book);
        // ch01.Book@49e4cb85 -> ch01.Book : 클래스 이름, @49e4cb85 : JVM이 정해주는 가상메모리 주소

        String str = new String("test");
        System.out.println(str); // 결과가 'test'로 잘 나오는 이유는 toString이 자동으로 오버라이딩 됐다.
        System.out.println(str.toString());
    }
}
