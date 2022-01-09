package ch05;

public class MyListQueueTest {
    public static void main(String[] args) {

        MyListQueue listQueue = new MyListQueue();
        listQueue.enQueue("AAA");
        listQueue.enQueue("BBB");
        listQueue.enQueue("CCC");

        listQueue.printAll();

        System.out.println(listQueue.deQueue());
        System.out.println(listQueue.deQueue());
    }
}
