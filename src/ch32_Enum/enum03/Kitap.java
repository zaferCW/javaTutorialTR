package ch32_Enum.enum03;

public class Kitap {
    String name;

    KitapKategori kategori;

    @Override
    public String toString() {
        return "Kitap{" +
                "name='" + name + '\'' +
                ", kategori=" + kategori +
                '}';
    }
}
