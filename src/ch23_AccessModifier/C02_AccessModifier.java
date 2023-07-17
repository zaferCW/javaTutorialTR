package ch23_AccessModifier;

public class C02_AccessModifier {
    public static void main(String[] args) {

        C01_AccessModifier obj1  = new C01_AccessModifier();


    //CTE    C01_AccessModifier obj2=new C01_AccessModifier(25,55);
        //C01_AccessModifier(int, int)' has private access in 'ch23_AccessModifier.C01_AccessModifier'

        obj1.defaultYas=33;
        obj1.protectedYas = 66;
        obj1.publicYas = 55;
        System.out.println("obj1 = " + obj1);
        obj1.protectedMethod();


















    }
}
