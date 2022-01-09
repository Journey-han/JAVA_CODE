package ch15;

public class BookShelfTest {
    public static void main(String[] args) {

        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("해리포터:마법사의 돌");
        bookQueue.enQueue("해리포터:비밀의 방");
        bookQueue.enQueue("해리포터:아즈카반의 죄수");
        bookQueue.enQueue("해리포터:불의 잔");
        bookQueue.enQueue("해리포터:불사조 기사단");
        bookQueue.enQueue("해리포터:혼혈 왕자");
        bookQueue.enQueue("해리포터:죽음의 성물");

        System.out.println(bookQueue.getSize());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
    }
}
