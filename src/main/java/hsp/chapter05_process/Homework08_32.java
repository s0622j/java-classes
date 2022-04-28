package hsp.chapter05_process;

public class Homework08_32 {
    //编写一个main方法
    public static void main(String[] args) {
		/*
		求出1-1/2+1/3-1/4…..1/100的和
		思路分析
		1. 1-1/2+1/3-1/4…..1/100 = (1/1)-(1/2)+(1/3)-(1/4)...1/100
		2. 从上面的分析我们可以看到
		(1) 一共有100数 ， 分子为1 , 分母从1-100
		(2) 还发现 当分母为奇数时，前面是 +, 当分母是偶数时，前面是-
		3. 我们可以使用 for + 判断即可完成
		4. 把结果存放到 double sum
		5. 这里有一个隐藏的陷阱，要把 公式分子 1 写出1.0 才能得到精确的小数
		 */

        double sum = 0;
        for(int i = 1; i <= 100; i++) {
            //判断是奇数还是偶数，然后做不同的处理
            if( i % 2 != 0) {//分母为奇数
                sum += 1.0/i;
            } else { //分母我偶数
                sum -= 1.0/i;
            }
        }

        System.out.println("sum=" + sum);


    }
}
