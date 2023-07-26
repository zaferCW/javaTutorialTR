package ch27_Abstraction.task27.ornek5;

public class IdariPersonel extends Personel {
    @Override//mecbur implemen edilemli
    public void maasHesapla() {//Personel parent class'dan override abs meth.
        System.out.println("Agam frapan idarecimize saatine $120 gayme verilir :)");
    }

    @Override//mecbur implemen edilemli
    public void maasBilgisi() {//Personel parent class'dan override abs meth.
        System.out.println("Agam cıncık code yazan idari personele ekistiradan bir ikramiye :)");
    }

    @Override//tercihen override edildi
    public void sigorta() {//Personel parent class'dan override conc. meth.
        System.out.println("agam cıncık coder personel full sigorta");
    }
}
