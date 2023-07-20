package ch25_Inheritance.task02;

public class Runner {
    public static void main(String[] args) {

       Runner run=new Runner();
       run.myMethod();

    }

    public void myMethod(){

        SubClass obj2 = new SubClass();
        obj2.goster();

//        SuperClass obj1=new SuperClass();
//        obj1.goster();


     //   System.out.println("Sub classtaki eleman "+obj2.num);

    //    System.out.println("Super classtaki eleman"+obj1.num);

        // bu satirlarin yoruma alinmasinin sebebi child class da ki goster
      //  methodunun icerisinde yazilmasindan dolayi


    }
}
