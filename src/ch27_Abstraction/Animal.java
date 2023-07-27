package ch27_Abstraction;

public abstract class Animal {
    public abstract String getName();

}
/*public*/ abstract class BigCat extends Animal {
    public abstract void roar();
}
/*public*/ class Lion extends BigCat{

    @Override
    public String getName() {
        return "lion";
    }

    @Override
    public void roar() {
        System.out.println("the lion lets out a loud ROAR");
    }
}


//   AbstractClass obj = new AbstractClass();
//'AbstractClass' is abstract; cannot be instantiated

//Link text sub class
//Link text super
//polymorphism kullanilarak create edilen obje
////abs methood override edildi
//fire fox