package ch27_Abstraction.task27.ornek6;

public  abstract  class Salad  extends Food {


  public abstract void madeIn();//parant ve child abs. class'larda aynı isimli iki meth tanımlanabilir

public static void abikGbık(){//conc static meth isteğe göre bile override edilemez
    System.out.println("a");

}


    @Override
    public void taste() {
        System.out.println("Agam salatanı gavurdağı çoban söğüş mü verelim :) ");
    }

    public static void main(String[] args) {// overrid edilemeyen static ve concrete meth
        abikGbık();
    }

}
