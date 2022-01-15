package ch16;

import java.io.*;
import java.net.Socket;

public class BufferedStreamTest {
    public static void main(String[] args) {

        long millisecond = 0;
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy2.zip"))){

            millisecond = System.currentTimeMillis();

            int i;
            while( ( i = bis.read()) != -1){
                bos.write(i);
            }

            millisecond = System.currentTimeMillis() - millisecond;

        }catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println(millisecond + " milliseconds 소요되었습니다.");

//        Socket socket = new Socket();
//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            br.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}

