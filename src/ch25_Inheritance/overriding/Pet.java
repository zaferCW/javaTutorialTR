package ch25_Inheritance.overriding;

public class Pet extends Animal {

    public Pet() {
        System.out.println("pet den seamlar petshop herturlu hayvaniniz bakim yapilir");
    }
    public void beslenme(){
        System.out.println("mama ile besleyin kuru ekmek vermeyin");
    }
    public void uyuma(){
        System.out.println("uygun ortamlarda uyutun");
    }

/**
'hareket()' in 'ch25_Inheritance.overriding.Pet'
clashes with 'hareket()' in 'ch25_Inheritance.overriding.Animal';
 attempting to assign weaker access privileges ('protected');
 was 'public'
 */
// CTE   @Override
//    protected void hareket() {
//        super.hareket();
//    }


    @Override
    public void icme() {//parent class da access mod. protected
                        //child da access mod. level yukselditildi
        System.out.println("overriding icmme methodu Pet class dan");

    }
    private void privateMethod(){
        //miras alinamaz
        System.out.println("pet clsss in private methodu");
    }

    int number = 104;
    int age = 101;
    int numberOfPets = 201;

    @Override
    public String toString() {
        return "Pet{" +
                "number =" + number +
                ", age=" + age +
                ", numberOfPets=" + numberOfPets +
                '}';
    }
}
