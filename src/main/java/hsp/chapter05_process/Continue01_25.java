package hsp.chapter05_process;

public class Continue01_25 {
    //编写一个main方法
    public static void main(String[] args) {
        //代码
        int i = 1;
        while( i <= 4) {
            i++;
            if( i == 2) {
                continue;
            }
            System.out.println("i=" + i);
        }
    }
}
