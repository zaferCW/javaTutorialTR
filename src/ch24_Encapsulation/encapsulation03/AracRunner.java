package ch24_Encapsulation.encapsulation03;

public class AracRunner {
    public static void main(String[] args) {
        Arac arac1 =
                new Arac("Tesla","blue",900,-2023);

        Arac arac2 =
                new Arac("Audi","black",2000,-2015);


        Arac arac3 = new Arac();
        arac3.setModel("Merso");
        arac3.setRenk("red");
        arac3.setMotor(800);
        arac3.setYil(1923);

        System.out.println("arac1 = " + arac1);
        System.out.println("arac2 = " + arac2);
        System.out.println("arac3 = " + arac3);


    }
}
