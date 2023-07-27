package ch28_Interface_Polymorphism.Interface;

public interface C01_Interface {

    /*
    INTERFACE....

        			INTERFACE ASLA BİR CLASS DEGİLDİR. INTERFACE INTERFACE'dir.

        1) Interface yapilarda concrete method asla create! edilemezdi java 8' e kadar . sadece  abstract method'lar
        creat edilir.
        TRICK :)
        JAVA 8’e kadar interface’de  “body’li concrete method” tanımlanamazdı. JAVA 8 ile bu özellik update edildi.
              Method access modifier public olduğu halde “default”  keyword method type olarak kullanılmaz ise CTE verir.

        TRICK :)
             Concrete method’da “default”  keyword yerine “static” keyword de kullanılabilir ama hem “default” hem de “static” keyword  birlikte kullanılamaz…
            Buradaki “static” keyword interface özel bir keyword’dur aynı package’deki başka class’dan class name ile
             method call edilemez.
            Default veya static keyword’u ile tanımlanan method’lar concrete olduğu için override yapılması zorunlu değildir.

        TRICK :)  Concrete method’da “default method”  obje ile “static method”  method name ile call edilir


        2) Java multiple inheritance desteklemez. Ancak interface parent'ler multiple inheritance'i destekler

        3)Birden fazla parent class'larda ayni isimli methodlarin olmasi durumunda child class ayni isimli
          farkli bodyli methodlar icin seçim yapamaz. fakat İnterface'lerde methodlarin bodyleri olmadigindan
          ayni isimli methodlar birbiriyle tamamen ayni oldugu icin secim soz konusu olmaz ve child class parent
          inteface'den  ayni isimli methodlardan birini override ederek bu sorun  cozulur

          Ahan da trick : Parent ınterface'lerde ayni isimli fakat farkli return type'li
           methodlar child class'ta CTE verir.

        4) Interface yapilarda tum body'siz methodlar abstract olmak zorunda oldugundan method signiture "abstract"
           keywordu yazilmayabilir.


            public abstract void koltuk();-->abstract method abstract keyword kullanilmis
        	public void ayna();           -->abstract method abstract keyword kullanilmamis

        5) Interface'lerdeki tum member'lar public oldugu icin  AccesModifier  yazilmasa da public ile ayni islemi yapar.
           public void ayna(); <-->  void ayna();  ---> ayni islemi yaparlar.

          Trick :  normal class'larda AccMod yazilmazsa default olur.Ancak Interface'lerde AccMod yazilmazsa public olur

        6) Interface'ler kendi arasinda parent child (extends) iliskisi kurabilir.
           Interface'leri bir class'a parent yapmak icin "implements" keywordu kullanilir.
           Class'lari bir class'a parent yapmak icin "extends" keywordu kullanilir.

          class --> class  : extends
          interface --> interface  : extends
          class --> interface  : implements
          interface --> class  :O-LA-MAZZZ.. interface'in parent'i class olamaz...

         7)Interface'lerde tum veriable'lar mutlaka final'dir.
         	Final veriable'ler italik bold'dur ve buyuk harf ile yazilmali
         	public static final String kumas="kadife"; <--> String kumas="kadife";

         	b)Final veriable'ler initialize edilmezse CTE verir.
         8)Interface'lerde veriable'lar mutlaka static'dir. Dolayisiyle obj create etmeden(zaten edemezsin)
          interface ismi ile ulasilabilir.

         9)*****Interface'lerde tum member'lar public'tir.
         Dolayisiyle tum interface veriable'leri -->public+static+final (yazsa da yazmasa da )

          TRİCK :
         Ayni isimli ve ayni data type'li variable'lar parent interface'lerde creat edip  object kullanarak call edilirse
         Java hangisini sececegine karar veremez ve CTE verir. CTE almamak icin ayni isimli variable'lar kesinlikle
         interface" isimleri kullanarak call edilmelidir.

        	System.out.println(S1.RENK);-->CTE verir

        10)Interface yapilarda istenirse abstract olmayan concrete method creat edilebilir.
             a)AccMod'den sonra "default" veya "static" keyword kullanilmali.ikisi br arada kullanılamaz
             b)Interface yapilarda concrete method icin kullanilan "default" keyword'u kesinlikle  AccMod turunu vermez .
             c)Interface yapilarda concrete method child class tarafindan override edilmek zorunda degildir.
             d)Interface yapilarda "default" olarak creat edilen concrete method child class'ı ancak obj ile call edilir.
             e)Interface yapilarda "static" olarak creat edilen concrete method child class'ı ancak
             Datatype(interface name) ile  call edilir.

        11) Interface yapilarda istenirse main method tanımlanabilir ama bad practice
     */


    public static void main(String[] args) {
        System.out.println("sakin denemeyin iyi bisey degil");
    }




}
