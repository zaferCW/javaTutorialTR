package ch27_Abstraction.abstract02;

public abstract class Sekil {

    private String name;

    public Sekil() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double alanHesapla();//abs. meth
    public abstract double cevreHesapla();//abs. meth

    public String ciz(){
        return name + "isimli sekliniz ciziliyor";
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' +
                "\n sekil alani : "+this.alanHesapla()+
                "\n sekil cevresi : " +this.cevreHesapla()+
                "\n cizilecek sekil : "+this.ciz()+
                '}';
    }
}
