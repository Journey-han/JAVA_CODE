package ch23;

import java.util.ArrayList;

class BoriLibrary {

    public ArrayList<String> shelf = new ArrayList();

    public BoriLibrary() {
        shelf.add("짱구는못말려01");
        shelf.add("짱구는못말려02");
        shelf.add("짱구는못말려03");
//        shelf.add("짱구는못말려04");
//        shelf.add("짱구는못말려05");
//        shelf.add("짱구는못말려06");
    }

    public synchronized String lendBook() throws InterruptedException {
        // 이 메서드를 수행하고 있는 현제 스레드의 정보를 가져온다.
        Thread t = Thread.currentThread();
        while (shelf.size() == 0) {
            System.out.println(t.getName() + " waiting start");
            wait();
            System.out.println(t.getName() + " waiting end");
        }

        if (shelf.size() > 0) {
            String book = shelf.remove(0);
            System.out.println(t.getName() + ": " + book + " lend ");
            return book;
        } else {
            return null;
        }
    }

    public synchronized void returnBook(String book) {
        Thread t = Thread.currentThread();

        shelf.add(book);
        notifyAll();
        System.out.println(t.getName() + ": " + book + " return ");
    }
}

class Student extends Thread {

    public Student(String name) {
        super(name);
    }

    public void run() {

        try {
            String title = LibraryMain.library.lendBook();
            if (title == null) {
                System.out.println(getName() + " 는 빌리지 못했다.");
                return;
            }
            sleep(5000);
            LibraryMain.library.returnBook(title);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class LibraryMain {

    public static BoriLibrary library = new BoriLibrary();

    public static void main(String[] args) {

        Student std1 = new Student("std1 ");
        Student std2 = new Student("std2 ");
        Student std3 = new Student("std3 ");
        Student std4 = new Student("std4 ");
        Student std5 = new Student("std5 ");
        Student std6 = new Student("std6 ");

        std1.start();
        std2.start();
        std3.start();
        std4.start();
        std5.start();
        std6.start();
    }
}
