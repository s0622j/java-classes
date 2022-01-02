import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

        CC c = new CC();
        c.isJ(1);
        System.out.println(c.isJ(2));

        c.P(5,7,'*');

        System.out.println(c.showScore("小明", 0.3,21.2,22.4));
        double[] sc = {56,78,23,44,56,90};
        System.out.println(c.showScore("小红", sc));

        Scanner scanner = new Scanner(System.in);
    }
}

class  CC {

    public boolean isJ (int a){
        return a % 2 != 0;
    }

    public void P (int a , int b ,char c){

        for (int i = 0 ; i < a ; i++){
            for (int j = 0 ; j < b ; j++){
                System.out.print(c);
            }
            System.out.println(" ");
        }

    }

    	/*
	有三个方法，分别实现返回姓名和两门课成绩(总分)，
	返回姓名和三门课成绩(总分)，返回姓名和五门课成绩（总分）。
	封装成一个可变参数的方法
	 */

    //分析1. 方法名 showScore  2. 形参(String ,double... ) 3. 返回String
    //听课小伙伴，老师要求必须自己动手写

    public String showScore (String name , double... sc){
        double totalSc = 0;
        for (int i = 0 ; i < sc.length ; i++){
            totalSc += sc[i];
        }
        return name + ":总分" + totalSc;
    }

}