package ch27_Abstraction.abstract02;

public class Main {
    public static void main(String[] args) {

        Dikdortgen dd = new Dikdortgen(25,20);
        dd.setName("dikdortgen");
        System.out.println("dd = " + dd);


        Cember cember =new Cember(55.5);
        cember.setName("cember ");
        System.out.println("cember = " + cember);


    }
}
