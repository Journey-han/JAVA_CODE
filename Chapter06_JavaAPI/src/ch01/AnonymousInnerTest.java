package ch01;

class Outer2 {

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(final int i) {

       // final int num = 10;   // 이 메서드가 끝나도 스택에 안잡히게 final로 선언해야한다. 상수메모리에 잡히게. 값을 못바꿈.
        int num = 10;

//        class MyRunnable implements Runnable {
//
//            int localNum = 1000;
//
//            @Override
//            public void run() {
//                // i = 50; 값을 바꾸려고 하면 오류가 난다. 스택에 잡히면 안된다.그래서 위의 num을 final로 잡혀놔야 한다.
//                // num = 20;
//                // getRunnable메서드가 호출되는 시점이랑 MyRunnable 클래스의 생성 주기가 달라서
//
//                System.out.println("i = " + i);
//                System.out.println("num = " + num);
//                System.out.println("localNum = " + localNum);
//
//                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
//                System.out.println("Outer.sNum = " + Outer2.sNum + "(외부 클래스 정적변수)");
//            }
//        }
//        return new MyRunnable();
//    }
        // 굳이 위 같이 클래스 선언 안하고 바로 return으로 반환.
        return new Runnable() {

            int localNum = 1000;

            @Override
            public void run() {
                // i = 50; 값을 바꾸려고 하면 오류가 난다. 스택에 잡히면 안된다.그래서 위의 num을 final로 잡혀놔야 한다.
                // num = 20;
                // getRunnable메서드가 호출되는 시점이랑 MyRunnable 클래스의 생성 주기가 달라서

                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outer.sNum = " + Outer2.sNum + "(외부 클래스 정적변수)");
            }
        };
    }

    // 혹은 바로 반환
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable class");
        }
    };
}

public class AnonymousInnerTest {
    public static void main(String[] args) {

        Outer2 out = new Outer2();
        Runnable runner = out.getRunnable(100);

        runner.run();

        out.runnable.run();
    }
}
