package hsp.chapter13.date_09;

import java.time.Instant;
import java.util.Date;

/**
 * @author shenjie
 * @version 1.0
 */
public class Instant_05 {
    public static void main(String[] args) {

        //1.通过 静态方法 now() 获取表示当前时间戳的对象
        Instant now = Instant.now();
        System.out.println(now);
        //2. 通过 from 可以把 Instant转成 Date
        Date date = Date.from(now);
        //3. 通过 date的toInstant() 可以把 date 转成Instant对象
        Instant instant = date.toInstant();

    }
}
