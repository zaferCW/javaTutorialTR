package ch22_Scope;

public class C01_InstanceVariable {
 /*												INSTANCE VARIABLE

	 	1) Main method'un ve urettiginiz diger methodlarin disinda  disinda(ustunde veya altinda), class'in icinde
	 		olusturulan variable'lara "instance variable" denir.
	 	2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
	 	3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
	 		Asagida goruldugu gibi "yas" variable'ina deger atamasi yaptim "tecrube" variable'ina yapmadim.
	 		Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
	 			"yas" variable'i initialize edildi, digerleri initialize edilmedi.
	 	4) Initialize edilmeyen "instance variable" lar icin Java kendisi deger atamasi yapar.
	 		Java'nin instance variable'lara kendisinin verdigi degerlere "default value" denir.
	 				byte, short, int, long icin default value 0'dir.
	 				float, double icin default value 0.0'dir.
	 				char icin default value 0'dir.
	 				boolean icin default value false'dur.
	 				String icin default value "null" dir.

	 */

    //instance variables , fields
    int id;
    int yas = 55;
    int tecrube;
    String name;
    boolean emekliMi;
    double boy;
    char unvan ;

    public static void main(String[] args) {

       // id = 21;   Non-static field 'id' cannot be referenced from a static context

        C01_InstanceVariable object = new C01_InstanceVariable();

        object.id = 1001;
        object.emekliMi = false;
        object.name = "john";
        object.tecrube = 23;
       // object.unvan = 'aa';  oo many characters in character literal
        object.yas = 44;


        System.out.println("object.name = " + object.name);
        System.out.println("object.unvan = " + object.unvan);
        System.out.println("object.boy = " + object.boy);




    }
    public void nonStaticMethod(){
        System.out.println("static olmayan meth calisti");
        staticMethod(); // non static den static meth call edildi
    }
    public  static void staticMethod(){
        System.out.println("static olan meth calisti");
    //    nonStaticMethod();  Non-static method 'nonStaticMethod()' cannot be referenced from a static context
    }
}
