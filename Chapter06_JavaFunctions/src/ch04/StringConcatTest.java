package ch04;

public class StringConcatTest {
    public static void main(String[] args) {

        String s1 = "SOLAR SYSTEM";
        String s2 = "SUPER STARS";
        StringConCatImpl strImpl = new StringConCatImpl();
        strImpl.makeString(s1, s2);
        int i = 100;

        // StringConcat의 클래스가 생략 된 것이다. 내부적으로 익명 클래스가 생성되어있기 때문이다.
        StringConcat concat = (s, v)->System.out.println("2. " + s + ",,," + v ); //System.out.println(i);
        concat.makeString(s1, s2);
        i = 300;

        // 익명클래스
        StringConcat concat2 = new StringConcat() {

            @Override
            public void makeString(String s1, String s2) {

                System.out.println("3. "+ s1 + "...." + s2 );
            }
        };

        concat2.makeString(s1, s2);

    }
}
