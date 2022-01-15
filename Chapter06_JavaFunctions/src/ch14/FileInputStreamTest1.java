package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("input.txt");

            // 세글자 읽는다.
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());

        } catch (IOException e) {
            System.out.println(e);
        } finally{
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println(e);
            } catch (NullPointerException e){
                System.out.println(e);
            }
        }
        System.out.println("end");
    }
}
