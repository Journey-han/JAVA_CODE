package ch17;

import java.io.*;

// 이 객체가 직렬화가 가능하다.
//class Person implements Serializable {
//
//    String name;
//    String job;
//
//    public Person() {}
//
//    public Person(String name, String job) {
//        this.name = name;
//        this.job = job;
//    }
//
//    public String toString() {
//        return name + ", " + job;
//    }
//}

class Person implements Externalizable{

    String name;
    String job;

    public Person() {}

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String toString()
    {
        return name + "," + job;
    }

    // 직렬화 어떻게 할 것인지 직접 구현하기
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeUTF(job);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        job = in.readUTF();
    }
}

public class SerializationTest {
    public static void main(String[] args) {

        Person personLee = new Person("이둘리", "대표이사");
        Person personKim = new Person("김또치", "상무이사");

        // serialization. 직렬화
        try(FileOutputStream fos = new FileOutputStream("serial.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(personLee);
            oos.writeObject(personKim);

        } catch (IOException e) {
            System.out.println(e);
        }

        // deserialization. 복원
        try(FileInputStream fis = new FileInputStream("serial.txt");
            ObjectInputStream ois = new ObjectInputStream(fis)) {

            Person pLee = (Person) ois.readObject();
            Person pKim = (Person) ois.readObject();

            System.out.println(pLee);
            System.out.println(pKim);
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
