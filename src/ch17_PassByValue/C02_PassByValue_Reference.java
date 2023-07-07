package ch17_PassByValue;

public class C02_PassByValue_Reference {
    public static void main(String[] args) {
        //  task -> verilen fiyat için %11  %22 ve %33  indirimli  fiyatı print
        //  eden methodlar  create ediniz.

        double fiyat = 100;

        System.out.println("method call oncesi fiyat " + fiyat); //100

        System.out.println("indir11(fiyat) = " + indir11(fiyat)); //indir11(fiyat) = 89.0
        System.out.println("indir22(fiyat) = " + indir22(fiyat)); // indir22(fiyat) = 78.0
        System.out.println("indir33(fiyat) = " + indir33(fiyat));  //indir33(fiyat) = 67.0

        System.out.println("method call sonrasi fiyat " + fiyat); // 100

    }
    private static double indir33(double fiyat) {
        return fiyat *= 0.67 ;
    }
    private static double indir22(double fiyat) {
        return fiyat *= 0.78 ;
    }
    private static double indir11(double fiyat) {
        return fiyat *= 0.89 ;
    }
}
