package hsp.chapter07_oop01;

public class TestPerson_29 {
    //编写一个main方法
    public static void main(String[] args) {

        Person06 p1 = new Person06("mary", 20);
        Person06 p2 = new Person06("mary", 20);

        System.out.println("p1和p2比较的结果=" + p1.compareTo(p2));
    }
}

/*
定义Person类，里面有name、age属性，并提供compareTo比较方法，
用于判断是否和另一个人相等，提供测试类TestPerson用于测试,
名字和年龄完全一样，就返回true, 否则返回false

 */
class Person06 {
    String name;
    int age;
    //构造器
    public Person06(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //compareTo比较方法
    public boolean compareTo(Person06 p) {
        //名字和年龄完全一样
        // if(this.name.equals(p.name) && this.age == p.age) {
        // 	return true;
        // } else {
        // 	return false;
        // }
        return this.name.equals(p.name) && this.age == p.age;
    }
}