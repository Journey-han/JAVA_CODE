package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {
    public static void main(String[] args) {

        // FileInputStream fis = null;

        // 이렇게 선언 시 자동으로 close된다. AutoCloseable하게 선언
        try (FileInputStream fis = new FileInputStream("FileTest.txt")) {
            System.out.println("read");

            // 읽을 때 예외.
        } catch (FileNotFoundException e) {
            e.printStackTrace();

            // close될 때 예외.
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
