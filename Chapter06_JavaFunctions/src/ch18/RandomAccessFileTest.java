package ch18;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {

        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");

        rf.writeInt(100);
        // pos : 파일 포인터 위치
        System.out.println("pos: " + rf.getFilePointer());
        rf.writeDouble(3.14);
        System.out.println("pos: " + rf.getFilePointer());
        rf.writeUTF("안녕하세요.");
        System.out.println("pos: " + rf.getFilePointer());

        // 안쓰면 오류난다.
        rf.seek(0);
        System.out.println("pos: " + rf.getFilePointer());

        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println("pos: " + rf.getFilePointer());
        System.out.println(i);
        System.out.println(d);
        System.out.println(str);
    }
}
