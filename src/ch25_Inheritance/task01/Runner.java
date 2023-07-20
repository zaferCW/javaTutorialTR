package ch25_Inheritance.task01;


public class Runner {

    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.mesaj);//obje uzerinden static olan br variable call edildi bad practice

        System.out.println(A.mesaj);//class name uzerinden static olan bir variable call edildi

        B b= new B();//B classinin pm siz const. kullanilarak mesaj variaable i
        // update edildi ve b objesi create edildi

        System.out.println(b.mesaj);//obje uzerinden static variable call edldi

        System.out.println(A.mesaj);//class name uzerinden obj call edildi



    }
}
