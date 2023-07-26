package ch27_Abstraction.abstract01;

public class Civic extends Lastik{

    /**
     * extend LAstik yazilarak Lastik class a consrete bir civic class tanimlandi
     * java CTE verdi
     * cozum olarak
     * a -> unimplemented method lar implement edilmeli
     * b -> parent Lastik class dan abstract keyword kaldirilmali
     * c -> concrete ola child Civic class abstract edilmeli
     */

    //concrete class da abstract method tanimlanir mi?  hayir
  // public abstract void absMethod();
  // Abstract method in non-abstract class

    @Override//implement edilen abs meth
    void motor() {
        System.out.println("civic icin ideal motor 1.6");
    }

    @Override
    void koltuk() {
        System.out.println("koltuklar kadife kumas");
    }

    @Override
    void kapi() {
        System.out.println("4 kapi uzun kasa");
    }

    @Override
    public void lastikEbat() {
        System.out.println("lastikler 18 inc");
    }
    public  int vites (){
        return 6;
    }
}
