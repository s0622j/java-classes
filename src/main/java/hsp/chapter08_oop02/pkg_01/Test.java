package hsp.chapter08_oop02.pkg_01;

import hsp.chapter08_oop02.modifier_02.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        //在不同包下，可以访问public 修饰的属性或方法
        //但是不能访问 protected ,默认，private修饰的属性或方法
        System.out.println(a.n1);

        a.m1();
        //不能访问 a.m2() a.m3() a.m4()
    }
}
