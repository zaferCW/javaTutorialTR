package ch28_Interface_Polymorphism.Interface;

public class C06_Passat extends C02_VolksWagen
        implements C03_DisDonanim,C04_IcDonanim,C05_Lastik {

    @Override
    public void motor() {
        System.out.println("2.0 olmali");
    }

    @Override
    public void yakit() {
        System.out.println("dizel blue motion");
    }

    @Override
    public void kapi() {
        System.out.println("5 kapi orjinal asiret kasa");
    }

    @Override
    public void kaporta() {
        System.out.println("boyasiz degisensiz kursunlu");
    }

    @Override
    public void koltuk() {
        System.out.println("kumas bej renk");
    }

    @Override
    public void klima() {
        System.out.println(" iki klima ");
    }

    @Override
    public void ebat() {
        System.out.println("18 inc derin genis");
    }

    @Override
    public void jant() {
        System.out.println("celik jant");
    }
}
