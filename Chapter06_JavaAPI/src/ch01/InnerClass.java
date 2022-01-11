package ch01;

class OutClass {

    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    class InClass {

        int iNum = 100;


        void inTest() {
            System.out.println("OutClass num = " + num + "외부 클래스의 인스턴스 변수");
            System.out.println("OutClass sNum = " + sNum + "외부 클래스의 스태틱 변수");
            System.out.println("InClass iNum = " + iNum + "내부 클래스의 인스턴스 변수");
        }
    }

    public void usingClass() {
        inClass.inTest();
    }

    // 정적 내부 클래스
    static class InStaticClass {

        int iNum = 100;
        static int sInNum = 200;

        void inTest() {
            // System.out.println("OutClass num = " + num + "외부 클래스의 인스턴스 변수");
            // 정적 클래스가 외부 클래스와 상관 없이 만들어 질 수 있어서 미리 만들어질 수 있기 때문에 외부 클래스의 인스턴스 변수는 사용할 수 없다.
            System.out.println("InClass iNum = " + iNum + "내부 클래스의 인스턴스 변수");
            System.out.println("OutClass sNum = " + sNum + "외부 클래스의 스태틱 변수");
            System.out.println("InClass iNum = " + sNum + "내부 클래스의 스태틱 변수");
        }

        static void sTest() {
            // System.out.println("InClass iNum = " + iNum + "내부 클래스의 인스턴스 변수");
            // 마찬가지로 스태딕 메서드가 인스턴스 변수와 상관없이 먼저 만들어 질 수 있기 때문에 사용할 수 없다.
            System.out.println("OutClass sNum = " + sNum + "외부 클래스의 스태틱 변수");
            System.out.println("InClass iNum = " + sNum + "내부 클래스의 스태틱 변수");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {

        // 외부 클래스 이용하여 내부 클래스 기능 호출
//        OutClass outClass = new OutClass();
//        outClass.usingClass();    // 내부 클래스 기능
//        System.out.println();
//        // 만약 InClass() 클래스가 private으로 선언되었다면 아래처럼 쓰진 못한다.
//        // 외부 클래스 변수를 이용하여 내부 클래스 생성
//        OutClass.InClass inner = outClass.new InClass();
//        inner.inTest();

        // 외부 클래스 생성하지 않고 바로 정적 내부 클래스 생성
        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();  // 정적 내부 클래스 일반 메서드 호출
        System.out.println();
        // 정적 내부 클래스의 스태틱 메서드 호출
        OutClass.InStaticClass.sTest();

    }
}


