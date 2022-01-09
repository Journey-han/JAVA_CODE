package ch21;

public class ObjectCopy {
    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("해리포터:마법사의 돌", "J.K.롤링");
        library[1] = new Book("해리포터:비밀의 방", "J.K.롤링");
        library[2] = new Book("해리포터:아즈카반의 죄수", "J.K.롤링");
        library[3] = new Book("해리포터:불의 잔", "J.K.롤링");
        library[4] = new Book("해리포터:불사조 기사단", "J.K.롤링");

        // 복사할 객체 library의 0번지 부터 복사해서 붙여넣을 객체 copyLibrary의 0번지부터 5개 붙여 넣기
        System.arraycopy(library, 0, copyLibrary, 0, 5);

        System.out.println("== library == 원래 배열");
        for (Book book : library) {
            System.out.print(book);
            book.showBookInfo();
        }

        System.out.println("----------------------------------------");

        System.out.println("== copy library == 복사된 배열");
        for (Book book : copyLibrary) {
            System.out.print(book);
            book.showBookInfo();
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        library[0].setAuthor("베르나르 베르베르");
        library[0].setTitle("고양이");

        System.out.println("== library == 바꾼 원래 배열");
        for (Book book : library) {
            System.out.print(book);
            book.showBookInfo();
        }

        System.out.println("----------------------------------------");

        System.out.println("== copy library == 바꾼 복사된 배열");
        for (Book book : copyLibrary) {
            System.out.print(book);
            book.showBookInfo();
        }
    }
}
