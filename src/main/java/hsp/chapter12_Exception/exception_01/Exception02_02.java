package hsp.chapter12_Exception.exception_01;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author shenjie
 * @version 1.0
 */
public class Exception02_02 {
    public static void main(String[] args) {

        try {
            FileInputStream fis;
            fis = new FileInputStream("d:\\aa.jpg");
            int len;
            while ((len = fis.read()) != -1) {
                System.out.println(len);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
