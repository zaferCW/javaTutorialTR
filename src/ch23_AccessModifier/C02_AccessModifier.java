package ch23_AccessModifier;


import ch23_AccessModifier.newPackage.C03_AccessModifier;

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


        C01_AccessModifier obj2  = new C01_AccessModifier();

    //    System.out.println("obj2.objPrivate = " + obj2.objPrivate);


        C03_AccessModifier obj3 = new C03_AccessModifier();

        System.out.println("obj3.publicName = " + obj3.publicName);

   //CTE     obj3.protectedName  = 55;
        //protectedName' has protected access in
        // 'ch23_AccessModifier.newPackage.C03_AccessModifier'

    }
}
