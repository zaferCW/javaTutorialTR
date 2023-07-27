package ch28_Interface_Polymorphism.Polymorphism;

public class Product{
    public static void main(String[] args) {
        M m = new M();  M n =new N();
        M o = new O();  O oo =new O();

        System.out.println("m.getValue(100,200) = " + m.getValue(100, 200));//20000
        System.out.println("o.getValue(100,200) = " + o.getValue(100, 200));//300
        System.out.println("oo.getValue(100,200) = " + oo.getValue(100, 200));//300
        System.out.println("n.getValue(100,200) = " + n.getValue(100, 200));//100
    }
}
class M {
    int getValue (int a , int b){
        return a* b ;
    }
}

class N extends M{
    int getValue(int a , int b){
        return b - a;
    }
}
class O extends M {
    int getValue(int a , int b){
        return b + a;
    }

}