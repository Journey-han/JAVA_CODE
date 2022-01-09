package ch23;

import java.util.ArrayList;
import ch21.Book;

public class ArrayListTest {
    public static void main(String[] args) {

        // 어떤 객체를 넣을 건지. <제네릭>으로
        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("해리포터:마법사의 돌", "J.K.롤링"));
        library.add(new Book("해리포터:비밀의 방", "J.K.롤링"));
        library.add(new Book("해리포터:아즈카반의 죄수", "J.K.롤링"));
        library.add(new Book("해리포터:불의 잔", "J.K.롤링"));
        library.add(new Book("해리포터:불사조 기사단", "J.K.롤링"));

        // size() : 개수. Not length.
        for(int i = 0; i < library.size(); i++) {
            library.get(i).showBookInfo();
        }

    }
}
