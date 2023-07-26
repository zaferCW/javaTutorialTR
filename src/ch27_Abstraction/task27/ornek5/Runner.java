package ch27_Abstraction.task27.ornek5;

public class Runner {
    public static void main(String[] args) {
        Isci mrb1=new Isci();
        mrb1.maasBilgisi();//Agam marabalar cay-cüğara hariç günde 8 saat kürek mahkumu :(
        mrb1.maasHesapla();//agam marabalara en çok yeymiye 499 gayme verilir..
        mrb1.name="EbuBekir Güzel insan :-) ";
        System.out.println("mrb1.name = " + mrb1.name);//mrb1.name = EbuBekir Güzel insan :-)
        mrb1.sigorta();//abs ch26_Exceptions.ch30_final_finaly_finalize.Parent class'daki conc meth obj ile call -> Agam özel sigorta kapsamındasın :)

        IdariPersonel cncCdr = new IdariPersonel();

        cncCdr.name="Dilek orjiklerin efendisi :) ";
        System.out.println("cncCdr.name = " + cncCdr.name);//cncCdr.name = Dilek orjiklerin efendisi :)
        cncCdr.sigorta();//agam cıncık coder personel full sigorta
        cncCdr.maasHesapla();//Agam frapan idarecimize saatine $120 gayme verilir :)
        cncCdr.maasBilgisi();//Agam cıncık code yazan idari personele ekistiradan bir ikramiye :)

    }
}
