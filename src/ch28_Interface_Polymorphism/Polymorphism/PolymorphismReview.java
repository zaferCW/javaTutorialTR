package ch28_Interface_Polymorphism.Polymorphism;

class A{
    public void methodA(){
        System.out.println("method A from A Class");
    }
    public static void methodC(){
        System.out.println("method C from A class");
    }
}
class B extends A{
    public void methodA(){
        System.out.println("method A from B Class");
    }
    public void methodB(){
        System.out.println("method B from B Class");
    }
    public static void methodC(){
        System.out.println("method C from B class");
    }

}
interface E{
}
abstract class C{
}
abstract class F implements E {
}
class D extends C implements E{
}
public class PolymorphismReview {
    public static void main(String[] args) {
        A obj = new B() ;
        obj.methodA(); //method A from B Class
        obj.methodC(); // method C from A class
        //Static member 'ch28_Interface_Polymorphism.Polymorphism.A.methodC()' accessed via instance reference
        //not method statiic old iicn obje ile cagrilinca parent dan gelir child da olsa bile

        //Task
        //B class indan methodC yi call edin
        B.methodC();//method C from B class

        B obj1 = (B) new A();//bu casting hatali , calismaz
            //constructor parent ise , child class data type olamaz

        C obj2 = new D();

        E obj3 = new  D();

     //   D obj4 = new E(); //E' is abstract; cannot be instantiated



    }
}
