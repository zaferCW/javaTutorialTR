package ch27_Abstraction.abstract02;

public class Dikdortgen extends Sekil{

    private double uzunKenar;
    private double kisaKenar;

    public Dikdortgen(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    public double getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(double kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    @Override
    public double alanHesapla() {
        return kisaKenar * uzunKenar;
    }

    @Override
    public double cevreHesapla() {
        return 2 * (uzunKenar + kisaKenar);
    }
}
