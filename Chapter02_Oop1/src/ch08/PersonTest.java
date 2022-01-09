package ch08;

public class PersonTest {
    public static void main(String[] args) {

        Person personTomas = new Person();

        personTomas.age = 37;
        personTomas.gender = "남성";
        personTomas.height = 180;
        personTomas.weight = 78;
        personTomas.name = "Tomas";

        personTomas.PersonShowInfo();
        System.out.println(personTomas.showInfo());

    }
}
