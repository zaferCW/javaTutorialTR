package ch27_Abstraction.abstract_polymorphism01;

public abstract class AbstractClass {//parent class
    public static void byLinkText(){//concrete method
        System.out.println("Link text super");
    }
    public  void get(){//concrete method
        System.out.println("chrome ");
    }
    abstract void absMethod();
}
class Test extends AbstractClass{
    public static void byLinkText(){//concrete method
        System.out.println("Link text sub class");
    }
    public  void get(){//concrete method
        System.out.println("fire fox ");
    }
    @Override
    void absMethod() {
        System.out.println("abs methood override edildi");
    }
    public static void test(){
        System.out.println("test methiod");
    }
    public static void main(String[] args) {
        Test.byLinkText();//Link text sub class
        AbstractClass.byLinkText();//Link text super

     //   AbstractClass obj = new AbstractClass();
//'AbstractClass' is abstract; cannot be instantiated

        AbstractClass obj = new Test();  //polymorphism kullanilarak create edilen obje
        obj.absMethod(); ////abs methood override edildi
        obj.get();  //fire fox
    }
}
