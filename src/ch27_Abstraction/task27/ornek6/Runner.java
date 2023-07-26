package ch27_Abstraction.task27.ornek6;

public class Runner {
    public static void main(String[] args) {
        Baklava b = new Baklava();
        b.madeIn();//agam baklava yerli ve milli hat-lis 27 ayar ayıntap malı
        b.taste();//good sugar  sweet
        System.out.println("b = " + b);

        SezarSalad ss=new SezarSalad();
        ss.taste();//Agam salatanı gavurdağı çoban söğüş mü verelim :)
        ss.madeIn();//Agam sezar yemiş biz bakmışız çok da şeey etme İtaly



    }
}
