package ch25_Inheritance.overriding;


// SORU output ne olur
public class MethodOverriding {
    public static void main(String[] args) {

        X x = new X();

        Y y = new Y();

        y.m2();
        x.m1();
        y.m1();
        x = y ;
        x.m1() ;
    }
}
class X {
    public void m1() {
        System.out.println("m1 ~ X");
    }
}
class Y extends X {
    public void m1() {
        System.out.println("m1 ~ Y");
    }

    public void m2() {
        System.out.println("m2 ~ Y");
    }

}
