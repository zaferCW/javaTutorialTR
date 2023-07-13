package ch20_Constructor;

public class C06_Ogrenci {//POJO class

    //fields
    String isim = "Zeynep hanim";
    int yas;
    String name;
    int age;

    public C06_Ogrenci(String isim, int yas) {
     //   this.isim = isim;
     //   this.yas = yas;
        ///this'leri yoruma aldigimiz icin zeynep hanim (default deger)
        // olur diye
        // dusunmustum ben fatih

     isim = isim;
     yas =yas;

     name = isim;
     age = yas;

        System.out.println("pojo icinden isim = "+isim);//furkan
        System.out.println("pojo icinden this.isim = "+this.isim);//zeynep
        System.out.println("pojo icinden name = " +name);//furkan
    }

    public C06_Ogrenci() {
    }
}
