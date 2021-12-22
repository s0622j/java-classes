import org.junit.Test;

import java.util.Scanner;

public class TestDemo {

    public static void main (String[] args){
        System.out.println("-----");

        Scanner s = new Scanner(System.in);
        System.out.println("输入------------");
        int g = s.nextInt();
        if(g == 100) {
            System.out.println("good");
        } else if (g > 80 && g <= 90){
            System.out.println("nice");
        } else if (g >= 60 && g <= 80) {
            System.out.println("一般");
        } else {
            System.out.println("bad");
        }

    }

    @Test
    public void Demo2(){
        boolean a = true;
        //if (a = false)
        if (a == false)
            System.out.println("a");
        else if (a)
            System.out.println("b");
        else if (!a)
            System.out.println("c");
        else
            System.out.println("d");
    }




}
