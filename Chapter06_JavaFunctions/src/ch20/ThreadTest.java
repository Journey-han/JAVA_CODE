package ch20;

class MyThread extends Thread {
    public void run() {
        int i;
        for(i = 0; i < 200; i++) {
            System.out.print(i + "\t");
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {

        // 현재 어떤 Thread가 돌고 있는지 확인할 수 있다.
        System.out.println(Thread.currentThread() + "start");
        MyThread th1 = new MyThread();
        th1.start();

        MyThread th2 = new MyThread();
        th2.start();
        System.out.println(Thread.currentThread() + "end");
        // 메인 스레드는 먼저 시작해서 끝나고 나머지 두개의 스레드가 반복적으로 돌고 있다.
    }
}
