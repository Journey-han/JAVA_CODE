package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
                                                        // throws : 예외를 미루겠다.
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        // 예외는 이 메서드 안에서 일어 날 수 있지만, 핸들링은 수행문에서 하지 않고 메서드를 쓰는 쪽에서 핸들링 하겠다.

        FileInputStream fis = new FileInputStream(fileName);

        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {

        ThrowsException test = new ThrowsException();

        try {
            test.loadClass("FileTest.txt", "abc");
        } catch (ClassNotFoundException | FileNotFoundException e) {
            System.out.println(e);
        }
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        } catch (ClassNotFoundException e) {
//            System.out.println(e);
//        } catch (Exception e) {   최상위 예외 처리. 모든 익셉션의 디폴트. 맨 처음에 쓰면 안된다.
//            System.out.println(e);
//        }
        System.out.println("end");
    }
}
