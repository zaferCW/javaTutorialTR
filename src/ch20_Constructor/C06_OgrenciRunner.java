package ch20_Constructor;

public class C06_OgrenciRunner {
    public static void main(String[] args) {
        C06_Ogrenci ogrenci =
                new C06_Ogrenci("Furkan bey",35);

        System.out.println("-****************");
        System.out.println("ogrenci.isim = " +
                ogrenci.isim);//ogrenci.isim = Zeynep hanim

        System.out.println("ogrenci.yas = " +
                ogrenci.yas);//ogrenci.yas = 0

        System.out.println("ogrenci.age = " +
                ogrenci.age);//ogrenci.age = 35

        System.out.println("ogrenci.name = " +
                ogrenci.name);//ogrenci.name = Furkan bey


    }
}
