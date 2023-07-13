package ch20_Constructor.projeGiris01;

import java.time.LocalDateTime;

//task step 1
public class Kullanici {//POJO
//    Pojo class create edildiğinde fieldlar yazıldıktan sonra muhakkak yapılası gerkenler
//  1)toString methodu
//  2)pm li ve pmsiz constructar
//  3)
    String name ;
    LocalDateTime kayitZamani;

    public Kullanici(String name, LocalDateTime kayitZamani) {
        this.name = name;
        this.kayitZamani = kayitZamani;
    }

    public Kullanici() {
    }

    @Override
    public String toString() {
        return "Kullanici{" +
                "name='" + name + '\'' +
                ", kayitZamani=" + kayitZamani +
                '}';
    }
}
