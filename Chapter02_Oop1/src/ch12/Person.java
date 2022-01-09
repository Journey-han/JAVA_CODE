package ch12;

public class Person {

    String name;
    int age;

    public Person() {

        // this() 이전에 다른 statement 사용 안된다.
        // name = "aaa";

        // 값 초기화
        this("Unkown", 1);
    }

    // 얘가 호출이 끝나야 인스턴스 생성이 끝이 난다.
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showPerson() {
        System.out.println(name + ","+ age);
    }

    public Person getPerson() {
        return this;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Compose";
        p.age = 29;

        Person person =  new Person();
        person.showPerson();
        Person p2 = p.getPerson();
        System.out.println(p);
        System.out.println(p2);
    }
}
