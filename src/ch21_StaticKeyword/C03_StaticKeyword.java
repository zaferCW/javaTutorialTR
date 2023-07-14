package ch21_StaticKeyword;

public class C03_StaticKeyword {
    int id;
    static int mevcut;

    public C03_StaticKeyword (){
        mevcut ++;
        id += mevcut ;
    }
    public static void main(String[] args) {
        C03_StaticKeyword obj1 = new C03_StaticKeyword();
        C03_StaticKeyword obj2 = new C03_StaticKeyword();
        C03_StaticKeyword obj3 = new C03_StaticKeyword();
        C03_StaticKeyword obj4 = new C03_StaticKeyword();
        C03_StaticKeyword obj5 = new C03_StaticKeyword();

        System.out.println("obj1.id = " + obj1.id);
        System.out.println("obj2.id = " + obj2.id);
        System.out.println("obj3.id = " + obj3.id);
        System.out.println("obj4.id = " + obj4.id);
        System.out.println("obj5.id = " + obj5.id);

        System.out.println("obj1.mevcut = " + obj1.mevcut);
        System.out.println("obj2.mevcut = " + obj2.mevcut);
        System.out.println("obj3.mevcut = " + obj3.mevcut);
        System.out.println("obj4.mevcut = " + obj4.mevcut);
        System.out.println("obj5.mevcut = " + obj5.mevcut);
    }
}
