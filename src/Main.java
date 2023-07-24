



    class Sekil {//parent class
        void ciz(){
            System.out.println("bir sekil cizeceksin");
        }
        void sekil(){
            System.out.println("bir sekil cizen method ");
        }
    }
    class Daire extends Sekil{//child1
        void ciz(){
            System.out.println("bir daire cizeceksin");
        }
        void daire(){
            System.out.println("bir daire cizen method ");
        }
    }
    class Kare extends Sekil {//child2
        void ciz() {
            System.out.println("bir kare cizeceksin");
        }
        void kare() {
            System.out.println("bir kare cizen method ");
        }
    }
    public class Main {
        public static void main(String[] args) {

            Sekil sekil =new Sekil();
            Sekil daire =new Daire();
            Sekil kare =new Kare();

            sekil.ciz();
            sekil.sekil();

            daire.sekil();
            daire.ciz();
            //CTE  daire.daire(); //Cannot resolve method 'daire' in 'Sekil'

            kare.sekil();
            kare.ciz();
            //CTE   kare.kare(); //Cannot resolve method 'kare' in 'Sekil'

   /*
        Sekil d1 = new Daire(); ifadesi, Sekil sınıfının bir örneğini oluşturur ve ona Daire sınıfının bir
         örneğini atar. Bu durumda, d1 değişkeni Sekil sınıfının bir örneğine referans eder, ancak bu örnek
         Daire sınıfının bir örneğidir. Bu durumda, d1 değişkeni yalnızca Sekil sınıfının metotlarına erişebilir,
          ancak Daire sınıfına özgü metotlara erişemez.

Daire d2 = new Daire(); ifadesi, Daire sınıfının bir örneğini oluşturur ve ona d2 değişkeni referans eder.
Bu durumda, d2 değişkeni Daire sınıfının bir örneğine referans eder ve hem Sekil sınıfının hem de Daire
sınıfının metotlarına erişebilir.

The difference between d1 and d2 is their data types. d1 is declared as Sekil, which is the parent class of Daire,
while d2 is declared as Daire, which is the actual class of the object. As a result, d1 can only access the methods
 and properties that are defined in the Sekil class, even if it refers to a Daire object. On the other hand, d2
 can access all the methods and properties defined in both the Daire and Sekil classes, since it is a Daire object.
         */





    }

}
