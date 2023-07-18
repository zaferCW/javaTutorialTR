package ch24_Encapsulation.encapsulation05;

import java.util.Scanner;

public class Main {
    /*
      step 1 ->  Burada iki adet class olsun. Biri Main, diğeri ise student ,
        student classı içinde;
      step 2 -> String name(isim) ve int age(yaş)  variables(değişkenler) encapsulated ediniz.

        Main classın içinde;
      step 3 ->  girilen değerleri aşagıdaki gibi print eden code create ediniz
        Örnek:
        age 12'dir.
        name Steven'dır.

        name(isim) olarak;
        "Student name is Steven"
        ve
        age(yaş) olarak da;
        "He is 12 years old"
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name");
        String name = input.nextLine();

        System.out.println("enter your age");
        int age = input.nextInt();

        Student obj = new Student(name , age);

        System.out.println("obj = " + obj);



    }
}//class sonu


class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student name is "+name + "\n"+
                "He-She is " + age + " years old";
    }

    /*
     "Student name is Steven"
        ve
        age(yaş) olarak da;
        "He is 12 years old"
     */
}
