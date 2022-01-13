package ch04;

public class TestStringConcat {
    public static void main(String[] args) {

        String s1 = "SOLAR SYSTEM";
        String s2 = "SUPER STARS";
        StringConCatImpl concat1 = new StringConCatImpl();
        concat1.makeString(s1, s2);
        int i = 100;

        StringConcat concat2 = (s, v)->System.out.println("2. " + s + "," + v ); //System.out.println(i);
        concat2.makeString(s1, s2);
        i = 300;

        StringConcat concat3 = new StringConcat() {

            @Override
            public void makeString(String s1, String s2) {

                System.out.println("3. "+ s1 + "," + s2 );
            }
        };

        concat3.makeString(s1, s2);

    }
}
