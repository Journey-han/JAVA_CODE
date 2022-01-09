package ch21;

public class ObjectCopy2 {
    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("해리포터:마법사의 돌", "J.K.롤링");
        library[1] = new Book("해리포터:비밀의 방", "J.K.롤링");
        library[2] = new Book("해리포터:아즈카반의 죄수", "J.K.롤링");
        library[3] = new Book("해리포터:불의 잔", "J.K.롤링");
        library[4] = new Book("해리포터:불사조 기사단", "J.K.롤링");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for (int i = 0; i < library.length; i++) {
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());

        }

        library[0].setAuthor("베르나르 베르베르");
        library[0].setTitle("고양이");


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
    }
}
